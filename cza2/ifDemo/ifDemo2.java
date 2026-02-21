package cza2.ifDemo;

import java.util.Scanner;

public class ifDemo2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        初始生命200，受到x伤害，技能回复y血量，x，y由键盘录入
//        任务不会死亡，最少会有一滴血
//        请问最后多少血量
        int HP = 200;
        int x = sc.nextInt();
        int y = sc.nextInt();

            HP -= x;
            if (HP <= 0) {
                HP=1;//输出
                System.out.println(HP);
            }
            else{
                if(HP+y>=HP){
                    HP = 200;
                }
                else {
                    HP += y;
                }
                System.out.println(HP);
            }

    }
}
