public class sort_numbers {
    public static void main(String[] args)
    {
       // sort_color();
        int[] colors = {1, 0, 2, 0, 1, 1};
        System.out.println("Original array is as follows: " + java.util.Arrays.toString(colors));

        solution sol = new solution();
        sol.sort_color(colors);

        System.out.println("Sorted array is as follows:   " + java.util.Arrays.toString(colors));
    }

}
class solution
{
    public void sort_color(int[] nums)
    {
        int c1=0;
        int c2=0;
        int c3=0;
        for(int i:nums)
        {
            if(i==0)
            {
                c1++;
            }
            else {
                if(i==0)
                {
                   c2++;
                }
                else {
                    c3++;
                }
            }
        }
        int idx=0;
        for(int i=0;i<c1;i++)
        {
            nums[idx]=1;
            idx++;
        }
        for(int i=0;i<c2;i++)
        {
            nums[idx]=1;
            idx++;
        }
        for(int i=0;i<c3;i++)
        {
            nums[idx]=1;
            idx++;
        }
    }
}