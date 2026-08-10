// Banking System Validation: Create a checked exception named InsufficientFundsException. 
// Write a BankAccount class with a withdraw(double amount) method that throws this exception 
// if the withdrawal amount exceeds the current balance. 
// The exception should display the current balance and the deficit amount.

import java.util.Scanner;

class BankAccount{
        
      public double balance=100;
    void withdraw(double amount)
    {
        try{
         if (balance<amount)
          { 
             double deficit=amount-balance;
              throw new InsufficientFundException(balance,deficit);
          }
         else {
                balance=balance-amount;
            }
        }
        catch(InsufficientFundException e)
        {
         System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Amount to Withdraw:");
        double Amount=sc.nextInt();
        BankAccount obj=new BankAccount();
        obj.withdraw(Amount);
    }
}