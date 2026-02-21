package cza2.controllerloop;

public class ContinueDemo1 {
    static void main(String[] args) {
//        使用continue
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }
        

    }
}
