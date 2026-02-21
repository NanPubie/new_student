package cza2.array;

import java.util.Random;

public class Test4 {
    static void main(String[] args) {
//        打乱数组中的类

//       前置： 交换两个变量中的数据
/*        int a = 1;
        int b = 2;
        int temp = a;//要利用temp来交换(临时变量)
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);
*/
//        第一步：0索引上的位置和随机位置上的数据交换
        Random r = new Random();
//        第二步：重复第一步，直到数组的最后一个索引位置
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < arr.length; i++) {
            int randomIndex = r.nextInt(arr.length);//随机索引
            //小括号里面写范围别忘记了
//            数据交换
            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
