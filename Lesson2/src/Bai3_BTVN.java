import java.util.Scanner;

/*
    Input: Mot so nguyen n
    Output: Ma tran xoan oc n x n
*/

public class Bai3_BTVN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;
        do{
            System.out.println("Nhap kich thuoc cua ma tran: ");
            int n = sc.nextInt();

            int r1 = 0, r2 = n - 1, c1 = 0, c2 = n - 1;
            int count = 1;
            int[][] maTran = new int[n][n];
            while ((r1 <= r2) && (c1 <= c2)) {
                for (int i = c1; i <= c2; i++) {
                    maTran[r1][i] = count;
                    count++;
                }
                r1 += 1;
                for (int i = r1; i <= r2; i++) {
                    maTran[i][c2] = count;
                    count++;
                }
                c2 -= 1;
                for(int i = c2; i >= c1; i--) {
                    maTran[r2][i] = count;
                    count++;
                }
                r2 -= 1;
                for(int i = r2; i >= r1; i--) {
                    maTran[i][c1] = count;
                    count++;
                }
                c1 += 1;
            }

            System.out.println("Ma tran xoan " + n + " x " + n + " la: ");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(maTran[i][j] + " ");
                }
                System.out.print("\n");
            }
            System.out.println("Ban co muon tiep tuc khong (y/n): ");
            ch = sc.next().charAt(0);
        }while(ch == 'y');
        sc.close();
    }
}
