package cza2.array;

public class Test6 {
    static void main(String[] args) {
//        快慢指针
        int[] arr = {1, 1, 2, 2, 2, 2, 3, 3, 3, 3};
//        定义两个指针
        int slow = 0, fast = 1;
//利用循环不断的移动快慢指针，找不重复的元素
        while (fast < arr.length) {
//            判断快慢指针的元素是否相等，分类讨论
            if (arr[slow] != arr[fast]) {
//                不相等，将fast的元素赋给slow
                arr[++slow] = arr[fast];
            }
//            如果相等的情况
            fast++;//无论是否相等，都移动fast
        }
        for (int i = 0; i < slow; i++) {
            System.out.println(arr[i]);
        }//输出数组，注意数组长度为slow
    }
}
