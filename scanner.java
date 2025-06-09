import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
     Scanner a= new Scanner(System.in);
     int b=a.nextInt();
     for (int i = 0; i < 10; i++) {
        if (b<10){
            System.out.println("i is less that 10");
        }
         else{
            System.out.println("i is not less than 10");
         }
     }
    }
}