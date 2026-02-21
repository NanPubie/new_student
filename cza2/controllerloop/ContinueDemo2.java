package cza2.controllerloop;

import java.util.Scanner;

public class ContinueDemo2 {
    static void main(String[] args) {
//        从1开始数数，遇到数字中含有4或者是4的倍数，就跳过这个数字报下一个
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            if(i % 10 == 4 || i / 10 == 4 || i % 4 == 0)
            {
                continue;
            }
            System.out.println(i);
        }
    }
}
