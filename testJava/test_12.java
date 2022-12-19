package testJava;
                                                // Метод быстрой сортировки (Quick sort)
import java.util.Arrays;

public class test_12 {
    public static void quickSort(int[] array, int low, int high) {        // Метод принимает неотсортированный массив,
                                                                        // индекс первого и последнего элемента массива
        if (array.length == 0)
            return;                                       // завершить выполнение, если длина массива равна 0

        if (low >= high)                               // завершить выполнение если уже нечего делить
            return;

                                                    // выбрать опорный элемент из массива для оптимизации алгоритма
        int middle = low + (high - low) / 2;
        int opora = array[middle];

                                                // разделить на подмассивы, который больше и меньше опорного элемента
        int i = low, j = high;
        while (i <= j) {
            while (array[i] < opora) {
                i++;
            }

            while (array[j] > opora) {
                j--;
            }

            if (i <= j) {                   // меняем местами ,сортируем
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

                                              // вызов рекурсии для сортировки левой и правой части
        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);
    }

    public static void main(String[] args) {
        int[] x = { 8, 0, 4, 7, 3, 7, 10, 12, -3 };         //  неотсортированный массив
        System.out.println("Исходный массив");
        System.out.println(Arrays.toString(x));

        int low = 0;                                      //  индекс первого элемента
        int high = x.length - 1;                         //  индекс поледнего элемента

        quickSort(x, low, high);
        System.out.println("Отсортированный массив");
        System.out.println(Arrays.toString(x));
    }
}
