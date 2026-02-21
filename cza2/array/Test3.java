package cza2.array;

public class Test3 {
    static void main(String[] args) {
//        求最值的算法
//        先默认第一个数是最大值Max，然后两两比较选其中较大的为Max，比较到结尾，留下的自然就是最大的Max

//        假设数组元素为{1,2,3,4,5,6}
//        求最大值
        int[] arr = {1,2,3,4,5,6};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
    }
}
