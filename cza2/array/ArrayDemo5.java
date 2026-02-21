package cza2.array;

public class ArrayDemo5 {
    static void main(String[] args) {
        /*数组的常见问题
         * 索引越界
         *索引的范围：0~数组的长度-1
         * */
        int[] a = {1, 2, 3, 4, 5};
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
