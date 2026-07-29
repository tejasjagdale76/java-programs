interface p{
    double operation(double a, double b);
}
public class abc {
    public static void main(String[] args) {
        p obj=(a, b)->{
            if(b==0)
            {
                System.out.println("can niot divide by zero");
                return 0;
            }
            else
              return a/b;        
        };
        System.out.println(obj.operation(10, 2));
    }
}
