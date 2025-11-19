import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no. of elements:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        // int min = arr[0];
        System.out.println("enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            // sum=sum+arr[i];
        }
        System.out.println("array:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("Reverse array:");
        for (int i = n-1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
}
    }
