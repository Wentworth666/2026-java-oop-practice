package chapter03;

public class HelloUniverse {
    public static void main(String[] args) {
        NewCustomer cust1 = new NewCustomer();
        // 可以在这里设置值测试
        cust1.setName("张三");
        cust1.setPhone("13812345678");
        cust1.setBalance(500.0);

        cust1.getInfo();  // 打印顾客信息
    }
}

// 顾客类
class NewCustomer {
    private String name;     // 姓名
    private String phone;    // 电话
    private double balance;  // 余额

    // set/get 方法（封装）
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("设置的余额不合法！");
        }
    }

    public double getBalance() {
        return balance;
    }

    // 打印顾客信息
    public void getInfo() {
        System.out.println("姓名：" + name);
        System.out.println("电话：" + phone);
        System.out.println("余额：" + balance);
    }
}