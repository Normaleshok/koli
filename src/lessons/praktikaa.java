package lessons;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class praktikaa {

    public static void main(String[] args) throws FileNotFoundException {
        Locale.setDefault(Locale.US);
        System.out.println(fac(4));
        //            String name;
//            name=scan.nextLine();
//            int age;
//            age = scan.nextInt();
//            double s;
//            s = scan.nextDouble();
//            System.out.println("С днем рождения, "+name+"! "+"Сегодня Вам "+age+"!");
//            System.out.println("По этому поводу дарим Вам скидку "+s+"%");
//            System.out.println("на весь ассортимент нашего сайта!");

//            double x,f;
//            x=scan.nextDouble();
//            f=Math.log(x+7*Math.sqrt(Math.pow(x,4)+Math.PI));
//            System.out.printf("%.4f",f);
//            double a,z;
//            a=scan.nextDouble();
//            z=2*Math.pow(Math.sin(3*Math.PI-2*a),2)*Math.pow(Math.cos(Math.PI*5+2*a),2);
//            double y = ((double) 1 / 4) - (((double) 1 / 4) * Math.sin(((double) 5 / 2) * Math.PI - 8 * a));
//            System.out.printf("%.5f %.5f\n",z, y);

//            int N=0;
//            int mark;
//            int kol=0;
//            //kol - счетчик введенных оценок
//            while(N<10){
//                mark=scan.nextInt(); //вводим оценку
//                if (mark<4){
//                    kol++;
//            }
//            N++;
//            }
//            System.out.println(kol);
//            double prod = 1;
//            int a;
//            a = scan.nextInt();
//            int b;
//            b = scan.nextInt();
//            int[] array = {a, b};
//            if (a > b) { //если неверные границы диапазона, то переставляем их местами
//                int tmp = a;
//                a = b;
//                b = tmp;
//            }
//            int x = a;
//            while (x <= b) {
//                prod *= x;
//                x++;
//            }
//            System.out.println(prod);
        //if
//            long income; //для ввода дохода <=4 млрд.
//            System.out.println("Введите годовой доход в копейках: ");
//            income=scan.nextLong();
//            double tax;
//            if(income/100<=5e6){
//                tax=income*0.13;
//            }else{
//                tax=income*0.15;
//            }
//            long taxLong=(long)Math.ceil(tax);
//            System.out.println("Налог= "+taxLong/100+" руб. "+taxLong%100+" коп.");
//            //switch
//        int number;
//        System.out.println("Введите номер дня недели: ");
//        number = scan.nextInt();
//        switch (number) {
//            case 1:
//                System.out.println("Январь");
//                break;
//            case 2:
//                System.out.println("Февраль");
//                break;
//            case 3:
//                System.out.println("Март");
//                break;
//            case 4:
//                System.out.println("Апрель");
//                break;
//            case 5:
//                System.out.println("Май");
//                break;
//            case 6:
//                System.out.println("Июнь");
//                break;
//            case 7:
//                System.out.println("Июль");
//                break;
//            case 8:
//                System.out.println("Август");
//                break;
//            case 9:
//                System.out.println("Сентябрь");
//                break;
//            case 10:
//                System.out.println("Октябрь");
//                break;
//            case 11:
//                System.out.println("Ноябрь");
//                break;
//            case 12:
//                System.out.println("Декабрь");
//                break;
//            default:
//                System.out.println("Ошибка");

//            double x;
//            double y;
//            double c;
//            double d;
//            x=scan.nextDouble();
//            y=scan.nextDouble();
//            c=scan.nextDouble();
//            d=scan.nextDouble();
//            double z = Math.sqrt(x*x + y*y);
//            double v = Math.sqrt(c*c + d*d);
//            if (z<v) {
//                System.out.println("Первая точка ближе");
//            }
//            else if (z>v){
//                System.out.println("Вторая точка ближе");
//            }
//            else {
//                System.out.println("Точки на равных расстояниях");
//            }
//            int number = scan.nextInt();
//            if(number < 0) number =- number;
//            if(number < 100 || number > 999){ //неверные исходные данные
//                System.out.println("ERROR");
//                return; //прекращение работы программы
//            }
//            int sum = 0;
//            int s1 = number % 10;
//            int s2 = number / 10 % 10;
//            int s3 = number /100;
//            if (s1 % 2 != 0) sum += s1;
//            if (s2 % 2 != 0) sum += s2;
//            if (s3 % 2 != 0) sum += s3;
//
//            if (sum == 0){
//                System.out.println("NO"); //поиск суммы нечетных цифр
//            }
//            else {
//                System.out.println(sum);

//        int chas = scan.nextInt();
//        double tarif = scan.nextDouble();
//        double zp = 0;
//        if (chas < 0 || tarif < 0){
//            System.out.println("ERROR");
//            return;}
//        if (chas <= 20) {
//            zp+= chas*tarif;
//
//        }
//        else if (chas <= 40) {
//            zp+= 20*tarif+(chas-20)*tarif*1.5;
//        }
//        else {
//            zp+= 20 * tarif + 20 * tarif * 1.5 + (chas-40)*tarif*2;
//        }
//        System.out.printf("%.2f", zp);

//        double ab = scan.nextDouble();
//        double bc = scan.nextDouble();
//        double gruz = scan.nextDouble();
//        double top = 300;
//        double rash = 0;
//        if (gruz<=500){
//            rash=1 ;
//        }else if(gruz<=1000){
//           rash=4;
//        }else if (gruz<=1500){
//            rash=7;
//        }else if (gruz<=2000){
//            rash=9;
//        }else if (gruz>2000){
//            System.out.println("ERROR");
//            return;
//        }
//        double rashab = ab * rash;
//        double rashbc = bc * rash;
//        if (rashab > top || rashbc > top){
//            System.out.println("ERROR");
//            return;}
//        double ost = top - rashab;
//        if (ost >= rashbc){
//            System.out.println("0.00");
//        }else {
//        System.out.printf("%.2f", rashbc-ost);
//        }

//        int den = scan.nextInt(); //вводим название месяца
//        switch (den) {
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("Working day");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//            default:
//                System.out.println("ERROR");
//        }

//        int mark = scan.nextInt();
//        if (mark > 0) {
//            int i = Integer.MAX_VALUE;
//            for (int min = 0; min < mark; min++) {
//                int N = scan.nextInt();
//                if (N < i){
//                    i = N;
//                }
//            }
//            System.out.println(i);
//        }

//        int chis = scan.nextInt();
//        int sum = 0;
//        for (int i=1;i<=chis;i++){
//            if (chis % i == 0){
//                sum+=i;
//            }
//        }
//        System.out.println(sum);

//        int x = scan.nextInt(); //вводимое число
//        int t;
//        int number=0;
//        do {
//            t = scan.nextInt();
//            if (t > 0 && x % t == 0) {
//                number++;
//            }
//        }
//            while (t > 0) ;
//            System.out.println(number);

//        int x = scan.nextInt();
//        if (x<0) x=-x;
//        int kol = 0;
//        int sum = 0;
//        do {
//            sum+=x%10;
//            kol++;
//            x/=10;
//        }while (x!=0);
//        System.out.println(kol+" "+sum);

//        int grade, k = 0;
//        double sum = 0;
//        double sred;
//        grade = scan.nextInt();
//        while (grade >= 0) {
//            sum += grade;
//            k++;
//            grade = scan.nextInt();
//        }
//        if (k > 0) {
//            sred = sum / k;
//            System.out.printf("%.1f", sred);
//        } else {
//            System.out.println("No data");
//        }

//        int width = scan.nextInt();
//        for(int i =width;i > 0; i--) { //меняется i - номер строки
//            for(int j = i; j > 0; j--) { //меняется j - номер столбца
//                System.out.print(i);
//            }
//            System.out.println();
//        }

//        int height = scan.nextInt();
//        int width = scan.nextInt();
//        if (width <= 0 || height <=0){
//            System.out.println("ERROR");
//            return;
//        }
//        for (int i = 0; i < height; i++){
//            for (int j = 0; j < width; j++){
//                if (i == 0 || i == height - 1 || j == 0 || j == width - 1){
//                    System.out.print("*");
//                }else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

//        int width = scan.nextInt();
//        if (width <= 0){
//            System.out.println("ERROR");
//            return;
//        }
//        int kol = 0;
//        for(int i = 1; i <= width; i++) { //меняется i - номер строки
//            for(int j = 1; j <= width; j++) { //меняется j - номер столбца
//                if (j<=kol){
//                    System.out.print(" ");
//                }else {
//                    System.out.print("*");
//                }
//            }
//            kol++;
//            System.out.println();
//;        }

//        int width = scan.nextInt();
//        if (width <= 0){
//            System.out.println("ERROR");
//            return;
//        }
//        int kol = 0;
//        int zv = width;
//        while (zv > 0) {
//            for(int i = 1; i <= kol; i++) {
//                System.out.print(" ");
//            }
//            for(int i = 1; i <= zv; i++) {
//                System.out.print("*");
//            }
//            System.out.println();
//            kol++;
//            zv -= 2;
//        }

//        int chis = scan.nextInt();
//        for (int i = 1; i <= chis; i++){
//            for (int j = 1; j <= chis; j++){
//                System.out.printf("%d\t",i*j);
//            }
//            System.out.println();
//        }

//        int chis1 = scan.nextInt();
//        int chis2 = scan.nextInt();
//        if (chis1 > chis2) { //если неверные границы диапазона, то переставляем их местами
//            int tmp = chis1;
//            chis1 = chis2;
//            chis2 = tmp;
//        }
//        int sum = 0;
//        int kol = 0;
//        while (chis1 <= chis2) {
//            int max = 0;
//            int tmp = Math.abs(chis1);
//            while (tmp > 0) {
//                max += tmp % 10;
//                tmp /= 10;
//            }
//            if (max > sum){
//                sum = max;
//                kol = chis1;
//            }
//            chis1++;
//        }
//        System.out.println(kol);

//        int chis = scan.nextInt();
//        if (chis < 2) {
//            System.out.println("NO");
//        }else {
//        boolean hasDivider = false;
//        for(int i=2; i <= Math.sqrt(chis); i++) {
//            if(chis%i == 0) {
//                hasDivider = true;
//                break;
//            }
//        }
//        if(!hasDivider){
//            System.out.println("YES");
//        }else {
//            System.out.println("NO");
//        }
//        }

//        int chis = scan.nextInt();
//        int chis1 = scan.nextInt();
//        for (int i = chis; i <= chis1; i++) {
//            boolean hasDivider = true;
//            for (int j = 2; j <i; j++) {
//                if (i % j == 0) {
//                    hasDivider = false;
//                    break;
//                }
//            }
//            if (hasDivider==true && i!=1) {
//                System.out.println(i+" ");
//            }
//        }

//        int chis = scan.nextInt();
//        int chis1 = scan.nextInt();
//        if (chis > chis1) { //если неверные границы диапазона, то переставляем их местами
//            int tmp = chis;
//            chis = chis1;
//            chis1 = tmp;
//        }
//        int find = 0; //останется 0, если не простых чисел в диапазоне нет
//        BLOCK: while (chis <= chis1) { //пока внутри диапазона
//            for (int i = 2; i < chis; i++) { //перебираем кандидатуры в делители
//                if (chis % i == 0) { //если a делится на i
//                    find = chis;  //запоминаем первое Не простое число
//                    break BLOCK; //выходим из вложенных циклов
//                }
//            }
//            chis++; //переход к следующему числу диапазона
//        }
//            if (find == 0) {
//                System.out.println("NO");
//            }else {
//                System.out.println(find);
//        }

//        int chis = scan.nextInt();
//        int sum =0;
//        for (int i = 2; i <= chis /2;i+=2) {
//            if (chis % i == 0)
//            {
//                sum+=i;
//
//            }
//
//        }
//        System.out.println(sum);

//        int chis = scan.nextInt();
//        int chis1 = scan.nextInt();
//        int sum =0;
//        BLOCK: for (; chis <= chis1;chis++) {
//            for (int i =2; i <= chis; i++){
//                if (chis % i == 0)
//                {
//                    sum+=i;
//                    continue BLOCK;
//                }
//            }
//        }
//      System.out.println(sum);

//        int n = scan.nextInt();
//        int[]a = new int[n];
//        for (int i = 0; i<a.length; i++){
//            a[i]=scan.nextInt();
//        }
//        for (int el:a){
//            System.out.print(el+" ");
//        }
//        System.out.println();

//        int n = scan.nextInt();
//        int x = scan.nextInt();
//        int[] a= new int[n];
//        int sum = 0;
//        double prod = 1;
//        Random rand = new Random(x);
//        for (int i = 0; i < a.length; i++){
//           a[i]= rand.nextInt(-5 , 6);
//           System.out.print(a[i] + " ");
//           if (a[i]>0){
//               sum += a[i];
//           }
//            if (a[i]<0){
//                prod *= a[i];
//            }
//        }
//        System.out.println();
//        System.out.println(sum + " " + prod);

//        double n = scan.nextDouble();
//        long x = scan.nextLong();
//        double[] b = new double[(int) n];
//        Random rand = new Random(x);
//        double kol = 0;
//        double sum = 0;
//        double avg = 0;
//        for (int i= 0; i<b.length; i++){
//            b[i]= rand.nextDouble(0., 5.);
//            System.out.printf("%.2f ", b[i]);
//            sum += b[i];
//            kol++;
//            avg = sum / kol;
//        }
//        System.out.println();
//        System.out.printf("%.2f\n",avg);
//        for (int i = 0; i <b.length; i++){
//            if (b[i]>avg){
//                b[i] = avg;
//        }
//            System.out.printf("%.2f ", b[i]);
//        }
//        System.out.println();

//        int[] d = new int[scan.nextInt()];
//        for (int i = 0; i < d.length; i++) {
//            d[i] = scan.nextInt();
//        }
//        int imin = 0;
//        for (int i = 0; i < d.length; i++){
//            if (d[i]<=d[imin]){
//                imin = i;
//            }
//        }
//        d[imin] = -1;
//        for (int el:d){
//            System.out.print(el + " ");
//        }

//        int l = scan.nextInt();
//        int a = scan.nextInt();
//        int[]n = new int[l];
//        Random rand = new Random(a);
//        for (int i = 0; i < n.length; i++){
//            n[i]= rand.nextInt(-5, 16);
//            System.out.print(n[i] + " ");
//        }
//       int neg = -1;
//        int imax = 0;
//        for (int i = 0; i < n.length; i++) {
//            if (n[i] > n[imax]) {
//                imax = i;
//            }
//            if (n[i] < 0) {
//                neg = i;
//            }
//        }
//        if (neg != -1) {
//            int temp = n[neg];
//            n[neg] = n[imax];
//            n[imax] = temp;
//        }
//        System.out.println();
//        for (int i = 0; i < n.length; i++) {
//            System.out.print(n[i] + " ");
//        }
//        System.out.println();

//        int[][] array = new int[scan.nextInt()][scan.nextInt()];
//        Random rand = new Random(scan.nextLong());
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                array[i][j] = rand.nextInt(-5,5);
//                System.out.print(array[i][j] + "\t");
//            }
//            System.out.println();
//        }
//        int imax = array[0][0];
//        int count = 0;
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[0].length; j++) {
//                if (array[i][j] > imax){
//                    imax = array[i][j];
//                    count = 1;
//                }else if(array[i][j] == imax){
//                    count++;
//                }
//            }
//        }
//        System.out.print(imax + " " + count);

//        int[][] array = new int[scan.nextInt()][scan.nextInt()];
//        Random rand = new Random(scan.nextLong());
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                array[i][j] = rand.nextInt(-10,11);
//                System.out.print(array[i][j] + "\t");
//            }
//            System.out.println();
//        }
//        System.out.println();
//        int sum =0;
//        for (int j = 0; j < array[0].length; j++) {
//            sum =0;
//            for (int i = 0; i < array.length; i++) {
//                if (array[i][j] > 0) {
//                    sum += array[i][j];
//                }
//            }
//            System.out.print(sum + " ");
//        }

//        int[][] array = new int[scan.nextInt()][scan.nextInt()];
//        Random rand = new Random(scan.nextLong());
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                array[i][j] = rand.nextInt(-10,11);
//                System.out.print(array[i][j] + "\t");
//            }
//            System.out.println();
//        }
//        for (int i = 0; i < array.length; i++) {
//            int ind = -1;
//            for (int j = 0; j < array[0].length; j++) {
//                if (array[i][j] < 0) {
//                    ind = j;
//                    break;
//                }
//            }
//            if (ind == -1){
//                System.out.println("NO");
//            }else {
//                System.out.println(ind);
//            }
//        }

//        int[] array = new int[scan.nextInt()];
//        Random rand = new Random(scan.nextInt());
//        int kontr = scan.nextInt();
//        for (int i = 0; i < array.length; i++){
//            array[i]= rand.nextInt(2, 16);
//        }
//        Arrays.sort(array);
//        System.out.println(Arrays.toString(array));
//        int ind = Arrays.binarySearch(array, kontr);
//        if (ind < 0){
//            System.out.println("ERROR");
//        }else{
//            int[] c = Arrays.copyOfRange(array, 0, ind + 1);
//            System.out.println(Arrays.toString(c));
//        }

//        double[] array = new double[(int) scan.nextDouble()];
//        Random rand = new Random(scan.nextInt());
//        for (int i = 0; i < array.length; i++){
//            array[i]= rand.nextDouble(0, 2);
//        }
//        System.out.println(Arrays.toString(array));
//        Arrays.sort(array);
//        System.out.println(array[0] + array[array.length - 1]); или
//        double min = array[0];
//        double max = array[2];
//        for (double num : array){
//            if (num > max){
//                max = num;
//            }
//            if (num < min){
//                min = num;
//            }
//        }
//        double sum = max + min;
//        System.out.println(sum);

//        int[] array = new int[scan.nextInt()];
//        Random rand = new Random(scan.nextInt());
//        for (int i = 0; i < array.length; i++){
//            array[i]= rand.nextInt(10, 21);
//        }
//        System.out.println(Arrays.toString(array));
//        int indfor = scan.nextInt();
//        int indto = scan.nextInt();
//        Arrays.sort(array, indfor, indto + 1);
//        System.out.println(Arrays.toString(array));

     //   String result = String.format("Жили у бабуси %d веселых гуся", 2);
//        System.out.println(result);
//        double x = 3.1415;
//        String out = String.format("x=%6.3f", x);
//        System.out.println(out);

//        String str1 = scan.nextLine();
//        String str2 = scan.nextLine();
//        String str3 = scan.nextLine();
//        String[] hel = {str1, str2, str3};
//        Arrays.sort(hel);
//        for(int i=0;i<hel.length;i++){
//            System.out.println(hel[i]);
//        }

//        String str1 = scan.nextLine();
//        String changed = str1.replace(";", ".,");
//        System.out.println(changed);

//        String str1 = scan.nextLine();
//        String str2 = scan.nextLine();
//        String str3 = scan.nextLine();
//        String sub = str1.substring(str1.indexOf(';') + 1, str1.lastIndexOf(';'));
//        String sub2 = str2.substring(str2.indexOf(';') + 1, str2.lastIndexOf(';'));
//        String sub3 = str3.substring(str3.indexOf(';') + 1, str3.lastIndexOf(';'));
//        String result = sub+sub2+sub3;
//        System.out.println(result);

//        String str = scan.nextLine();
//        str=str.trim(); //удаляем пробелы в начале и в конце
//        String[] words = str.split("\\s+");
//        String result = "";
//        for (String word : words) {
//            // Сравниваем длину текущего слова с максимальной длиной
//            if (word.length() > result.length()) {
//                result = word;
//            }
//        }
//
//        // Печатаем первое слово максимальной длины
//        System.out.println(result);

//        String str = scan.nextLine();
//        String kontr = scan.nextLine();
//        String modifiedText = str.replaceAll("\\b" + kontr + "\\b", "").trim();
//        // Удаляем лишние пробелы
//        modifiedText = modifiedText.replaceAll("\\s+", " ");
//        System.out.println(modifiedText);

//        String str = scan.nextLine();
//        String[] words = str.split(" ");
//        for (String word : words) {
//            System.out.print(word.substring(0, 1).toUpperCase() + word.substring(1) + " ");
//        }

//        final int X = 10;
//        System.out.println(X);

//        StringBuilder sb1 = new StringBuilder("Hello");
//        System.out.println(sb1.toString());
//        sb1.append(" my").append(" friend");
//        System.out.println(sb1.toString());

//        String data = scan.nextLine();
//        data = data.trim();//удаление пробелов в начале и в конце
//        String[] words = data.split(" +");
//        StringBuilder sb = new StringBuilder();
//        for(String word : words) {
//            if (word.contains("z")){
//                sb.append("ERROR ");
//            }else {
//                sb.append(word).append(" ");
//            }
//        }
//        System.out.println(sb);

//        String data = scan.nextLine();
//        data = data.trim();//удаление пробелов в начале и в конце
//        String[] words = data.split(" +");
//        StringBuilder sb = new StringBuilder(words[0]);
//        for(int i = 1; i < words.length; i++) {
//            char a = sb.charAt(sb.length()-1);
//            for (int j = 1; j < words.length; j++){
//                if (words[j].charAt(0)== a){
//                    sb.append(" ").append(words[j]);
//                    break;
//                }
//            }
//        }
//        System.out.println(sb);

//        String data = scan.nextLine();
//        int sum = 0;
//        StringBuilder res = new StringBuilder();
//        for(int i = 0; i < data.length(); i++) {
//            if (data.charAt(i) >= '0' && data.charAt(i) <= '9') {
//                sum += data.charAt(i) - '0';
//                res.append(data.charAt(i)).append('+');
//            }
//        }
//            if (!res.isEmpty()){
//                res.replace(res.length()-1,res.length(),"=");
//                res.append(sum);
//                System.out.println(res);
//            }else {
//                System.out.println("ERROR");
//        }
        //        String separor  = File.separator;
//       String path = separator + "C:" +separator + "Users" +separator +"Кирилл" + separator +"Desktop" + separator + "test.txt";
        File file = new File("test2");
        Scanner scan = new Scanner(file);
        String line = scan.nextLine();
        String[] numbersString = line.split(" ");
        int[] numbers = new int[3];
        int counter = 0;
        for (String number : numbersString){
            numbers[counter++]= Integer.parseInt(number);
        }
        System.out.println(Arrays.toString(numbers));
    }
    private static int fac(int n) {
        return n == 1 ? 1 : n * fac(n - 1);
    }

}

//class Test1{
//    public static final int CONSTANT = 0;
//
//}




