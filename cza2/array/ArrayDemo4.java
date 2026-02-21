package cza2.array;

import java.util.Scanner;

public class ArrayDemo4 {
    static void main(String[] args) {
//        数组的动态初始化
//        键盘录入五个数字，然后遍历
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入五个数字：");
//        键盘录入
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
