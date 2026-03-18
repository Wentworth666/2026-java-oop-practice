package chapter03;

public class User {
    private String name;  // 成员属性，全局变量
    private int age;

    // 无参构造方法
    public User() {
        System.out.println("无参构造方法被调用！");
    }

    // 单参构造（复用无参构造，演示this()调用其他构造）
    public User(int age) {
        this();  // 必须放在第一行！调用无参构造
        this.age = age;
        System.out.println("有参构造（只传age）被调用！");
    }

    // 全参构造（复用单参构造，先设置age再设置name）
    public User(String name, int age) {
        this(age);  // 必须第一行！复用上面的有参构造
        this.name = name;
        System.out.println("全参构造被调用！");
    }

    // set方法示例（重名参数用this区分）
    public void setName(String name) {
        this.name = name;  // this指成员变量
    }

    // 演示this调用成员方法 + 区分局部/成员变量
    public void print() {
        this.work();  // this调用本类方法（可省略，但加了更清晰）

        // 局部变量遮蔽成员变量演示
        String name = "局部zs";  // 局部变量
        int age = 10;            // 局部变量
        System.out.println("局部变量: " + name + age);
        System.out.println("成员变量: " + this.name + this.age);
    }

    public void work() {
        System.out.println(this.name + " 正在工作！");
    }
}