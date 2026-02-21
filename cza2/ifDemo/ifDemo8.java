package cza2.ifDemo;

import java.util.Scanner;

public class ifDemo8 {
    static void main(String[] args) {
        /*很多app都有不一样的优惠
        * 假设现在有以下的优惠券
        *   全场商品满10减8、
        *   全场商品满50减30
        *   全场商品满100减50
        *   全场商品满200减90
        *   会员卡：全场八折
        * 请问：优惠券和会员卡不能同时使用时，最优惠的价格是多少？
        * */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入商品价格：");
//        记录商品的价格
        double price = sc.nextDouble();
//        折扣之后商品的价格
        double discountPrice = 0;
//        计算使用了优惠券之后的价格
        if (price >= 200) {
            discountPrice = price - 90;
        } else if (price >= 100) {
            discountPrice = price - 50;
        } else if (price >= 50) {
            discountPrice = price - 30;
        } else if (price >= 10) {
            discountPrice = price - 8;
        } else {
            discountPrice = price;
        }
//        使用会员卡之后的价格
        double memberPrice = price * 0.8;
//        比较哪个价格更优惠
        if (memberPrice < discountPrice) {
            System.out.println("使用会员卡，最优惠价格为：" + memberPrice);
        } else {
            System.out.println("使用优惠券，最优惠价格为：" + discountPrice);
        }


    }
}
