package collectionframework;
import java.util.ArrayList;
import java.util.LinkedList;

public class objectlist {
     public static void main(String[] args) {
        studentinfo s1=new studentinfo(12,"tejas",100 );
          studentinfo s2=new studentinfo(13,"ram",90 );
          studentinfo s3=new studentinfo(14,"sita",80 );

          ArrayList<studentinfo>s=new ArrayList<studentinfo>();
          s.add(s1);
          s.add(s2);
          s.add(s3);

          for(studentinfo std:s){
            System.out.println(std);
          }
        }
}
