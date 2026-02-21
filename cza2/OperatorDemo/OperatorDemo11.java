package cza2.OperatorDemo;

import java.util.Scanner;

public class OperatorDemo11 {
    static void main(String[] args) {
//                键盘录入一个整数，判断是否不在1~10之间
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int a = sc.nextInt();
        if (!(a >= 1 && a <= 10)) {
            System.out.println("不在1~10之间");
        }


    }
}
