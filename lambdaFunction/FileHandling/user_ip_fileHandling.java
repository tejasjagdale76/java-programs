import java.io.*;
import java.util.Scanner;
public class user_ip_fileHandling {
    public static void main(String[] args) {

        String ab="file_1.txt";

    try(FileWriter fw=new FileWriter(ab,true);){
     Scanner sc=new Scanner(System.in);
     String ch=sc.nextLine();

    fw.write(ch);
    //fw.close();
    }
    catch(IOException e)
    {

        System.out.println(e.getMessage());
    }
    try{

    FileReader fr=new FileReader(ab);
    int ch;
    while((ch=fr.read())!=-1){
        System.out.print((char) ch);
    }
    fr.close();
}
     catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        catch (IOException e) {
            System.out.println("Error reading file");
        }

    }
}
