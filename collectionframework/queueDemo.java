import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class queueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer>pq=new PriorityQueue<Integer>();
        pq.add(30);
         pq.add(10);
          pq.add(50);
           pq.add(40);

           System.out.println("Elements in ArrayDeque");
           System.out.println(pq.poll());
           System.out.println(pq.poll());
           System.out.println(pq.poll());
           System.out.println(pq.poll());          
           System.out.println(pq.poll());
    }
}
