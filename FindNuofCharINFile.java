import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class FindNuofCharINFile {
    public static void main(String[] args) {
        try{        
       FileReader fr=new FileReader("tejas.txt");
        int ch;
        int count=0;
        while((ch=fr.read())!=-1)
        {
            if(ch!=-1)
            {
                count++;
            }
            System.out.print((char) ch);
        }
        System.out.println("");
        System.out.println("number of character in a file:" + count);
        }
        catch(FileNotFoundException e)
        {
        System.out.println("File does not exists ");
        } catch (IOException e) {           
            e.printStackTrace();
        }       
    }
}
