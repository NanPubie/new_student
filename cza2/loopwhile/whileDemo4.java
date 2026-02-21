package cza2.loopwhile;

import java.util.Scanner;

public class whileDemo4 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<0)
        {
            n=-n;
        }
//        获取n的各个位的数字

        int b=0;
        while(n>0)
        {
            int a = n%10;
            b+=a;
            n=n/10;
        }
        System.out.println(b);
    }
}
