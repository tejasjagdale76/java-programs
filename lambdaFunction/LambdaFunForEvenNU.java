public class LambdaFunForEvenNU {
    public static void main(String[] args) {
        
    
    Demointerface obj =(a)-> {
        if(a%2==0){
        System.out.println("Even  nu");
        }
        else{
            System.out.println("odd number");
        }
   
   };
    obj.even_nu(10);
 
  }
}
