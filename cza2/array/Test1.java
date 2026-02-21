package cza2.array;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
//需求：已知数组元素为 {33,5,22,44,55,33}
//键盘录入任意一个数据，查找这个数据在数组中是否存在
//如果数组中要查找的数据出现多次，只要显示第一次的索引即可输出要求：
//如果存在打印索引
//如果不存在，提示："该数据不存在"

//细节1：什么时候提示该数据不存在
//细节2：有三种写法 直接比较，或者使用flag(boolean)，或者使用count(计数)


        int arr[] = {33, 5, 22, 44, 55, 33};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要查找的数据：");
        int number = sc.nextInt();

        boolean flag = false;
        //记录数组中是否有这个number，如果找到了就修改成true(这是第二种写法)
//        在循环外面判断，然后输出“该数据不存在”
//        我注释的是我第一种写的方法
        for (int i = 0; i < arr.length; i++) {
            if (number == arr[i]) {
                System.out.println("该数据在数组中的索引为：" + i);
                flag = true;
                break;
            } /*else if (i == arr.length - 1) {
                System.out.println("该数据不存在");
                break;
            }*/
        }
        if (!flag)//这里加了个！变得更美观,更简洁，不用写else了
        {
            System.out.println("该数据不存在");
        }
//        else
//            System.out.println("该数据不存在");
    }
}
