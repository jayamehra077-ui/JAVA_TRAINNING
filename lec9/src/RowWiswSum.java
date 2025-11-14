public class RowWiswSum {
    public static void main(String[] args)
    {
        int arr[][]={{1,2,3},{2,3,4},{0,9,7} };
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.print("\n");
        }
        for(int i=0;i<arr.length;i++)
        {
            int rowsum=0;
            for(int j=0;j<arr[i].length;j++)
            {
                rowsum=rowsum+arr[i][j];
            }
            System.out.print("sum of row elements="+rowsum);
        }
       // System.out.print("sum of row elements="+rowsum);
    }
}

