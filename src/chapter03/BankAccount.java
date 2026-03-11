package chapter03;

// 1. 账户类 BankAccount
public class BankAccount {
    private int account;       // 账号（私有）
    private double leftMoney;  // 余额（私有）

    // 全参构造方法（题目要求）
    public BankAccount(int account, double leftMoney) {
        this.account = account;
        if (leftMoney >= 0) {
            this.leftMoney = leftMoney;
        } else {
            System.out.println("初始余额不能为负，已设置为0");
            this.leftMoney = 0;
        }
    }

    // 查询余额（getter）
    public double getLeftMoney() {
        return leftMoney;
    }

    // 存款（addMoney）
    public void addMoney(double money) {
        if (money > 0) {
            leftMoney += money;
            System.out.println("存入 " + money + " 元成功！");
        } else {
            System.out.println("存款金额必须大于0");
        }
    }

    // 取款（minorMoney）+ 余额判断（封装）
    public void minorMoney(double money) {
        if (money <= 0) {
            System.out.println("取款金额必须大于0");
        } else if (leftMoney < money) {
            System.out.println("余额不足，取款失败！当前余额：" + leftMoney);
        } else {
            leftMoney -= money;
            System.out.println("取款 " + money + " 元成功！");
        }
    }

    // 可选：打印账户信息（方便测试）
    public void showInfo() {
        System.out.println("账号：" + account + "，余额：" + leftMoney + " 元");
    }
}