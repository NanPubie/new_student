package cza2.ifDemo;

import java.util.Scanner;

public class ifDemo7 {
    static void main(String[] args) {
//        卡拉兹函数
//        给n，若n为奇数则f（n）=3n+1，若n为偶数则f（n）=n/2
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
            System.out.println(n);
    }
}
