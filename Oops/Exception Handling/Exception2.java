
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception2 {
    public static void main(String[] args) throws FileNotFoundException  {
        
        File f =new File("/Exception Handling/hi.txt");
        try {
        FileInputStream  i = new FileInputStream(f);
        // System.out.println(i.toString());

            
        } catch (Exception e) {
            // System.out.println(e.getMessage());
            throw e;
        }
    }
}