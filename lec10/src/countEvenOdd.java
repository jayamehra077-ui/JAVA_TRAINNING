import java.util.Scanner;

public class countEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no. of elements:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int max = arr[0];
        System.out.println("enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            // sum=sum+arr[i];
        }
        System.out.println("array:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        int even=0;
        int odd=0;
        for (int i = 0; i < n; i++)
        {
            if(arr[i]%2==0)
            {
                even++;
            }
            else {
                odd++;
            }
            System.out.println("even:"+even+"odd:"+odd);
        }
    }
}