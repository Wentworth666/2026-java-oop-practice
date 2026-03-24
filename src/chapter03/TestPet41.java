package chapter03;
public class TestPet41 {
public static void main(String[] args) {
        Pet p1 = new Pet();
        p1.setType("狗");
        p1.setAge(2);
        p1.setHealth(true);

        Pet p2 = new Pet();
        p2.setType("猫");
        p2.setAge(1);
        p2.setHealth(false);

        System.out.println("宠物1：类型=" + p1.getType() + "，年龄=" + p1.getAge() + "，健康=" + p1.getHealth());

        System.out.println("宠物2：类型=" + p2.getType() + "，年龄=" + p2.getAge() + "，健康=" + p2.getHealth());
    }
}