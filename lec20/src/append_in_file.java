import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class append_in_file {
    void main(){
        // public static void main(String[] args)
        {
            create_data();
            try {
                File file=new File("index.html");
                if(file.createNewFile())
                {
                    System.out.println("---done!!\n file created---");
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
    static void create_data()
    {
        try {
            FileWriter writer=new FileWriter("index.html",true);
           // writer.write("---heyyy everyone!!!!\n -----new data is inserted to the file----");
            writer.write("ab aap pehle wala  data v dekh skte h ----");
            writer.close();
        } catch (Exception e) {
            // throw new RuntimeException(e);
            System.out.println(e);
        }
    }

}
