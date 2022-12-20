// Дан список чисел. Создать список в который поподают числа, описывающие 
// возрастающюю последовательность и содержащие максимальное количество элементов.
// Пример:[1, 5, 2, 3, 4, 6, 1, 7] => [1, 2, 3, 4, 6, 7]
//        [5, 2, 3, 4, 6, 1, 7] => [2, 3, 4, 6, 7]

package testJava;

import java.util.Random;
import java.util.Scanner;

public class test_15 {
    public static void create(int[] arr) {
        System.out.println("Введите размер массива");

        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        arr = new int[count];
        Random r = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(10);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d", arr[i]);
        }
        scanner.close();
    }

    public static void minNum(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= arr[0])
               temp = arr[0];
               arr[0] = arr[i];
               arr[i] = temp;
               System.out.printf("%d", arr[i]);       
        }
    }

    public static void main(String[] args) {
        int[] a = new int[0];

        create(a);
        minNum(a);
    }
}