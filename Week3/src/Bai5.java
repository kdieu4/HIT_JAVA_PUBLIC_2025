import java.util.Scanner;

public class Bai5 {
    public static int[][] createMatrix(int n) {
        int[][] matrix = new int[n][n];
        int value = 1, top = 0, bottom = n - 1, left = 0, right = n - 1;

        while (value <= n * n) {
            for (int i = left; i <= right; i++) {
                matrix[top][i] = value;
                value++;
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = value;
                value++;
            }
            right--;
            for (int i = right; i >= left; i--) {
                matrix[bottom][i] = value;
                value++;
            }
            bottom--;
            for (int i = bottom; i >= top; i--) {
                matrix[i][left] = value;
                value++;
            }
            left++;
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        System.out.println("Ma trận xoắn ốc: ");
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.printf("%d ", num);
            }
            System.out.println();
        }
    }

    public static int sum(int[][] matrix) {
        int sum = 0;
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            sum += matrix[i][i];
            sum += matrix[n - i - 1][i];
        }
        if(n % 2 != 0){
            sum -= matrix[n / 2][n / 2];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập kích thước ma trận n: ");
        int n = sc.nextInt();

        int[][] matrix = createMatrix(n);

        printMatrix(matrix);

        System.out.println("Tổng các phần tử trên đường chéo: " + sum(matrix));

    }
}
