public class exception_for_oddnum {
    public void odd(int num)throws Exception{
     if(num%2==0)
     {
        System.out.println("even number");
     }
     else{
        throw new Exception();
     }
    }
    public static void main(String[] args) {
        exception_for_oddnum obj=new exception_for_oddnum();
        try{
            obj.odd(3);
        }
        catch(Exception e)
        {
           System.err.println(e.getMessage());
           e.printStackTrace();
            
        }
    }
}
