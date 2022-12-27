package TEST_2;

import java.util.Scanner;

// public class test_2 {
//     public static void main(String[] args) {
//         try (Scanner sc = new Scanner(System.in)) {
//             int n = sc.nextInt();
//             int m = sc.nextInt();
//             for (int i = 1; i <= n; ++i)
//                 for (int j = 1; j <= m; ++j) {
//                     if (j < m)
//                     System.out.print(i * j + " ");
//                     if (j == m)
//                     System.out.print(i * j + "\n");
//                 }

//         }
//     }
// }

/**
 * test_2
 */
public class test_2 {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in); 
        // int n = sc.nextInt();
        // int m = sc.nextInt();
        // sc.close();
        // for (int i = 1; i <= n; ++i)
        //     for (int j = 1; j <= m; ++j) {
        //         if (j < m)
        //             System.out.print(i * j + " ");
        //         if (j == m)
        //             System.out.print(i * j + "\n");
        //         }
        
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.close();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr [i][j] = (i + 1) * (j + 1);
                if (j < (m - 1))
                    System.out.print(arr[i][j] + " ");
                if (j == (m - 1))
                    System.out.print(arr[i][j] + "\n");
            }
        }
    }
}