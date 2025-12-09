public class sliding_window {
    public static void main(String[] args) {
        int arr[] = {5, -3, 0, 3, 7};
        int k = 3;
        int maxsum = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < k; j++) {
                maxsum = maxsum + arr[k];

            }
                System.out.println(maxsum);

        }
    }
}
