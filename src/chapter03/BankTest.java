package chapter03;
public class BankTest {
    public static void main(String[] args) {
        // 创建账户对象 ba，初始余额 500 元
        BankAccount ba = new BankAccount(123456, 500.0);

        // 1. 查询初始余额
        System.out.println("初始余额：");
        System.out.println(ba.getLeftMoney());

        // 2. 存入 1000 元
        ba.addMoney(1000.0);
        System.out.println("存入1000元后：");
        System.out.println(ba.getLeftMoney());

        // 3. 取出 800 元
        ba.minorMoney(800.0);
        System.out.println("取出800元后：");
        System.out.println(ba.getLeftMoney());
    }
}
