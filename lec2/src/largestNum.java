import java.util.Scanner;
public class largestNum {
    public static void main(String[] args)
    {
        System.out.println("enter 1st num.:");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println("enter 2nd num.:");
        int y=sc.nextInt();
        if(x>y)
        {
            System.out.println("1st num. is greater");
        }
        else {
            if(y>x)
            {
                System.out.println("2nd num. is greater");
            }
            else {
                System.out.println("both are equal");
            }
        }
    }
}
