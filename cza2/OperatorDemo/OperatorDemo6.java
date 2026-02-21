package cza2.OperatorDemo;

public class OperatorDemo6 {
//    字母的大小写转化和字母与数字的转化
static void main(String[] args) {
//    A转化成a
//    定义变量记录大写字符
    char ch = 'A';
//    转化成小写
    char cc = (char)(ch + 32);//这里也用到了强制转化，灵活使用
    System.out.println(cc);

}
}
