import java.util.Scanner;

import java.util.InputMismatchException;

public class input_mismatch_Exception {
     void display(int a)
        {
            int b=a;
          System.out.println("entered nuber is : "+ b);
        };

    
    public static void main(String[] args)
    {
        try
    { 
       Scanner sc=new Scanner(System.in);
       input_mismatch_Exception obj=new input_mismatch_Exception();       System.out.println("Enter number: ");
       int b=sc.nextInt();
       obj.display(b);

    }
    catch(InputMismatchException e)
{
  System.out.println("Enter Valid Input");
}
    }
}
