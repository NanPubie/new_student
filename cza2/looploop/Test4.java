package cza2.looploop;

public class Test4 {
    static void main(String[] args) {
//        打印99乘法表
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + i * j + "\t");//  \t制表符可以用来对齐
            }
            System.out.println();
        }
    }
}
