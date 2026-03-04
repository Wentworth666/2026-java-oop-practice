public class Person {
        String name;   // 属性
        int age;

        void eat() {   // 方法
            System.out.println(name + " 正在吃饭...");
        }

        public static void main(String[] args) {
            Person zhangsan = new Person();  // 创建对xiang
            zhangsan.name = "张三";
            zhangsan.age = 20;
            zhangsan.eat();  // 调用方法
        }
    }


