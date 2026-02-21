package cza2.OperatorDemo;

public class OperatorDemo3 {
    static void main(String[] args) {
//        时间转换
//        给定秒数seconds，转换为时分秒，使得总时间不变，分钟数和秒数不超过59
        int seconds = 123456;
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int seconds2 = (seconds % 3600) % 60;
        System.out.println(hours + ":" + minutes + ":" + seconds2);
        System.out.printf("%d:%d:%d", hours, minutes, seconds2);
        System.out.println();
        System.out.printf("%02d:%02d:%02d", hours, minutes, seconds2);
//      两种打印方法


    }
}
