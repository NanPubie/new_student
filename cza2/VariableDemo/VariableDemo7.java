package cza2.VariableDemo;

import java.util.Scanner;

public class VariableDemo7 {
    static void main(String[] args) {
//        定义两个整数类型的变量num1，num2
//        键盘录入数据并且为两个数据赋值
//        计算两个数的和并进行打印
        Scanner sc = new Scanner(System.in);//就用sc，不用别的名字了，只是一个功能，不需要改动名字
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println(num1 + num2);
    }
}
