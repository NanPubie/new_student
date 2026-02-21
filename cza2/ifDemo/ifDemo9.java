package cza2.ifDemo;

import java.util.Scanner;

public class ifDemo9 {
    static void main(String[] args) {
//        给出a，b，c三个边，判断是否能组成三角形
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        if(a+b>c&&a+c>b&&b+c>a){
            System.out.println("可以组成三角形");
            if(a==b&&b==c){
                System.out.println("等边三角形");
            }else if(a==b||b==c||a==c){
                System.out.println("等腰三角形");
            }else if(a*a+b*b==c*c||b*b+c*c==a*a||a*a+c*c==b*b){
                System.out.println("直角三角形");
            }else{
                System.out.println("普通三角形");
            }
        }
        else{
            System.out.println("不能组成三角形");
        }
//        然后判断是不是等边，等腰，直角，普通三角形

    }
}
