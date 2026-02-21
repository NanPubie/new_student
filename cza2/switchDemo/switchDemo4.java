package cza2.switchDemo;

import java.util.Scanner;

public class switchDemo4 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入月份：");
        int month = sc.nextInt();
//        wtf，第一次知道case也能那么用，case穿透
        switch (month) {
            case 1  ->
                        System.out.println("冬季");

            case 2->{
                System.out.println("冬季");
            }
            case 12->{
                System.out.println("冬季");
                }
            case 3,4,5->{
                System.out.println("春季");
            }
            case 6,7,8->{
                System.out.println("夏季");
            }
            case 9,10,11->{
                System.out.println("秋季");
            }
        }
    }
}
