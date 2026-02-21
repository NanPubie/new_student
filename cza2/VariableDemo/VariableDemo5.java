package cza2.VariableDemo;

public class VariableDemo5 {
    static void main(String[] args) {
        /*计算BMI*/
        double weight = 77.5;
        double height = 1.77;
        double bmi = weight / (height * height);
        System.out.println("BMI=" + bmi);
//根据范围，判断这个人是否健康
        if (bmi < 18.5) {
            System.out.println("过轻");
        } else if (bmi < 25) {
            System.out.println("正常");
        } else if (bmi < 28) {
            System.out.println("过重");
        } else if (bmi < 32) {
            System.out.println("肥胖");
        } else {
            System.out.println(" severely obese");
        }
    }
}
