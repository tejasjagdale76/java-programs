class InsufficientFundException extends Exception{
    InsufficientFundException(double balance,double deficit)
    {
        System.out.println("Not Enough Balance");
        System.out.println("current Balance:"+balance);
        System.out.println("deficite  amount:"+deficit);
    } 
}