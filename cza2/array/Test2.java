package cza2.array;

import java.util.Random;

public class Test2 {
    static void main(String[] args) {
        Random r = new Random();
        int a = r.nextInt();
        double b = r.nextInt();
        System.out.println(a + "  " + b);
        int arr1[] = {1, 2, 3};//静态数组
        int arr2[] = new int[]{1, 2, 3};
        int arr3[] = new int[5];//动态数组
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
            //这就是上面的复习
            /*random的使用
//            数组的三种定义--静止--动态
            * 对于数组长度的计算arr.length
            * */
        }
    }
}
