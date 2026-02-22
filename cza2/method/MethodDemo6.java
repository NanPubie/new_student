package cza2.method;

public class MethodDemo6 {
    static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(getSum(a,b));//实参 形参一一对应
    }
    static int getSum(int a,int b){
        return a+b;
    }//用到的方法，名字高亮显示，大括号后面还有提示--1个用法
    static int getSum(int a,int b,int c){
        return a+b+c;
    }
    static double getSum(int a,double b ){
        return a+b;
    }
    static double getSum(double a,int b ){
        return a+b;
    }
    static double getSum(double a,double b ){
        return a+b;
    }
//    java再调用方法的时候会寻找最匹配的方法，
//    由于没有完全匹配的，如果好几个方法匹配程度一样，java无法确定调用哪个重载方法
//    int 和double虽然可以自动转换,但是两个参数都需要转换，所以无法确定最优选择

//    所以方法的重载,我们一般不会写成顺序不同的方式
}
