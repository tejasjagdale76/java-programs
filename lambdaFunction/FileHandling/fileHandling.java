import java.io.*;
public class fileHandling {
    public static void main(String[] args) {
        try{
        File f=new File("tejas.txt");

        FileWriter fw=new FileWriter("tejas.txt");

       

        System.out.println("file exixt:"+f.exists());
        fw.write("hello tejas ");
        fw.close();
        System.out.println("text written successfully");

         FileReader fr=new FileReader("tejas.txt");

         int ch;
         while((ch=fr.read())!=-1);
         {
            System.out.print((char) ch);
         }


    }catch(IOException e)
    {
       System.out.println(e.getMessage());
    }
}
}
