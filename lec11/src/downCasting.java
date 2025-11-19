public class downCasting {
    public static void main(String[] args)
    {
        birds s1=new sparrow();
        s1.eat();
      // sparrow s2=sparrow()s1;
    }

}
class birds {
    void eat() {
        System.out.println("pizzaaaaaa!!");
    }


}

class sparrow extends birds {
    void eat() {
        System.out.println("biryaniiiii!!");
    }
}




