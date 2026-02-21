package cza2.controllerloop;

import java.util.Random;
import java.util.Scanner;

public class Test {
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
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字：");
        int guessNum = sc.nextInt();
        while( true)
        {
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
            System.out.println("请输入数字：");
            guessNum = sc.nextInt();



        }



    }
}
