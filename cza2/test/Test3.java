package cza2.test;

public class Test3 {
    static void main(String[] args) {
//给定两个正序数组 arr1和 arr2，请先合并数组，并找出合并之后数组的中位数。
// 举例： 1 2 3 4 5 6 7 8 9    中位数：5
// 1 2 3 4 5 6    中位数：(3 + 4) / 2
//二路归并思想
        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {2, 4};
        double number = findMedian(arr1, arr2);
        System.out.println(number);
    }

    static public double findMedian(int[] arr1, int[] arr2) {
//    把数组arr1和arr2合并
//        1,定义一个大数组，长度为arr1.length + arr2.length
        int[] arr = new int[arr1.length + arr2.length];
//        2,把两个小数组拷贝到大数组arr中，并按照正序排列
//        已经有序，就可以简化算法，否则只能先都放进大数组，最后排序
//        添加的同时，保证排序，但是必须保证arr1和arr2都是正序
        int index1 = 0;
        int index2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (index1 >= arr1.length) {
                arr[i] = arr2[index2];
                index2++;
            } else if (index2 >= arr2.length) {
                arr[i] = arr1[index1];
                index1++;
            } else if (arr1[index1] < arr2[index2]) {
                arr[i] = arr1[index1];
                index1++;
            } else {
                arr[i] = arr2[index2];
                index2++;
            }
            System.out.print(arr[i] + " ");

        }

//        找出中位数
        if (arr.length % 2 == 0) {
            return (arr[arr.length / 2] + arr[arr.length / 2 - 1]) / 2.0;
        } else {
            return arr[arr.length / 2];
        }
    }
}
