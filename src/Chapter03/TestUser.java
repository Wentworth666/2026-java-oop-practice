public class TestUser {
    public static void main(String[] args) {
        System.out.println("=== 测试全参构造 ===");
        User u1 = new User("ls", 15);
        u1.print();
        u1.work();

        System.out.println("\n=== 测试单参构造 ===");
        User u2 = new User(20);
        u2.setName("zs");
        u2.print();

        System.out.println("\n=== 测试无参构造 ===");
        User u3 = new User();
        u3.setName("ww");
        u3.print();
    }
}