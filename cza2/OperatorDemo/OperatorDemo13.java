package cza2.OperatorDemo;

import java.util.Scanner;

public class OperatorDemo13 {
    static void main(String[] args) {
//        寻找7的有缘数字,包含7或者是7的倍数就是7的有缘数
        Scanner sc = new Scanner(System.in);
//        定义一个两位整数
        int a;
        a=sc.nextInt();
//        拆分出a的个位数，十位数，ge，shi
        int ge = a % 10;
        int shi = a / 10;
//        判断
        if (a % 7 == 0 || ge == 7 || shi == 7) {
            System.out.println("是7的有缘数");
        } else {
            System.out.println("不是7的有缘数");
        }


    }
}
