package testJava;

public class test_16 {
    public static void main(String[] args) {
        int[] a = { 2, -5, 3, 0, 5, -8, 12, 1 };
        int t = 0;
        System.out.println(max(a));
        System.out.print(sort(a, t));
    }

    public static int max(int[] array) {
        int temp = 0;
        for (int i = 0; i < array.length; i++)
            temp = array[i];
        for (int j = 0; j < array.length; j++) {
            if (array[j] > temp)
                temp = array[j];
        }
        return temp;
    }

    public static int sort(int[] array, int  t) {
        for (int i = 0; i < array.length; i++)
            t = array[i];
        for (int j = 0; j < array.length; j++) {
            if (array[j] < t)
                t = array[j];
        }
        return t;
    }
}