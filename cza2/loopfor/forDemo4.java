package cza2.loopfor;

import java.util.Scanner;

public class forDemo4 {
    static void main(String[] args) {
//        斐波那契数列
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字：");
        int n = sc.nextInt();
        int a = 1, b = 1;
        for (int i = 0; i <=n; i++) {

            int c = a + b;
            a = b;
            b = c;
            if(i==n) {
                System.out.println(a);
            }

        }
    }
}
