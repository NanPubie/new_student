package cza2.test;

import java.util.Arrays;

public class Test5 {
    static void main(String[] args) {
//        动态规划思想---DP
//        把大的问题拆分成小的子问题，然后求解子问题，最后再把子问题结果合并成原问题结果

//        接雨水
//给定 n 个非负整数表示每个宽度为 1 的柱子的高度图，计算按此排列的柱子，下雨之后能接多少雨水
//输入：height = [0,1,0,2,1,0,1,3,2,1,2,1]
// 输出：6
//解释：下面是由数组 [0,1,0,2,1,0,1,3,2,1,2,1] 表示的高度图，在这种情况下，可以接 6 个单位的雨水（蓝色部分表示雨水）
        int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
//      2，从左到右遍历数组去记录雨水加柱子的面积总和
//        定义数组记录从左往右看的数据
        int [] leftmax = new int[arr.length];
//        定义第三方变量temp,记录当前最高的柱子
        int temp = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(temp>arr[ i])
                leftmax[i] = temp;
            else{
                leftmax[i] = arr[i];
                temp = arr[i];
            }

        }
//        遍历
        for (int i = 0; i < leftmax.length; i++) {
            System.out.print(leftmax[i]+" ");

        }
        //从右往左
        int [] rightmax = new int[arr.length];
        temp = arr[arr.length-1];
        for (int i = arr.length-1; i >=0; i--) {
            if(temp>arr[ i])
                rightmax[i] = temp;
            else{
                rightmax[i] = arr[i];
                temp = arr[i];
            }

        }
        System.out.println("");
        for (int i = 0; i < rightmax.length; i++) {

            System.out.print(rightmax[i]+" ");

        }
        int[] result = new int[arr.length];
        for (int i = 0; i < rightmax.length; i++) {
            if(leftmax[i]<rightmax[i])
                result[i] = leftmax[i];
            else
                result[i] = rightmax[i];
        }
        System.out.println("");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");

        }
        int sum = 0;
        for (int i = 0; i < result.length; i++) {
            sum += result[i]-arr[i];
        }
        System.out.println("");
        System.out.println(sum);



    }
}
