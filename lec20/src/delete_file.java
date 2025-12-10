import java.io.*;
import java.io.FileWriter;
import java.io.IOException;

//public class delete_file {
    void main(){
        // public static void main(String[] args)
        {
            //create_data();
            try {
                File file=new File("index.html");
                if(file.createNewFile())
                {
                    System.out.println("---done!! file created---");
                }
                else {
                    System.out.println("---sorry!! file of this name is already created---");
                }
            } catch (IOException e) {
                //  throw new RuntimeException(e);
                System.out.println(e);
            }
        }
    }
   /* static void create_data()
    {
        try {
            FileWriter writer=new FileWriter("index.html");
            writer.write("---heyyy everyone!!!!\n -----new data is inserted to the file----");
            writer.close();
        } catch (Exception e) {
            // throw new RuntimeException(e);
            System.out.println(e);
        }
    }

}*/
static void deleteFile()
{
    //File file=new File("index.html");
    try {
        File file=new File("index.html");
        if(file.delete())
        {
          System.out.println("deleted");
        }
        else {
            System.out.println("not deleted");
        }

    } catch (Exception e) {
       // throw new RuntimeException(e);
        System.out.println(e);
    }
}
