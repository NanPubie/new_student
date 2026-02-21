package cza2.OperatorDemo;

import java.util.Scanner;

public class OperatorDemo9 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数：");
        int num = sc.nextInt();
        if (num % 3 == 0) {
            System.out.println("能被3整除");
        }
        else {
            System.out.println("不能被3整除");
        }
//        一个更轻松地判断方式：把个位数，十位数，百位数相加，如果和为3的倍数，则能被3整除
//        这个方法好像只适用于判断能否被3整除
    }
}
