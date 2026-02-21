package cza2.loopwhile;

public class whileDeom3 {
    static void main(String[] args) {
//        珠峰高度8848米，毫米为8848000米
//        厚度为0.1毫米，折叠多少次能超过珠峰
        int i = 0;
        double z=0.1;
        while (z < 8848000) {
            z*=2;
            i++;
        }
        System.out.println(i);
    }
}
