package testJava;

import java.util.Random;
import java.util.Scanner;

/**
 * test_1
 */
public class test_1 {
    public static void main(String[] args) {
        int[] a = new int[0];
        foo(a);
    }
    static void foo(int[] array) {
        System.out.println("Введите размер массива");
        
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        array = new int[count];
        Random r = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(10);
        }

        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d", array[i]);
        }
        scanner.close();
    }  

}