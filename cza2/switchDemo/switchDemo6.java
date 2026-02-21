package cza2.switchDemo;

import java.util.Scanner;

public class switchDemo6 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int a = sc.nextInt();
//     利用switch模拟计算器
        int b=sc.nextInt();
        String operator = "*";
        int result = switch (operator){
            case "+"->{
                int sum=a+b;
                yield sum;
            }//可以直接写a+b例如下面，一步一步简化的
            case "-"-> {
                yield a-b;
            }
            case "*"->a*b;
            case "/"->a/b;
            default -> {
                System.out.println("输入错误");
                yield 0;
            }
        };
        System.out.println(result);


    }
}
