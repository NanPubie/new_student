package cza2.VariableDemo;
//确定scanner的位置，util包中
import java.util.Scanner;

public class VariableDemo6 {
    static void main(String[] args) {
        /*
        键盘录入
            1，找到scanner
        *   2，让scanner干活*/
//        找到scanner
        Scanner sc=new Scanner(System.in);
//        让scanner干活
        sc.nextInt();//就是直接接受一个来自于键盘的整数，没有前面的一部分是因为不用赋值，这样就足够直接接收了
//        接受键盘录入的整数
        int num=sc.nextInt();
        System.out.println(num);
//        接收键盘录入的小数
        double num2=sc.nextDouble();
        System.out.println(num2);
//        接收键盘录入的文本（字符串--String）
        String name=sc.next();
        System.out.println(name);
    }
}
