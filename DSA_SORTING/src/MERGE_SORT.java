import java.util.ArrayList;

public class MERGE_SORT {
    public static void main(String[] args)
    {
        int[] arr={2,4,6,8,9,1,2,3,4,5,6,7};
        merge_sort_array_list m1=new merge_sort_array_list();
        m1.sort(arr,0, arr.length);
    }
}
class merge_sort_array_list
{
    static void sort(int[] arr,int l,int r)
    {
        if(l>=r)
        {
            return;
        }
        int mid=(l+r)/2;
        sort(arr,l,mid);
        sort(arr,mid+1,r);

    }
    static void merge(int[] arr,int l,int mid, int r)
    {
        ArrayList<Integer> temp=new ArrayList<>();
        int i=l;
        int j=mid+1;
        while(i<=mid&&j<=r)
        {
            if(arr[i]<=arr[j])
            {
                temp.add(arr[i]);
                i++;

            }
            else {
                temp.add(arr[j]);
                j++;
            }
        }
    }
}
