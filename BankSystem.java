import java.util.Scanner;
class InsufficientFundsException extends Exception{
    public InsufficientFundsException(){
  super(" Insufficient money in account ");
    }
}
public class BankSystem{

 
void performTransaction(int choice,double money){
 try{
double balance=100;
switch(choice){

case 1:{
balance=balance+money;
 System.out.println("money Deposited");
 break;
 }


case 2:
    {
if(balance<money){
throw new InsufficientFundsException();

}
else{
balance=balance-money;
System.out.println("Money withdrawal Successful");
}
break;
 }
}
 }
catch(InsufficientFundsException e)
{
    System.out.println(e.getMessage());
}  
    }
public static void main(String[]arg)
{
Scanner scanner=new Scanner(System.in);
System.out.println("select 1 or 2 for operation");
System.out.println("1.Deposite");
System.out.println("2.Withdraw");

 int choice=scanner.nextInt();
 System.out.print("Enter amount:");
 int money=scanner.nextInt();

 BankSystem obj=new BankSystem();
 obj.performTransaction(choice,money);
}
}

