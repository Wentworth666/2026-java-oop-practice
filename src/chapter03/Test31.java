package chapter03;

import java.util.Scanner;

public class Test31 {
    public static void main(String[] args)
    {
        // 创建 Scanner 对象，接收用户输入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入购买商品数量：");
        int number = sc.nextInt();  // 输入数量，比如 3

        // 创建 Product 数组
        Product[] arr = new Product[number];

        // 循环输入每个商品信息
        for (int i = 0; i < number; i++) {
            Product p = new Product();  // 创建 Product 对象
            System.out.println("请输入第 " + (i + 1) + " 个商品名称：");
            p.setName(sc.next());  // 输入名称
            System.out.println("请输入第 " + (i + 1) + " 个商品价格：");
            p.setPrice(sc.nextDouble());  // 输入价格
            System.out.println("请输入第 " + (i + 1) + " 个商品数量：");
            p.setNum(sc.nextInt());  // 输入数量

            arr[i] = p;  // 把对象放进数组
        }

        // 计算总价并打印
        double total = 0;
        System.out.println("商品列表：");
        System.out.println("名称\t\t价格\t\t数量\t\t小计");
        for (Product p : arr) {
            double subtotal = p.getPrice() * p.getNum();  // 小计
            total += subtotal;  // 累加总价
            System.out.println(p.getName() + "\t\t" + p.getPrice() + "\t\t" + p.getNum() + "\t\t" + subtotal);
        }
        System.out.println("总价：" + total);
    }
}

// 商品类
class Product {
    private String name;
    private double price;
    private int num;

    // set/get 方法
    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double p) {
        price = p;
    }

    public double getPrice() {
        return price;
    }

    public void setNum(int nu) {
        num = nu;
    }

    public int getNum() {

        return num;
    }
}