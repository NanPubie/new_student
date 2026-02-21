package cza2.ifDemo;

public class ifDemo1 {
    static void main(String[] args) {
//        定义一个变量表示人体的体温，对提问进行判断是否大于等于38度，如果超过则打印出警告
        double bodyTemperature = 37.5;
        if (bodyTemperature >= 38) {
            System.out.println("您的体温已经超过了38度，请检查您的身体");
        }
    }
}
