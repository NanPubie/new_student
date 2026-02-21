package cza2.OperatorDemo;

import java.util.Scanner;

public class OperatorDemo8 {
    static void main(String[] args) {
//        关系运算符
//        1，录入你和你好友的身高，比比谁更高
        System.out.println("请输入你的身高：");
        Scanner sc = new Scanner(System.in);
        double myHeight = sc.nextDouble();
//        基友的身高
        System.out.println("请输入基友的身高：");
        double friendHeight = sc.nextDouble();
        if (myHeight > friendHeight) {
            System.out.println("你高");
        } else {
            System.out.println("基友高");
        }

    }
}
