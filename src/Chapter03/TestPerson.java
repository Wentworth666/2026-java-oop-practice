public class TestPerson {
    public static void main(String[] args) {
        Person p1 = new Person("zs", 18);
        Person p2 = new Person("ls", 19);
        Person p3 = new Person("ww", 20);

        p1.print();
        p2.print();
        p3.print();

        // 修改静态属性，所有对象都变
        Person.school = "重庆商务大学";
        System.out.println("\n修改学校后：");
        p1.print();
        p2.print();
        p3.print();

        // 直接用类名调用静态方法
        Person.printSchool();
    }
}