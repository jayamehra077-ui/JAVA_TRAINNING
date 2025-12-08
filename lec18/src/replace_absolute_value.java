import java.util.ArrayList;
import java.util.ListIterator;

public class replace_absolute_value {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        ListIterator<Integer> it = list.listIterator();
        /*System.out.println("---sequence wise--");
        while (it.hasNext()) {
            // System.out.println(it.next());
            Integer x = it.next();

            System.out.println(x);
        }
        System.out.println("---reverse order--");
        while (it.hasPrevious()) {
            // System.out.println(it.next());
            Integer y = it.previous();

            System.out.println(y);
        }*/
        while (it.hasNext()) {
            // System.out.println(it.next());
            Integer a = it.next();
            if(a<0)
            {
                int value=a*(-1);
                it.set(value);
                System.out.println(value);
            }

        }
    }
}