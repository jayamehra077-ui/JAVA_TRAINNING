public class youtube_channal {
    public static void main(String[] args)
    {
        youtube y1=new youtube();
        y1.get_subscriber();
        y1.set_subscriber(300);
    }
}
class youtube
{
   public String user_id="sovereign_girl321";
   public int total_subscriber=12000;
    public void get_subscriber()
    {
        System.out.println("channal name="+user_id);

System.out.print("total subscriber="+total_subscriber);
        System.out.print("\n");
    }

    public void set_subscriber(int count)
    {
        if(count<total_subscriber)
        {
            total_subscriber-=count;
            System.out.println("-!!!!!!!-subscriber km ho gye h,now count="+total_subscriber);
        }
        else
        {
            total_subscriber+=count;
            System.out.println("-!!!!!!!-number of subscriber increase  ho gye h\n now count="+total_subscriber);
        }
    }
}