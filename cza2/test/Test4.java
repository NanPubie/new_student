package cza2.test;

import java.util.Arrays;
import java.util.Random;

public class Test4 {
    static void main(String[] args) {
//        统计个数
//学校选举学生会主席，有5个候选人 全校1000名同学参与投票（每人一票，可以弃权，或者选1-5号）。 投票使用Random模拟。0：弃权，1～5：给对应的候选人投票
//要求1： 统计每个候选人的得票数和得票率，找出得票最多的候选人？
//要求2： 统计弃票数和弃票率是多少？

//    利用数组进行统计候选人的个数
//        1,创建长度为6的数组，索引不同来代表不同的候选人，0代表弃票
        int[] arr=new int[6];
//        2,循环1000次去生成投票数据
//        0：弃权
//        1，投给1号候选人。。。。。
        Random r=new Random();
        for (int i = 0; i < 1000; i++) {
            //生成投票的数据
            int vote=r.nextInt(0,6);//用的是两个参数的，包括左边但是不包括右边
//            把投票的数据放入数组中
//            vote:既是投票的数据，也是数组的索引
            arr[vote]++;

        }
        for (int i = 1; i < arr.length; i++) {
            System.out.println("第"+i+"人的得票数是"+arr[i]+"；得票率是"+arr[i]*1.0/1000*100+"%");
        }
        int z=0;
        int max=arr[1];
        for (int i = 2; i < arr.length; i++) {
            if(max<arr[i])
            {    max=arr[i];
            z=i;

        }}
        System.out.println(max+"那个人是第"+z+"人");







    }
}
