package testJava;

/*
 * Из  2 попасть в 11 прибавляя 1 или умножая на 2
 * 
 */
public class test_14_1 {
    public static void main(String[] args) {
        //int n = 11;
        int[] array = new int[12];
        array[2] = 1;
        for (int i = 2; i < array.length; i++) {
            array[i] = array[i] + array[i - 1];
            if (i % 2 == 0)
                array[i] = array[i] + array[i / 2];
            System.out.print(array[i]);
        }

    }
}
