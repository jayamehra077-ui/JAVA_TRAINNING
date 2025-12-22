public class LowIndexOfMountainArray {
    public static void main(String[] args) {
        int[]  a={1,0,4,9,6,2};
        solution1 s1=new solution1();
        s1.peak_index(a);


    }
}
class solution1
{
    public int peak_index(int[] arr)
    {


        //int arr[] = {2, 0, 4, 6, 9};
        int low = 0;
        int height = arr.length;
        while (low < height) {
            int mid = (low + height) / 2;
            if (arr[mid] < arr[mid + 1]) {
                low = mid ;
            } else {
                height = mid+1;
            }
        }
        System.out.println("low index of mountain array:"+low);
        return low;
    }

}
