import java.util.Scanner;
public class stringException {
    public void checkstring(String name) throws Exception
    {
        boolean ch=false;
        for(int i=0;i<name.length();i++){
          if(name.charAt(i)=='a' || name.charAt(i)=='e' || name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u')
          {
            System.err.println("valid string as it contain vowels" );
            ch=true;
            break;
          }}
          if(ch==false)
          {
            throw new Exception();
          }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        stringException obj=new stringException();
        try{
        obj.checkstring(str);
        }catch(Exception e)
        {
            System.err.println("invalid string");
        }
    }
}
