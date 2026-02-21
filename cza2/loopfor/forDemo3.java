package cza2.loopfor;

import java.util.Scanner;

public class forDemo3 {
    static void main(String[] args) {
//        录入两个数字，表示一个范围
//        在这个范围中统计有多少个能被3和5整除的数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两个数字：");
        int a = sc.nextInt();
        int b = sc.nextInt();
//        求两个数的最大和最小值
        int max = a>b?a:b;//三元运算符别忘记使用
        int min = a<b?a:b;
        int count =0;
        for (int i=min;i<=max;i++)
        {
            if (i%3==0 && i%5==0)
            {
                count ++;
            }
        }
        System.out.println("在"+min+"到"+max+"之间，能被3和5整除的数有"+ count +"个");
    }
}
