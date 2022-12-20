package testJava;


public class test_14 {
    public static void main(String[] args) {
        System.out.println(F(2, 222));
    }

    public static int F(int a, int b) {
        if (b == a)
            return 1;
        else if (b < a)
            return 0;
        else if (b % 2 != 0)
            return F(a, b - 1);
        else
            return F(a, b - 1) + F(a, b / 2);
    }

}
