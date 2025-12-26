public class element_jump {
    public static void main(String[] args)
    {
        int[] colors = {1, 0, 2, 0,1,2, };
        solution s1= new solution();
       boolean x= s1.can_jump(colors);
       System.out.println(x);
    }
}
class solution
{
    public boolean can_jump(int[] nums)
    {
        int maxR=0;
        for (int i=0;i<nums.length;i++)
        {
            if(i>maxR)
            {
                return false;
            }
            maxR=Math.max(maxR,i+nums[i]);
        }
        return true;
    }
}