package cza2.switchDemo;

import java.util.Scanner;

public class switchDemo1 {
    static void main(String[] args) {
/*
*   键盘录入星期数，确定减肥计划
*   星期一跑步
*   星期二游泳
*   星期三慢走
*   星期四看电影
*   星期五动感单车
*   星期六爬山
*   星期日吃东西
*/
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入星期数：");
        int week = sc.nextInt();

        switch (week) {
            case 1:
                System.out.println("跑步");
                break;
            case 2:
                System.out.println("游泳");
                break;
            case 3:
                System.out.println("慢走");
                break;
            case 4:
                System.out.println("看电影");
                break;
            case 5:
                System.out.println("动感单车");
                break;
            case 6:
                System.out.println("爬山");
                break;

            case 7:
                System.out.println("吃东西");
                break;

            default:
                System.out.println("输入错误");
                break;
        }



    }
}
