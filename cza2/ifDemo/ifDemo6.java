package cza2.ifDemo;

import java.util.Scanner;

public class ifDemo6 {
    static void main(String[] args) {
        /*小明每次订外卖都要在多个平台进行比对，看谁的优惠力度大
        * 饿了么：全场九折优惠
        * 美团：满30减10
        * 1：小明在那个平台消费50更划算
        * 2，如果花费的价格不稳定，数据由键盘录入而来呢*/
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入消费金额：");
        double spend = sc.nextDouble();
//        计算x-10=x * 0.9中x是多少;
        System.out.println("小明花费50在饿了么更优惠");
        if (spend < 100) {
            System.out.println("美团");
        } else {
            System.out.println("饿了么");
        }
    }
}
