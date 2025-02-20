package lessons;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Random;
import java.util.Scanner;

public class Hellop {

    public static void main(String[] args) {
        new Scanner(System.in);
        Random rand = new Random();
        int[][] a = new int[3][4];

        for(int i = 0; i < a.length; ++i) {
            for(int j = 0; j < a[i].length; ++j) {
                a[i][j] = rand.nextInt(-10, 11);
                System.out.print(a[i][j] + "\t");
            }

            System.out.println();
        }

    }
}
