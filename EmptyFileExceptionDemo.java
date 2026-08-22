// Write a Jav program that reads a file and throws an exception if the file is empty.
//Custom Exception used having name "EmptyFileException"

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class EmptyFileExceptionDemo{
    public static void main(String[] args) {
        try{
        FileReader fr=new FileReader("tejas.txt");
        int ch=fr.read();
        if(ch==-1)
        {
           throw new EmptyFileException("Empty file");
        }
        else{
            while((ch=fr.read())!=-1)
            {
               System.out.print((char) ch);
            }
        }
        }
        catch(EmptyFileException c)
        {
          System.out.println(c.getMessage());
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File Not Found");
        }
        catch(IOException s)
        {
            System.out.println(s.getMessage());
        }
    }
}