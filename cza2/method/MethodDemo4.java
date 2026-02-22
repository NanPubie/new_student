package cza2.method;

public class MethodDemo4 {
    static void main(String[] args) {
//        利用方法打印99乘法表
        print();
    }
    public static void print(){
           for (int i = 1; i <= 9; i++) {
               for (int j = 1; j <= i; j++) {
                   System.out.print(j + "*" + i + "=" + i * j + "\t");
               }
               System.out.println();
           }


    }
}
