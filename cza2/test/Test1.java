package cza2.test;

public class Test1 {
    public static void main(String[] args) {
//     给你一个数组 nums 和一个值 val，你需要删除所有数值等于 val 的元素
//      举例1:
//      输入: nums = [3,2,2,3]    val = 3
//      输出: nums = [2,2] 剩余2个元素
//      举例1:
//      输入: nums = [0,1,2,2,3,0,4,2]    val = 2
//      输出: nums = [0,1,4,0,3] 剩余5个元素

        int[] arr = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
//        利用快慢指针删除数据
        int slow = 0;
        int fast = 0;
        while (fast < arr.length) {
            if (arr[fast] != val) {
                arr[slow] = arr[fast];
                slow++;
            }
            fast++;
        }
//        遍历数组
        for (int i = 0; i < slow; i++) {//注意这里遍历的数组长度要在慢指针
            System.out.print(arr[i] + " ");
        }
        System.out.println("剩余" + slow + "个元素");

    }
}
