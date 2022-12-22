package testJava;

/*
 * Из  2 попасть в 11 прибавляя 1 или умножая на 2
 * 
 */
public class test_14_1 {
    public static void main(String[] args) {
        int num = 11;
        //int sum = 0;
        if (num % 2 != 0)  
            num = num - 1;    
        if (num % 2 == 0)
            num = num / 2;
        System.out.print(num);   
    }
}
