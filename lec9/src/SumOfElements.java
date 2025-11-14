public class SumOfElements {
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3}, {2, 3, 4}, {0, 9, 7}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum = sum + arr[i][j];
            }
        }
        System.out.print("sum of elements="+sum);
    }
}



