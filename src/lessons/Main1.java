package lessons;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Locale;
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
             //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        //System.out.printf("Hello and welcome!");
        Locale.setDefault(Locale.US);
        // for (int i = 1; i <= 5; i++) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        // System.out.println("i = " + i);
        //}

//        Scanner scan = new Scanner(System.in);
//        for (int i = 0; i < 5; i++) {
//            int number = scan.nextInt();
//            System.out.print(isPrime(number) + " ");
//        }
//        Scanner scan = new Scanner(System.in);
//        int a = scan.nextInt();
//        int b = scan.nextInt();
//        int kol = simpleInRange(a, b);
//        System.out.println(kol);

//        Scanner scan = new Scanner(System.in);
//        int number = scan.nextInt();
//        printDivider(number);

//        Scanner scan = new Scanner(System.in);
//        int a = scan.nextInt();
//        String str = scan.next();
//        char sim = str.charAt(0);
//        printTriangle(a, sim);

        Scanner scan = new Scanner(System.in);
//        int t = scan.nextInt();
//        if (t == 1){
//            double a = scan.nextDouble();
//            System.out.printf("%.2f", square(a));
//        }
//        else if (t == 2){
//            double b = scan.nextDouble();
//            double c = scan.nextDouble();
//            System.out.printf("%.2f", square(b, c));
//        }
//        int a = scan.nextInt();
//        int b = scan.nextInt();
//        int c = scan.nextInt();
//        double x = scan.nextDouble();
//        double y = scan.nextDouble();
//        double z = scan.nextDouble();
//        System.out.printf("%.2f %.2f\n", average(a, b), average(a, b, c));
//        System.out.printf("%.2f %.2f\n", average(x, y),average(x, y, z));

//        int[] ar = new int[scan.nextInt()];
//        long seed = scan.nextLong();
//        init(ar,seed);
//        print(ar);
//        int ind = findMax(ar);
//        System.out.println(ind);

//        int[][] mas = new int[scan.nextInt()][scan.nextInt()];
//        long seed = scan.nextLong();
//        initArray(mas, seed);
//        printArray(mas);
//        System.out.println();
//        printMaxIndex(mas);

//        int[] ar = new int[scan.nextInt()];
//        long seed = scan.nextLong();
//        init(ar, seed);
//        print(ar);
//        int[] b = reduceAfterMax(ar);
//        print(b);

//        int[][] mas = new int[scan.nextInt()][scan.nextInt()];
//        long seed = scan.nextLong();
//        int ind = scan.nextInt();
//        initArray(mas, seed);
//        printArray(mas);
//        System.out.println();
//        mas = deleteRow(mas, ind);
//        printArray(mas);

//        String str = scan.nextLine();
//        if (isGMailAddress(str)) {
//            System.out.println("YES");
//        } else {
//            System.out.println("NO");
//        }

//        String str = scan.nextLine();
//        System.out.println(delCom(str));
//
//        int a = scan.nextInt();
//        int b = scan.nextInt();
//        String str = primer(a, b);
//        System.out.println(str);

//        Tree tree1 = new Tree();
//        Squirell squirell1 = new Squirell();

//        //Upcasting - Восходящее преобразование
//        Dog dog = new Dog();
//        Animal animal = dog;
//
//        //Downcasting - Нисходящее преобразование
//        Dog dog1 = (Dog) animal;
//        dog1.voice();

//        Animal a1 = new Animal();
//        Dog dog = (Dog) a1;
//        dog.voice(); //ошибка

//        Cat cat = new Cat();
//        Dog dog = new Dog();

//        olk(animal);
//        olk(cat);
//        olk(dog);


    }
//    public static void olk(Animal animal){
//        animal.eat();
//    }

//    static boolean isPrime (int number) {
//        if (number <= 1) {
//            return false;
//        }
//        for (int i = 2; i <= Math.sqrt(number); i++) {
//            if (number % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    static int simpleInRange(int a, int b){
//        int kol = 0;
//        if (a > b) {
//            int tmp = a;
//            a = b;
//            b = tmp;
//        }
//        for (int i = a; i <= b; i++) {
//            if (isPrime(i)) {
//                kol++;
//            }
//        }
//        return kol;
//    }

//    static void printDivider(int number){
//        for (int i = 1; i <= number; i++) {
//            if (number % i == 0) {
//                System.out.print(i + " ");
//            }
//        }
//    }

//    static int maxNumberDivider(int a, int b){
//        int maxCount = 0, result = -1;
//        for (int i = a; i <= b; i++) {
//            int currentCount = kolDelitel(i);
//            if (currentCount > maxCount) {
//                maxCount = currentCount;
//                result = i;
//            }
//        }
//        return result;
//    }
//    static void kolDelitel(int number, int x){
//        - пример полиморфизма
//    }

//    static int kolDelitel(int number){
//        int kol = 0;
//        for (int i = 1; i <= number / 2; i++) {
//            if (number % i == 0) {
//                kol++;
//            }
//        }
//        return kol * 2 + 1;  // так как мы учитываем само число
//    }

//    static void printTriangle(int width, char sim) {
//        int start = (width % 2 == 0) ? 2 : 1;
//        for(int i=start;i<=width;i+=2) {
//            int spaces = (width - i) / 2;
//            for (int j = 0; j < spaces; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j < i; j++) {
//                System.out.print(sim);
//            }
//            System.out.println();
//        }
//    }

//    static double square(double apr, double bpr){
//        return apr * bpr;
//    }
//    static double square(double sqr){
//        return Math.pow(sqr, 2);
//    }
//        static double average(double apr, double bpr) {
//        return (apr + bpr)/2;
//    }
//        static double average(double apr, double bpr, double dpr){
//        return (apr + bpr + dpr)/3;
//    }
//        static double average(int  apr, int bpr){
//        return ( apr + bpr )/2.;
//    }
//        static double average(int apr, int bpr, int dpr){
//        return ( apr + bpr + dpr)/3.;
//    }

//    static void init(int[] mas, long seed){
//        Random rand = new Random(seed);
//        for(int i = 0; i < mas.length; i++){
//            mas[i] = rand.nextInt(-3, 6);
//        }
//    }
////
//    static void print(int[] mas) {
//        for (int i = 0; i < mas.length; i++) {
//            System.out.print(mas[i] + " ");
//        }
//    }
////
//    static int findMax(int [] ar){
//        int find = 0;
//        for (int i = 1; i < ar.length; i++) {
//            if (ar[i] > ar[find]) {
//                find = i;
//            }
//        }
////        System.out.println();
//        return find;
//    }

//    static void initArray(int[][] mas, long seed){
//        Random rand = new Random(seed);
//        for(int i = 0; i < mas.length; i++){
//            for (int j = 0; j < mas[i].length; j++){
//                mas[i][j] = rand.nextInt(0, 11);
//            }
//        }
//    }
////
//    static void printArray(int[][] mas) {
//        for (int i = 0; i < mas.length; i++) {
//            for (int j = 0; j < mas[i].length; j++){
//                System.out.print(mas[i][j] + "\t");
//            }
//            System.out.println();
//            }
//    }

//
//    static int findMax(int [] ar){
//        int find = 0;
//        for (int i = 1; i < ar.length; i++) {
//                if (ar[i]> ar[find]) {
//                    find = i;
//            }
//        }
//        return find;
//    }
//
//    static void printMaxIndex(int [][] mas){
//        for(int i = 0; i < mas.length; i++){ //перебираем строки
//            System.out.printf(findMax(mas[i]) + " "); //вызов для одномерного массива(строки i двумерного)
//        }
//        System.out.println();
//    }

//    static int[] reduceAfterMax(int [] ar){
//        int max = findMax(ar);
//        int[] b = new int [max + 1];
//        for (int i = 0; i <= findMax(ar); i++) { //переписываем от k-й строки до конца
//                b[i] = ar[i];
//        }
//        System.out.println();
//        return b;
//    }

//    static int[][] deleteRow(int[][] mas, int limit){
//        if (limit <0 || limit >= mas.length) {
//            return mas;
//        }
//        int[][] b = new int[mas.length-1][mas[0].length];
//        for (int i = 0; i < limit; i++) { //переписываем все до k-й строки
//            for (int j = 0; j < mas[i].length; j++) {
//                b[i][j] = mas[i][j];
//            }
//        }
//        for (int i = limit+1; i < mas.length; i++) { //переписываем от k-й строки до конца
//            for (int j = 0; j < mas[i].length; j++) {
//                b[i-1][j] = mas[i][j];
//            }
//        }
//        return b;
//    }

//    static boolean isGMailAddress(String str){
//        int uno = str.indexOf('@');
//        int dos = str.lastIndexOf('m');
//        String subs = str.substring (uno, dos+1);
//        String username = str.substring(0, uno);
//        String domain = str.substring(uno);
//
//        return !username.isEmpty() && domain.equals("@gmail.com");
//    }

//    static String delCom(String str){
//        if(str.endsWith(".com")){
//            return  str.substring (0, str.length()-4);
//        }
//        return str;
//    }

//    static String primer(int a, int b){
//        StringBuilder sb = new StringBuilder();
//        sb.append(a).append(" + ").append(b).append(" = ").append(a+b);
//        return sb.toString();
//    }
    }

