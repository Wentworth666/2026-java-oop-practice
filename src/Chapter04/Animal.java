public class Animal {
 String name;
 protected int age;

 public void speak() {
  System.out.println(name + "正在发出叫声。。");
 }
}
class Cat extends Animal{
 String color;
 @Override
 public void speak(){
  System.out.println(name+"正在喵喵叫。。");
 }
}
class Dog extends Animal{
@Override
 public void speak(){
 System.out.print(name +"正在汪汪叫。。");
}
}