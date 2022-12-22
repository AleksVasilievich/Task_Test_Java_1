package testJava;

/*
 * Из  2 попасть в 11 прибавляя 1 или умножая на 2
 */
public class test_14 {
    public static void main(String[] args) {
        F(2, 5);
    }

    // public static int F(int a, int b) {
    // if (b == a)
    // return 1;
    // else if (b < a)
    // return 0;
    // else if (b % 2 != 0)
    // return F(a, b - 1);
    // else
    // return F(a, b - 1) + F(a, b / 2);
    // }

    public static void F(int a, int b) {
        int[] array = new int[b];
        array[1] = a;
        //array[-1] = b;
        for (int i = 1; i < array.length; i++) {
            array[i] = array[i] + array[i - 1];
            if (i % 2 == 0) {
                array[i] = array[i] + array[i / 2];
            }    
       }
    
        System.out.print();
    }

}
