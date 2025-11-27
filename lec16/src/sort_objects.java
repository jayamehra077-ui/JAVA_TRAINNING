import java.util.*;
public class sort_objects {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();
        list.add(new Student("NEHA",151));
        list.add(new Student("NAMAN",152));
        list.add(new Student("RIYA",52));
        list.add(new Student("RISHIKA",272));
        list.add(new Student("RITIKA",15));
        System.out.println("----student_list--\n"+list);
        Collections.sort(list);
        System.out.println("----sorted_student_list--\n"+list.toString());

    }
}
    class Student implements Comparable<Student> {
        String name;
        int roll_num;

        public Student(String name, int roll_num) {
            this.name = name;
            this.roll_num = roll_num;
        }

        public int compareTo(Student s1) {
            return this.roll_num - s1.roll_num;
        }
    }

