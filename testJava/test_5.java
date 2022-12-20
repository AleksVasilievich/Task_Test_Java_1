package testJava;

/**
 * test_5   /**
 * Составить частотный словарь элементов одномерного массива
 * Частотный словарь содержит информацию о том, сколько раз встречается элемент
 * входных данных.
 */

// import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class test_5 {
    public static void main(String[] args){
        int count = getValue("Введите размер");
        int[] array = create(count);
        fill(array);
        //print(array);
        FrequencyMeeting(array);
        // int[] array = elemClear()
        print(array);
    } 
    
    static int getValue(String text) {
        System.out.println("Введите размер массива");
        Scanner size_ar = new Scanner(System.in);
        int count = size_ar.nextInt();
        size_ar.close();
        return count;

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
            //boolean sum = false;
            for (int j = 0; j < array.length; j++)
                if (array[i] == array[j]) {
                    num++;
                    //System.out.println(array[i] + " Встречается " + num + " раз");
                }
                System.out.println(array[i] + " Встречается " + num + " раз");
                   
                
           

        }
    }

    static void print(int[] array) {
        System.out.println(" Наш массив ");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d ", array[i]);
        //System.out.println();
        }
    }
}
    // static void elemClear(int [] array) {
    //     // List list = Collections.synchronizedList(new ArrayList());
    //     ArrayList objArray = new ArrayList();
    //     objArray.clear();
    //     objArray.add(0, "Привет");
    //     objArray.add(1, "Здравствуйте");
    //     objArray.add(2, "Hello");
    //     System.out.println("Текст 1：" + objArray);
    //     objArray.remove(1);
    //     objArray.remove("");
    //     System.out.println("Текст 2：" + objArray);
    // }
