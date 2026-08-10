import java.util.Scanner;

public class BankingApplication {
       public static void main(String[] args)
    {
    int balance=1000;
    Scanner sc=new Scanner(System.in);
    System.out.println("select choise from below");
    System.out.println("1.Withdraw");
    System.out.println("2.Deposite");
    System.out.println("3.Check balance");
    System.out.println("Enter Choice number:");
    int choice=sc.nextInt();
    try
    {
   switch (choice) {

    case 1://withdraw

      System.out.println("ENTER AMOUNT:");
      int amount=sc.nextInt();
        if (amount>balance)
        {
          throw new Exception();
        }
        else{
            balance=balance-amount;
            System.out.println("Transaction Successful");
        }     
        break;

    case 2://deposite

       System.out.println("ENTER AMOUNT:");
       int Money=sc.nextInt();
       balance=balance+Money;
       System.out.println("Transaction Successful:Amount creadited");
       break;

    case 3://checking Balance

       System.out.println("current balance:"+balance);   
       break;
   
    default:
    System.out.println("Emter Valid choice");
    break;
   }
}
catch(Exception e)
{
    System.out.println("Not enough balance");
}


 }
}
