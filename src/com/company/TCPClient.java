package com.company;

import javax.swing.*;
import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient {
    private Socket client;
    private String host;
    private int port;
    private JTextArea textAreaLog;

    public  TCPClient(String host, int port, JTextArea textAreaLog){
        this.host = host;
        this.port = port;
        this.textAreaLog = textAreaLog;
    }

    public  void connectServer(){
        try{
            client = new Socket(host,port);
            textAreaLog.append("Connect to server");
        }
        catch (UnknownHostException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    public  void sendFile(String sourceFilePath, String destinationDir){
        DataOutputStream outToServer = null;
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;


        try{
            outToServer = new DataOutputStream(client.getOutputStream());
            outToServer.writeUTF("Hello form "+ client.getLocalSocketAddress());
            FileInfo fileInfo =  getFileInfo(sourceFilePath,destinationDir);

            oos= new ObjectOutputStream(client.getOutputStream());
            oos.writeObject(fileInfo);

            ois = new ObjectInputStream(client.getInputStream());
            fileInfo = (FileInfo) ois.readObject();
            if (fileInfo!=null){
                textAreaLog.append("Send file to server"+
                        fileInfo.getStatus()+"\n");
            }

        }
        catch (IOException e){
            e.printStackTrace();
        }
        catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        finally {
            closeStream(oos);
            closeStream(ois);
            closeStream(outToServer);
        }

    }

    private  FileInfo getFileInfo(String sourceFilePath, String destinationDir){
        FileInfo fileInfo = null;
        BufferedInputStream bis= null;

        try{
            File sourceFile = new File(sourceFilePath);
            bis= new BufferedInputStream(new FileInputStream(sourceFile));
            fileInfo = new FileInfo();
            byte[] fileBytes = new byte[(int) sourceFile.length()];

            bis.read(fileBytes,0,fileBytes.length);
            fileInfo.setFilename(sourceFile.getName());
            fileInfo.setDataBytes(fileBytes);
            fileInfo.setDestinationDirectory(destinationDir);
        }
        catch (IOException e){
            e.printStackTrace();;
        }
        finally {
            closeStream(bis);
        }
        return  fileInfo;
    }
    public void closeSocket() {
        try {
            if (client != null) {
                client.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void closeStream(InputStream inputStream) {
        try {
            if (inputStream != null) {
                inputStream.close();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void closeStream(OutputStream outputStream) {
        try {
            if (outputStream != null) {
                outputStream.close();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
