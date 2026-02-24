package cza2.test;

import java.util.Random;

public class Test2 {
    static void main(String[] args) {
//        给你两个整数M和N，M表示红包的总额，N表示红包的个数
//      现在又N个人来抽红包，每个人都是随机的，打印每个人领的红包金额
//
//      要求1：每个人最少1分钱
//      要求2：每个人领完红包之后，至少预留 1 * N 分钱
//      要求3：最后一个人是拿剩余的总额
        int m = 5;//分
        int n = 5;
        if(m<=n)
            System.out.println("输入的参数有误");
//        利用循环抽取红包

        else{
            Random r = new Random();
        for (int i = 1; i <= n-1; i++) {
            int money = r.nextInt(m - (n - i))+1;
            m=m-money;
            System.out.println("第" + i  + "个人抢到" + money + "分");
        }
        System.out.println("最后一个人抢到" + m + "分");}
    }
}
