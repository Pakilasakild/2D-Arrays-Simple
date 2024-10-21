import java.util.Scanner;

public class Main {

    private static void arrout(int n, int[][] arr) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        int arr1[][] = new int[n][n];
        int arrs[][] = new int[n][n];
        int arrm[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arrs[i][j] = arr[i][j] + arr1[i][j];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arrm[i][j] = arr[i][j] * arr1[i][j];
            }
        }
        System.out.println("Array: ");
        arrout(n, arr);
        System.out.println("Added to array: ");
        arrout(n, arr1);
        System.out.println("Equals: ");
        arrout(n, arrs);
        System.out.println("Array: ");
        arrout(n, arr);
        System.out.println("Multiplied with array: ");
        arrout(n, arr1);
        System.out.println("Equals: ");
        arrout(n, arrm);
    }
}
