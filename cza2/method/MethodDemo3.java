package cza2.method;

public class MethodDemo3 {
    static void main(String[] args) {
//        定义一个方法遍历数组
//        遍历格式如下：
//        [1, 2, 3, 4, 5]
    int []arr={1,2,3,4,5};
    printArr( arr);
//调用方法遍历

    }
//没有返回值的方法--void类型
    public static void printArr(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if(i!=arr.length-1)
            System.out.print(", ");
        }
        System.out.print("]");

    }

}
