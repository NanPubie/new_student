package cza2.controllerloop;

import java.util.Scanner;

public class BreakDemo2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        初始生命200，受到x伤害，技能回复y血量，x，y由键盘录入
//        任务不会死亡，最少会有一滴血
//        请问最后多少血量
        int HP = 200;
        int x;

        while (true)
        {
            System.out.println("请输入当前人物收到的伤害：" );
             x = sc.nextInt();
            if (x >= 0) {
                break;
            }
        }
        int y;
        while (true)
        {
            System.out.println("请输入当前人物收到的伤害：" );
            y= sc.nextInt();
            if (y >= 0) {
                break;
            }
        }
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
