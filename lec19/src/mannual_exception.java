/*public class mannual_exception {
    public static void main(String[] args)
    {
      try {
          voteAge(30);
      } catch (Exception e) {
         // throw new RuntimeException(e);
          System.out.println(e);
      }
        try {
            voteAge(15);
        } catch (Exception e) {
            // throw new RuntimeException(e);
            System.out.println(e);
        }
    }

}*/
static void voteAge(int age)
{
    System.out.println("---CHECK FOR VOTE---");
    if(age<18)
    {
        throw new IllegalArgumentException("aap vote nahi de sakte hai....");
    }
}

void main() {
   // public static void main(String[] args)
    {
        try {
            voteAge(30);
        } catch (Exception e) {
            // throw new RuntimeException(e);
            System.out.println(e);
        }
        try {
            voteAge(15);
        } catch (Exception e) {
            // throw new RuntimeException(e);
            System.out.println(e);
        }
    }

}
