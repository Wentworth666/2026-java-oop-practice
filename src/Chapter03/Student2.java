public class Student2 {
    static String name;  // 静态属性
    static int age;      // 静态属性

    // 静态代码块：类加载时执行一次，用于初始化静态成员
    static {
        System.out.println("执行静态代码块");
        name = "张三";
        age = 18;
    }

    // 实例代码块：每次new对象都执行
    {
        System.out.println("执行实例代码块");
        // 这里可以初始化实例相关，但注意不覆盖静态
    }

    public Student2() {
        System.out.println("执行构造方法");
    }

    public static void showInfo() {
        System.out.println("静态信息 - 姓名: " + name + ", 年龄: " + age);
    }
}