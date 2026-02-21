package cza2.switchDemo;

import com.sun.source.tree.YieldTree;

import java.util.Scanner;

public class switchDemo5 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int a = sc.nextInt();
        String week = switch (a) {
                case 1,4->{
                    yield "星期一";
                }

                case 2,5->{
                    yield "星期二";
                }

                case 3,6->{
                    yield "星期三";
                }

                default->{
                    yield "找不到";
                }
            };
        System.out.println(week);
    }
}
