package cza2.method;

public class MethodDemo5 {
    static void main(String[] args) {
//        给出两个长方形，比较哪一个面积更大
//        如何定义方法
//        小诀窍
//            1，观察在大段的代码中，哪些独立功能是重复使用的？ 重复使用+独立功能--这个问题里面就是求面积
//            2，独立功能，需要什么才能完成？--形参--长和宽
//            3，方法的调用处，是否需要这个独立功能继续做其他事情？--返回值--面积，不需要则用void
        int length1 = 3;
        int width1 = 4;
        int length2 = 5;
        int width2 = 6;
        if (getArea(length1, width1) > getArea(length2, width2))
            System.out.println("第一个长方形面积更大");
            else if (getArea(length1, width1) == getArea(length2, width2))
                System.out.println("第二个长方形面积更大");
            else
                System.out.println("两个长方形面积一样大");

    }
    static int getArea(int length, int width) {
        return length * width;
    }
}
