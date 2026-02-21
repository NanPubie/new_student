package cza2.OperatorDemo;

import java.util.Scanner;

public class OperatorDemo2 {
    public static void main(String[] args) {
//        数值拆分

//        拆分321为个位数，十位数，百位数
//        读取一个三位数
        System.out.println("请输入一个三位数：");
//        如果ai自动生成scanner，然后没有补import，那么就利用alt+回车（修改错误），选择第一个import就行
        Scanner sc = new Scanner(System.in);
//        快捷键alt+p，让ai自动生成
        int a = sc.nextInt();
        System.out.println(a / 100);
        System.out.println(a / 10 % 10);
        System.out.println(a%10);
    }
}
