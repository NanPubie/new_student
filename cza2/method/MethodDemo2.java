package cza2.method;

import java.util.Random;

public class MethodDemo2 {
    static void main(String[] args) {
       // 获取10个1-100之间的随机数并存入到数组当中，要求保证数据是唯一的
//        思路：存在就不存，继续生成下个随机数，如果数组中没有这个数，就存
        Random r = new Random();
        int[] arr = new int[10];//动态初始化

        for (int i = 0; i < arr.length; i++) {
            int num = r.nextInt(100) + 1;
//        对num是否存在进行判断
            int count = 0;
        boolean flag = contains(num, arr);//这里传递实参只需要传递名字
        if (!flag) {
            arr[i]=num;
            i++;
        }

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == num) {
                    count++;
                    break;
                }
            }
//            对count进行判断
            if (count == 0) {
                arr[i] = num;
            }
            else {
                i--;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
//    定义一个方法，判断num在数组arr中是否存在，替换内循环
//    形参num，和数组arr
    public static boolean contains(int num, int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num)
//         如果遇到一个符合条件的
                return true;
        }
        return false;
    }
}
