package cza2.OperatorDemo;

import java.util.Scanner;

public class OperatorDemo12 {
    static void main(String[] args) {
//    键盘录入一个数字，判断它是否是回文数
//        回文数就是对称的,正序和倒叙一样
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int num = sc.nextInt();
//        判断这个数是否是回文数
//        进行数字拆分,四位数,拆分成ge,shi,bai,qian
        int ge = num % 10;
        int shi = num / 10 % 10;
        int bai = num / 100 % 10;
        int qian = num / 1000;
        if (qian == ge && shi == bai) {
            System.out.println("是回文数");
        } else {
            System.out.println("不是回文数");
        }




    }
}
