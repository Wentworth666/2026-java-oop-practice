public class BankTest {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount(123456, 500.0);


        System.out.println("初始余额：");
        System.out.println(ba.getLeftMoney());


        ba.addMoney(1000.0);
        System.out.println("存入1000元后：");
        System.out.println(ba.getLeftMoney());


        ba.minorMoney(800.0);
        System.out.println("取出800元后：");
        System.out.println(ba.getLeftMoney());
    }
}
