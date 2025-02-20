package theoriy;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class chislas {


    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        double x = 5.6;
        double y = 0.0;
        System.out.println("a+b= " + (a + b) + " x+y= " + (x + y));
        System.out.println("a-b= " + (a - b) + " x+y= " + (x - y));
        System.out.println("a*b= " + a * b + " x*y= " + x * y);
        System.out.println("a/b= " + a / b + " x/y= " + x / y);
        System.out.println("a%b= " + a % b + " x%y= " + x % y);
        int k = 5;
        System.out.println(k++);
        ++k;
        System.out.println(k);
        a = b;
        int tmp = a;
        b = tmp;
        System.out.println(b);
        int number = 50;
        int delitel = 0;
        if (delitel != 0 && number % delitel == 0) {
            System.out.println("" + delitel + " является делителем " + number);
        }

    }
}
