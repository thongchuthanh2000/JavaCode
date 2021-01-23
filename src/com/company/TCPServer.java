package com.company;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer extends  Thread{
    private ServerSocket serverSocket;
    private  int port = 9900;

    public  static  void main(String[] args){
        TCPServer tcpServer = new TCPServer();
        tcpServer.open();
        tcpServer.start();
    }

    private void open() {
        try{
            serverSocket = new ServerSocket(port);
            System.out.println("Server is open on port"+port);

        }
        catch (IOException e ){
            e.printStackTrace();
        }
    }
    public  void run(){
        while (true){
            Socket server = null;
            DataInputStream inFormClient = null;
            ObjectInputStream ois = null;
            ObjectOutputStream oos = null;

            try{
                //chờ yêu cầu từ client
                server = serverSocket.accept();
                System.out.println("Connected to "+
                        server.getRemoteSocketAddress());

                inFormClient =  new DataInputStream(server.getInputStream());
                System.out.println(inFormClient.readUTF());

                ois = new ObjectInputStream(server.getInputStream());
                FileInfo fileInfo =  (FileInfo) ois.readObject();
                if (fileInfo!=null){
                    createFile(fileInfo);
                }

                oos = new ObjectOutputStream(server.getOutputStream());
                fileInfo.setStatus("success");
                fileInfo.setDataBytes(null);
                oos.writeObject(fileInfo);

            }
            catch (IOException e){
                e.printStackTrace();
            }catch (ClassNotFoundException e){
                e.printStackTrace();
            }
            finally {
                closeStream(ois);
                closeStream(oos);
                closeStream(inFormClient);
                closeSocket(server);
            }
        }
    }
    private  boolean createFile(FileInfo fileInfo){
        BufferedOutputStream bos = null;
        try{
            if (fileInfo !=null){
                File fileReceive = new File(fileInfo.getDestinationDirectory()+
                        fileInfo.getFilename());
                bos = new BufferedOutputStream(
                        new FileOutputStream(fileReceive));
                bos.write(fileInfo.getDataBytes());
                bos.flush();
            }
        }
        catch (IOException e){
            e.printStackTrace();
            return  false;
        }
        finally {
            closeStream(bos);
        }
        return  true;
    }
    public void closeSocket(Socket socket) {
        try {
            if (socket != null) {
                socket.close();
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
