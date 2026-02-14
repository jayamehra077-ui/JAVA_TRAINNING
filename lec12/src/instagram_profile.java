import java.util.Scanner;
public class instagram_profile {
    public static void main(String[] args)
    {
       instagram x1=new instagram();
       x1.get_instagram();
       x1.set_instagram();
    }
}
class instagram
{
    String user_name="nehu_.x._04";
    int followers=2000;
    int following=1000;
    int post=100;
    public void get_instagram()
    {
        System.out.println("!!!!!!!!!--------MY INSTAGRAM PROFILE DETAILS-----------!!!!!!!!!!!");
        System.out.println("user_name="+user_name);
        System.out.println("number of followers="+followers);
        System.out.println("number of followings="+following);
        System.out.println("number of posts="+post);
        System.out.println("\n");
    }
    public void set_instagram()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1 for adding the post..\n2 for deleting the post :");
        int n=sc.nextInt();
        System.out.println("enter no of post to be added/deleted:");
        int x =sc.nextInt();

        switch (n)
        {
            case 1:System.out.print("---number of post increases----\n now total post="+(x+post));
                  break;
            case 2:System.out.print("---number of post decreases----\n now total post="+(x+post));
                break;
            default:System.out.println("--INVAILID INPUT---") ;
        }
        System.out.println("\n");
        System.out.println("enter 1 for addition of followings..\n2 for decreasing the followings :");
        int y=sc.nextInt();
        System.out.println("enter no of followings to be added/removed:");
        int z =sc.nextInt();
        switch (y)
        {
            case 1:System.out.print("---number of following increases----\n now total post="+(z+following));
                break;
            case 2:System.out.print("---number of following decreases----\n now total post="+(following-z));
                break;
            default:System.out.println("--INVAILID INPUT---") ;
        }
        System.out.println("\n");
        System.out.println("enter 1 for addition of followers..\n2 for decreasing the followers :");
        int a=sc.nextInt();
        System.out.println("enter no of followers to be added/removed:");
        int b =sc.nextInt();
        switch (a)
        {
            case 1:System.out.print("---number of followers increases----\n now total post="+(b+following));
                break;
            case 2:System.out.print("---number of followers decreases----\n now total post="+(following-b));
                break;
            default:System.out.println("--INVAILID INPUT---") ;
        }
    }

}
