public class class_student {
    public static void main(String[] args)
    {
        student obj=new student("jaya",1,90);
        student obj2=new student("rishika",2,99);
        student obj3=new student("riya",3,98);


    }
}
class student
{
   student(String name,int roll_num,int marks)
   {
       System.out.print(name);
       System.out.println(roll_num);
       System.out.println(marks);
   }

}
