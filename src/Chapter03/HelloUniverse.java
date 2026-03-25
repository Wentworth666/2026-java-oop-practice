public class HelloUniverse {
    public static void main(String[] args) {
        // 测试1：正常设置
        NewCustomer cust1 = new NewCustomer("张三", "13812345678", 500.0);
        cust1.getInfo();

        // 测试2：余额不合法
        NewCustomer cust2 = new NewCustomer("李四", "13987654321", -100.0);
        cust2.getInfo();
    }
}

class NewCustomer {
    private String name;
    private String phone;
    private double balance;

    // 构造函数（优化：直接初始化）
    public NewCustomer(String name, String phone, double balance) {
        this.name = name;
        this.phone = phone;
        setBalance(balance);  // 用 set 方法检查合法性
    }

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
            System.out.println("设置的余额不合法！已设置为0");
            this.balance = 0;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void getInfo() {
        System.out.println("姓名：" + name);
        System.out.println("电话：" + phone);
        System.out.println("余额：" + balance + " 元");
        System.out.println("-------------------");
    }
}