package testJava;

/**
 *     Ханойская башня
 */


public class test_8 {
    public static void main(String[] args) {
        int towers = 3;
        go(towers, 'A', 'B', 'C');
    }

    public static void go(int up, char from, char transit, char to) {
        if (up == 1)
            System.out.println("Диск 1 из " + from + " к " + to);
        else {
            go(up - 1, from, to, transit);
            System.out.println("Диск "
                    + up + " из " + from + " к " + to);
            go(up - 1, transit, from, to);
        }
    }
}
