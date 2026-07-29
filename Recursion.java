public class Recursion {

    int recursion(int n)
 
    {        
         if(n>=1){
          return n*recursion(n-1);
         }
         else{
            return 1;
         }
    }
    public static void main(String[] args) {
     Recursion obj=new Recursion();
     int result=obj.recursion(4);
     System.out.println(result);

    }
}
