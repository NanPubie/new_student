package cza2.OperatorDemo;

import java.util.Scanner;

public class OperatorDemo10 {
    static void main(String[] args) {
//        键盘录入一个整数，判断是否在1~10之间
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a >= 1 && a <= 10) {//这里的&&可以写俩个，也可以写一个
            System.out.println("在1~10之间");
        } else {
            System.out.println("不在1~10之间");
        }
//        判断是否不在1~10之间
    }
}
