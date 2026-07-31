import java.util.Scanner;
public class illegalARG {
    public void arg(int a)
    {
      System.out.println("value of a is :"+ a);
    }
    public static void main(String[] args) {
        illegalARG obj=new illegalARG();
        Scanner sc=new Scanner(System.in);
       
        try{ 
            int b=sc.nextInt();

        obj.arg(b);
        }
    catch(Exception e)
{
 
  System.out.println("invalid input");
}
}
}
