package cza2.loopwhile;

public class whileDemo2 {
    static void main(String[] args) {
        double money=1000;
        int i=0;
        while(money<=2000){
            money=money*1.017;
            i++;

        }
        System.out.println("第"+i+"年后能翻倍");



    }
}
