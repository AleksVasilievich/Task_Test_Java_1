package testJava;

public class test_8 {
    public static void main(String[] args) {
        int towers = 3;
        go(towers, 'A',  'B', 'C');
    }
    
    public static void go(int up, char from, char transit, char to) {
        if (up == 1)
            System.out.println("Disk 1 from " + from + " to " + to);
        else {
            go(up - 1, from, to, transit);
            System.out.println("Disk "
                    + up + " from " + from + " to " + to);
            go(up - 1, transit, from, to);
        }
    }
}
