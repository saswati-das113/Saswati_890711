

package ans;
import java.nio.file.*;

public class readfile  {
    public static String readAll(String filename) throws Exception{
        String data="";
        data=new String (Files.readAllBytes(Paths.get(filename)));
        return data;
    }
    public static void main(String args[]) throws Exception{
        String data=readAll("C:\\sas.txt\\cc1");
        System.out.println(data);
    }
    
}
