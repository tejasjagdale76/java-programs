import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class setDemo {
    public static void main(String[] args) {

HashSet<Integer> hs = new HashSet<>();
hs.add(7);
hs.add(2);
hs.add(7); // duplicate
System.out.println("HashSet");
System.out.println(hs);


LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
lhs.add(10);
lhs.add(20);
lhs.add(10);//duplicate 
System.out.println("LinkedHashSet");
System.out.println(lhs);


TreeSet<Integer> ts = new TreeSet<>();
ts.add(9);
ts.add(10);
ts.add(9);//duplicate
System.out.println("TreeSet");
System.out.println(ts);

    }
}
