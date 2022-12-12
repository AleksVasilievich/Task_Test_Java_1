import java.util.Random;
import java.util.Scanner;

public class program_3 {
    // private static int i;

    public static void main(String[] args) {
        int count = getValue("Введите размер");
        int[] array = create(count);
        fill(array);
        // print(array);
        FrequencyMeeting(array);
        print(array);
    }

    static int getValue(String text) {
        System.out.println("Введите размер массива");
        Scanner size_ar = new Scanner(System.in);{
            int count = size_ar.nextInt();
            size_ar.close();
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

    static void FrequencyMeeting(int[] array) {
            for (int i = 0; i < array.length; i++) {
                int num = 0;
                for (int j = 0; j < array.length; j++)
                    if (array[i] == array[j])
                        num++;
                System.out.println(array[i] + " Встречается " + num + " раз");
    
            }
        }

    static void print(int[] array) {
        System.out.println(" Наш массив ");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d ", array[i]);
        }
    }
}
