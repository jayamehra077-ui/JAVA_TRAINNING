public class peakIndexInMountainArray {
    public static void main(String[] args) {
        int[]  a={1,0,4,7,8,1,2,3,4,5,6,7,8,9,0};
        solution s1=new solution();
        s1.peak_index(a);


    }
}
class solution
{
    public int peak_index(int[] arr)
    {


    //int arr[] = {2, 0, 4, 6, 9};
    int low = 0;
    int height = arr.length;
        while (low < height) {
            int mid = (low + height) / 2;
            if (arr[mid] < arr[mid + 1]) {
                low = mid + 1;
            } else {
                height = mid;
            }
        }
System.out.println("peak index of mountain array:"+low);
    return low;
}

}