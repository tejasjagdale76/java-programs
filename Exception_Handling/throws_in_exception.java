public class throws_in_exception {
     public void checknumber (int num)throws Exception
      {
        if(num>0)
        {
            System.out.println("entered number is positive");
        }
        else{
            throw new Exception();
        }
      }
    public static void main(String[] args){
       throws_in_exception obj=new throws_in_exception();
      try{
        obj.checknumber(-10);
      }
      catch(Exception e)
      {
       e.printStackTrace();
       System.err.println("negative number not allowed");
      }
    }
}
