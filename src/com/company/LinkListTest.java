package com.company;

import java.util.LinkedList;

public class LinkListTest {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        // thêm các phần tử sử dụng phương thức add()
        linkedList.add(1);
        linkedList.add(0);
        linkedList.add(3);
        linkedList.add(9);

        // sử dụng vòng lặp for
        // duyệt theo kích thước của linkedList
        // sử dụng phương thức linkedList.size()
        // và sau đó lấy phần tử tại vị trí thứ i thông qua hàm get()
        // sau đó hiển thị giá trị phần tử đó ra
        System.out.println("Các phần tử có trong linkedList là: ");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.print(linkedList.get(i) + "\t");
        }
    }
}
