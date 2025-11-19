import java.util.Scanner;

public class linearSearch {
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
        System.out.println("enter element to be search:");
        int x=sc.nextInt();
        boolean found=false;
        for(int val:arr)
        {
            if(val==x)
            {
                found=true;
                break;
            }
        }
        if(found)
        {
            System.out.println(x+ "is present in the array");
        }
        else {
            System.out.println(x+ "is not present in the array");
        }
    }
}
