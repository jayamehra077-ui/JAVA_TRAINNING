import java.util.Scanner;

public class maxElement {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no. of elements:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        int max=arr[0];
        System.out.println("enter elements:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            // sum=sum+arr[i];
        }
        System.out.println("array:");
        for(int i=0;i<n;i++) {
            System.out.println( arr[i]);
        }
        //System.out.println("sum= "+sum);
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max) {
                max=arr[i];
            }
        }
        System.out.println("max= "+max);
    }

}

