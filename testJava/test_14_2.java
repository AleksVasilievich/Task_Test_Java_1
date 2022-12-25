package testJava;
/*
 * Сколько маршрутов ведут например : из 2  в 11, прибавляя 1 или умножая на 2, 
 * для больших  чисел до  25000  (без использования рекурсии) .
 */

public class test_14_2 {

    public static void main(String[] args) {
        int n1 = 25000; // Конечное значение.
        int n2 = 2; // Начальное значение.
        calk(n1, n2);
    }

    public static void calk(int numRes, int num) {

        int[] array = new int[numRes + 1];
        array[num] = 1;
        for (int i = 2; i < array.length; i++) {
            array[i] = array[i] + array[i - 1];
            if (i % 2 == 0)
                array[i] = array[i] + array[i / 2];
            if (i == array.length - 1)
                System.out.print(array[i]);
        }
    }
}
