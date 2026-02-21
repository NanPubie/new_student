package cza2.VariableDemo;

public class VariableDemo2 {
    public static void main(String[] args) {
/*
    我方：叉子                对方：长手
    攻击：220                攻击：210
    防御：85                 防御：80
    血量：1012.5             血量：1223.3
    技能加成： 1.2            技能加成：1.3

    技能造成伤害的公式：攻击力 * 技能加成 - 对方防御力
    普攻造成伤害的公式：攻击力 - 对方防御力

    计算：
    我方第一次进行普通攻击，造成多少伤害，对方还剩余多少血量？
    我方第二次进行技能攻击，造成多少伤害，对方还剩余多少血量？
*/
//    1，定义变量记录我方和敌方的攻击力
        int myAttack = 220;
        int enemyAttack = 210;
//    2，定义变量记录防御
        int myDefense = 85;
        int enemyDefense = 80;

//    3，定义变量记录生命值
        double myHp = 1012;
        double enemyHp = 1223;

//     4，定义变量记录技能加成
        double mySkillAdd = 1.2;
        double enemySkillAdd = 1.3;
//     5，我方第一次进行普通攻击，造成多少伤害，对方还剩余多少血量？用浮点类型
        double myAttackDamage = myAttack - enemyDefense;
//        对方剩余的血量
        enemyHp = enemyHp - myAttackDamage;
//        打印
        System.out.println("我方普通攻击造成伤害：" + myAttackDamage + "，对方剩余血量：" + enemyHp);



//     6，我方第二次进行技能攻击，造成多少伤害，对方还剩余多少血量？
        double mySkillDamage = (myAttack * mySkillAdd - enemyDefense);
//        对方的血量
        enemyHp = enemyHp - mySkillDamage;
//        打印
        System.out.println("我方技能攻击造成伤害：" + mySkillDamage + "，对方剩余血量：" + enemyHp);

    }
}
