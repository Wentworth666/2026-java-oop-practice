public class person {
    String name;
    int age;
   public void action(){
        System.out.print("正在睡觉");
        System.out.println("吃饭");
    }
}
   class Student extends person{

 }
 class TestPerson {
     public static void main(String[] args) {
         person p1 = new person();
         p1.name = "zs";
         p1.age = 20;
            Student student = new Student();
            student.name="ls";
            student.age= 10;
            student.action();
     }
 }

