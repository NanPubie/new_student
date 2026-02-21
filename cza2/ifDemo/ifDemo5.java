package cza2.ifDemo;

import java.util.Scanner;

public class ifDemo5 {
    static void main(String[] args) {
//        定义一个学生的成绩，如果大于60就通过，否则不通过
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生的成绩：");
        int score = sc.nextInt();
//        判断成绩是否合理，满足大于0小于100
        if (score >= 0 && score <= 100) {
            if (score > 60) {
                System.out.println("通过");
            } else {
                System.out.println("未通过");
            }

        }else {
            System.out.println("不合理");
        }

    }
}
