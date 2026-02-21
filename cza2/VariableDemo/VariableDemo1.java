package cza2.VariableDemo;

public class VariableDemo1 {
    public static void main(String[] args) {
//        定义一个变量记录微信的余额为0
        int a = 0;
//        定义一个变量记录支付宝的余额为10
        int b = 10;
//        定义一个变量记录银行卡的余额为20
        int c = 20;
//        计算并打印出余额总和
        System.out.println(a + b + c);
//        微信收了10元又发了两元，计算并打印
        a = a + 10 - 2;
        System.out.println(a + b + c);
    }
}
