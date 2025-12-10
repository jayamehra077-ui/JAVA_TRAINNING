import java.io.*;
import java.io.FileWriter;
import java.io.IOException;

//public class read_data {
    void main(){
        // public static void main(String[] args)
        {
            readData();
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
    /*static void create_data()
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
static void readData()
{
    try {
        FileReader reader=new FileReader("index.html");
        int ch;
        while((ch=reader.read())!=-1)
        {
            System.out.print((char)ch );
        }
    } catch (IOException e) {
       // throw new RuntimeException(e);
        System.out.println(e);
    }
}
