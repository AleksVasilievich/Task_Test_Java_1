package PROJECT;

/*
 * На вход подаются числа n и m. Выведите таблицу умножения n * m . Input:  3 4;
 * Output:   1 2 3 4
             2 4 6 8
             3 6 9 12
 */
import java.util.Scanner;

public class program_1 {
    public static void main(String[] args) {
        //arrValue();
        arrIndex();
    }

    static void arrValue() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.close();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = (i + 1) * (j + 1);
                if (j < (m - 1))
                    System.out.print(arr[i][j] + " ");  // эти условия чтобы в конце каждой строки 
                                                        // в консоле не ставился пустой символ.
                if (j == (m - 1))
                    System.out.print(arr[i][j] + "\n");
            }
        }
    }

    static void arrIndex() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.close();
        for (int i = 1; i <= n; ++i)
            for (int j = 1; j <= m; ++j) {
                if (j < m)
                    System.out.print(i * j + " ");  //  эти условия чтобы в конце каждой строки 
                                                    //  в консоле не ставился пустой символ.
                if (j == m)
                    System.out.print(i * j + "\n");
            }
    }
}
