package cza2.method;

import java.lang.classfile.PseudoInstruction;

public class MethodDemo1 {
    static void main(String[] args) {
//        练习，定义一个方法，求两数之和
        /*方法的定义格式
        public static 返回值类型 方法名(参数列表){
            方法体
            return 返回值;
        }
         */
//        方法的调用格式
//          方法名(参数列表);类如10,20
//        使用返回值的方法，直接赋值到变量中 或者 直接写在输出语句中
        int add = getSum(10, 20);
        System.out.println(add);
    }

    //        第一个问题：方法定义的位置，main也是一个方法，方法与方法之间是平级的，不能嵌套
//            二，方法不会主动运行，需要调用
//            三，小括号中的参数需要一一对应(个数，类型)
    public static int getSum(int a, int b) {
        int sum = a + b;
        return sum;
    }


}
