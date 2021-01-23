package com.company;
import java.io.FilePermission;
import java.io.IOException;
import java.security.PermissionCollection;

public class FilePermissionExample {
    public static void main(String[] args) throws IOException {
        // khai báo path1 là một file
        String path1 = "D:\\Picture\\paper_354390.jpg";
        // khai báo path2 là thư mục cha của path1
        String path2 = "D:\\Picture\\-";

        // cấp quyền cho path1
        FilePermission file1 = new FilePermission(path2, "read");
//        Phương thức newPermissionCollection () của lớp FilePermission được sử dụng để tạo đối tượng Permission Collection có các đối tượng FilePermission.
        PermissionCollection permission = file1.newPermissionCollection();
        permission.add(file1);

        // cấp quyền cho path2
        FilePermission file2 = new FilePermission(path1, "write");
        permission.add(file2);

        // kiểm tra và in ra quyền của path1
        if (permission.implies(new FilePermission(path1, "read,write"))) {
            System.out.println("Quyền Read, Write được cấp cho path " + path1);
        } else {
            System.out.println("Chỉ quyền Write được cấp cho path " + path1);
        }
    }
}