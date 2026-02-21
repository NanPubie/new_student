package cza2.controllerloop;

import java.util.Scanner;

public class BreakDemo3 {
    static void main(String[] args) {
//        键盘录入一个数字判断是不是质数
//        什么是质数
//        质数：只能被1和自身整除的数字
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        while (true)
        {
            System.out.println("请输入数字：");
            num = sc.nextInt();
            if(num>=2)
            {
                break;
            }else {
                System.out.println("请重新输入");
            }
        }
    }
}
