public class exception_handling2 {
    public static void main(String[] args)
    {
        System.out.println("--heyy--");
        try {
            int arr[]={1,3,4,5,6};
            System.out.println(arr[6]);

        } catch (Exception e) {
            //throw new RuntimeException(e);
            System.out.println(e);
        }
        System.out.println("--byeee---");
    }
}
