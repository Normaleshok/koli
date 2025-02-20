package lessons;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class Primeryy {
    public static void main(String[] args) {
        new Scanner(System.in);
        int myInt = 123;
//        short myShort = 3242;
//        long myLong = 43534535;
//
//        double myDouble = 231.32;
//        float myFloat = 3243.4f;
//
//        char c = 'a';
//        boolean b = true;
//
//        byte myByte = 100;//-128-127
//        System.out.println(myInt);

//        int number = 10; //примитивный тип данных  [10]
//        int[] numbers = new int[5]; //        numbers ->      [массив] ссылочный тип данных
//        for (int i = 0; i<numbers.length; i++){
//            numbers[i] = i*10;
//        }
//        for (int i = 0; i<numbers.length;i++){
//            System.out.println(numbers[i]);
//        }
//        System.out.println();
//        int[] numbers1 ={1,2,3};
//        for (int i = 0; i<numbers1.length; i++){
//            System.out.println(numbers1[i]);
//        }

//        int[] numbers = new int[5];
//        numbers[0] = 10;
//        String [] strings = new String[3];
//        strings[0] = "привет";
//        strings[1] = "пока";
//        strings[2] = "джава";
//
//        for (int i = 0; i<strings.length; i++){
//            System.out.println(strings[i]);
//        }
//        System.out.println();
//        for (String string:strings){
//            System.out.println(string);
//        }
//        int[] numbers1 ={1,2,3};
//        int sum = 0;
//        for (int x:numbers1){
//            sum = sum+x;
//        }
//        System.out.println();
//        System.out.println(sum);
//
//        int value = 0;
//        String s = null;
//        System.out.println(s);

//            int [] number = {1, 2, 3};
//        System.out.println(number[1]); // одномерный массив

        /// 1,2,3,4,5,6,9,7,-1,0
        /// 156
        /// 376 7 - [1][1] - 1 строка, 2 столбец
        /// 268

//        int[][] matrice = {{1,2,3},
//                           {4,5,6},
//                           {7,8,9}};
//        System.out.println(matrice.length);
//        for (int i = 0; i<matrice.length; i++){
//            for (int j = 0; j< matrice[i].length; j++){
//                System.out.print(matrice[i][j]+ " ");
//            }
//            System.out.println( );
//        }

//        System.out.println(matrice[1][0]);
//        System.out.println(matrice[0][4]);
//
//        String [][] strings = new String[2][3];
//        strings[0][3] = "Привет";
//        System.out.println(strings[0][1]);

//        int[][] ar = new int[][]{{5,6,7,6},{1,2,3,4},{8,9,0,5}};
//        for (int i = 0; i < ar[1].length; i++)
//        { System.out.print(ar[1][i] + " "); }

//        double a = 0.5, b = 17.2, c = -34;
//        double result = maximum(a, b, c); //вызов метода. Его результат присваивается result
//        System.out.println("Максимальное= " + result);

        StringBuilder filename = new StringBuilder("data");
        addExtention(filename);//передача в метод ссылки на объект
        System.out.println("Имя файла c расширением: " + filename);
    }
    //    static double maximum(double x, double y, double z){
//        double max = x > y ? x : y;
//        max = z > max ? z : max;
//        return max; //возврат значение и выход из метода
//    }

    static void addExtention(StringBuilder sb) {
        sb.append(".txt");

    }
}
