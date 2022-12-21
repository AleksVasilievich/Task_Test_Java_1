package testJava;

public class test_17 {
    public static void main(String[] args) {
        int[] a = { 2, -5, 3, 0, 5, -8, 12, 1 };
        int t = a[0];
        System.out.println(max(a, t));
        min(a, t);
    }

    public static int max(int[] array, int t) {
        for (int i = 0; i < array.length; i++)
            t = array[i];
            for (int j = 0; j < array.length; j++) {
                if (array[j] > t)
                    t = array[j];
        }
        return t;
    }

    public static void min(int[] array, int  t) {
        for (int i = 0; i < array.length; i++)
            t = array[i];
            for (int j = 0; j < array.length; j++) {
                if (array[j] < t)
                    t = array[j];
            }
        System.out.print(t);
    }

    // public static void sort(int[] array, int t) {
    //     for (int i = 0; i < array.length; i++)
    //         t = array[i];
    //         for (int j = 0; j < array.length; j++) {
    //             if (array[j] < t)
    //                 t = array[j];
    //     }
    // }
}
