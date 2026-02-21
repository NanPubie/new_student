package cza2.array;

public class ArrayDemo1 {
    static void main(String[] args) {
//        数组的静态初始化
        /*定义数组存储三个同学的年龄
         *存储五个同学的身高
        *存储三个同学的名字
        *
        *简写格式：数据类型 数组名[]={数据1,数据2,数据3}
        *完整格式：数据类型 数组名[]=new 数据类型[]{数据1,数据2,数据3}
        * */

//        定义年龄
        int[] age1=new int[]{1,2,3,4,5};
        int[] ages={18,19,20};

//        定义身高
        double[] height1=new double[5];//自动赋值为0，感觉像动态初始化
        height1[0]=1.75;
        height1[1]=1.68;
        height1[2]=1.69;
        System.out.println(height1[4]);//这个时候打印出来的是0.0
        double[] heights={1.75,1.68,1.69,1.70,1.71};
        String[] names={"张三","李四","王五"};


    }
}
