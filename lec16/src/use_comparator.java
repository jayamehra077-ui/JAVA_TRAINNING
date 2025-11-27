import java.util.*;
import java.util.Collections;

public class use_comparator {
    public static void main(String[] args) {
        ArrayList<Student1> list = new ArrayList<>();
        list.add(new Student1("NEHA", 151));
        list.add(new Student1("NAMAN", 152));
        list.add(new Student1("RIYA", 52));
        list.add(new Student1("RISHIKA", 272));
        list.add(new Student1("RITIKA", 15));
        System.out.println("----student_list--\n" + list);
        Collections.sort(list);
        System.out.println("----sorted according to roll_num--\n" + list.toString());
        Collections.sort(list, new name_sorted());
        System.out.println("--sorted according to name--\n");
        for (Student1 s : list) {


            System.out.println(s.roll_num+" "+ s.name);
        }
    }
}
class Student1 implements Comparable<Student1> {
    String name;
    int roll_num;

    public Student1(String name, int roll_num) {
        this.name = name;
        this.roll_num = roll_num;
    }
    public String toString()
    {
        return this.roll_num +" "+name;
    }

    public int compareTo(Student1 s1) {
        return this.roll_num - s1.roll_num;
    }
}
class name_sorted implements Comparator<Student1>
{
    public int compare(Student1 s1,Student1 s2)
    {
        return s1.name.compareTo(s2.name);
    }
}




