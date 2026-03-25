public class Person {
    private String name;
    private int age;
    static String school = "重庆商务职业学院";  // 静态属性，所有对象共享

    // 全参构造方法
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 成员方法（非静态，能访问所有成员）
    public void print() {
        System.out.println("姓名: " + name + ", 年纪: " + age + ", 学校: " + school);
    }

    // 静态方法示例（只能访问静态成员，不能用this）
    public static void printSchool() {
        System.out.println("所有人的学校: " + school);
        // System.out.println(name);  // 错误！不能访问非静态
    }
}