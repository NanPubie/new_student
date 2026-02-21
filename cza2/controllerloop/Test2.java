package cza2.controllerloop;

import java.util.Random;
import java.util.Scanner;

public class Test2 {
    static void main(String[] args) {
//        生成一个1-100的随机数，利用键盘录入模拟猜的动作知道猜到这个数字
        Random r = new Random();
//        生成随机数
        /*第一种写法，没给范围默认在int的取值范围之内获取*/        int num = r.nextInt() ;
//了解
        /*第二种写法：小括号里吗写一个数字，表示随机的最大值，但是不包括这个数字*/  num =r.nextInt(100)+1;
//更具有通用性--重要
//假设写n，则范围是0~n-1
//如果写10，则范围是0~9
        /*第三种写法：小括号里面写两个数字，代表a~b，但是包含a不包含b*/    num = r.nextInt(1,101);
//高版本--重要
//小保底：猜到第三次提示范围在+-5
//大保底：猜到第10次直接输出猜中了
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字：");
        int guessNum = sc.nextInt();
//        定义两个计数器
        int countA = 0;//小保底
        int countB = 0;//大保底
        while( true)
        {

            countB++;
            if (countB == 10)
            {
                num=guessNum;
                System.out.println("恭喜你猜对了");
                countB = 0;
                break;
            }
            if (guessNum== num)
            {
                System.out.println("恭喜你猜对了");
                break;
            }
            else if (guessNum > num)
            {
                System.out.println("你猜的数字太大了");
            }
            else
            {
                System.out.println("你猜的数字太小了");
            }
            countA++;
            if (countA == 3)
            {
                System.out.println("小保底，范围在"+(num-5)+"~"+(num+5));
                countA = 0;
            }
            System.out.println("请输入数字：");
            guessNum = sc.nextInt();



        }



    }
}
