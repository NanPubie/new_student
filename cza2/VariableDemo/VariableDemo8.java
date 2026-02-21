package cza2.VariableDemo;

import java.util.Scanner;

public class VariableDemo8 {
    public static void main(String[] args) {
//    BMI=体重/身高的平方
//        1，键盘录入体重和身高，用sc
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入体重：");
        double weight = sc.nextDouble();
        System.out.println("请输入身高：");
        double height = sc.nextDouble();//注意next根据类型不同而不同
//        2，计算BMI
        double bmi = weight / (height * height);
        System.out.println("BMI=" + bmi);




    }
}
