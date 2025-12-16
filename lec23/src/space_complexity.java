import java.util.HashMap;

public class space_complexity {
    public static void main(String[] args)
    {



                  //  HashMap < Integer, Integer > map = new HashMap<>();
        }
    }

public int majority_element(int[] nums)
{
    HashMap < Integer, Integer > map = new HashMap<>();
    for(int i:nums)
    {
        map.put(i,map.getOrDefault(i,0)+1);
        if(map.get(i)>nums.length/2)
        {
            return 1;
        }
    }
    return -1;
}
