package cza2.array;

public class ArrayDemo2 {
    static void main(String[] args) {
//        数组中元素的访问：
//          1，获取数据；2，修改数据
        int[] a = {1,2,3,4,5};
        int num=a[0];
        System.out.println(num);
        a[0] = 10;
        System.out.println(a[0]);
    }
}
