import java.util.Random;
import java.util.Scanner;

public class program_3 {
    // private static int i;

    public static void main(String[] args) {
        int count = getValue("Введите размер");
        int[] array = create(count);
        fill(array);
        // print(array);
        meetingFrequency(array);
        print(array);
    }

    static int getValue(String text) {
        System.out.println("Введите размер массива");

        try (Scanner scanner = new Scanner(System.in)) {

            int count = scanner.nextInt();
            return count;
        }
    }

    static int[] create(int count) {
        int[] array = new int[count];
        return array;
    }

    static void fill(int[] array) {
        Random r = new Random();
        for (int i = 0; i < array.length; i++)
            array[i] = r.nextInt(10);
    }

    static void meetingFrequency(int[] array) {
        // int elem;
        // elem = 0;
        int num;
        num = 0;
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array.length; j++)
                // elem = array[i];
                if (array[i] == array[j]) {
                    num++;
        System.out.printf("i=%d; num=%d =>  ", array[i], num);
        num = 0;
        }
    }

    static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d ", array[i]);
        }
        // Scanner scanner;
        // scanner.close();
    }

}
