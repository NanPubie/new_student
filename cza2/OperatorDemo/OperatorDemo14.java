package cza2.OperatorDemo;

import java.util.*;

public class OperatorDemo14 {
    static void main(String[] args) {
//        利用三元运算符，求两个整数的较大值
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两个整数：");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int max = a > b ? a : b;//格式，千万不能忘记，感觉蛮重要的
        System.out.println(max);
    }
}
