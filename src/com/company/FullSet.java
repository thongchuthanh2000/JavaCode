package com.company;

import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FullSet {
    public  static  void main(String[] args){
        Integer[] arraySet1 = {2, 10, 4, 8, 5};
        Integer[] arraySet2 = {8, 12, 4};

        // chuyển mảng arraySet1 và arraySet2
        // sang 1 danh sách có cùng kiểu dữ liệu
        // sử dụng phương thức Arrays.asList()
        List<Integer> list1 = Arrays.asList(arraySet1);
        arraySet1[0]= 10;
//        List<Integer> list2 = Arrays.asList(arraySet2);
//
//        // chuyển List thành Set
//        Set<Integer> setInteger1 = new HashSet<>(list1);
//        Set<Integer> setInteger2 = new HashSet<>(list2);
//
//        // loại bỏ các phần tử có trong set1 và cũng có trong set2
//        // các bạn thấy trong ví dụ này
//        // setInteger1 có 5 phần tử là 2, 10, 4, 8 và 5
//        // setInteger2 có 3 phần tử là 8, 12 và 4
//        // nên kết quả của ví dụ này sẽ trả về setInteger1
//        // bao gồm 2 phần tử là 2, 5 và 10
//        setInteger1.removeAll(setInteger2);
//
//        System.out.println("Các phần tử trong setInteger1 sau khi"
//                + " loại bỏ các phần tử chung là:  ");
//        System.out.println(setInteger1);
        System.out.println(list1);

    }
}
