package cza2.switchDemo;

import java.util.Scanner;

public class switchDemo3 {
    static void main(String[] args) {
//        根据输入的月份判断季节
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入月份：");
        int month = sc.nextInt();
//        wtf，第一次知道case也能那么用，case穿透
        switch (month) {
            case 1:
            case 2:
            case 12:
                System.out.println("冬季");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
                break;
            case 9:
            case 10:
            case 11:
        }
    }
}
