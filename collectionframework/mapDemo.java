import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class mapDemo {
    public static void main(String[] args) {
        
        HashMap<Integer, String> map = new HashMap<>();
map.put(1, "Tejas");
map.put(4, "Ram");
map.put(3, "Sita");
map.put(2, null);
map.put(5,null);
map.put(null,"raj");
map.put(null,"hanuman");
System.out.println(" "); 
System.out.println(map);
System.out.println(" ");


LinkedHashMap<Integer, String> map2 = new LinkedHashMap<>();
map2.put(1, "x");
map2.put(2, "y");
map2.put(3, "z");

map2.put(2, null);
map2.put(5,null);
map2.put(null,"w");
map2.put(null,"v");

System.out.println(map2);
System.out.println(" ");


TreeMap<Integer, String> map3 = new TreeMap<>();
map3.put(3, "a");
map3.put(1, "b");
map3.put(2, "c");
map3.put(2, null);
map3.put(5,null);
try{
map3.put(null,"d");
map3.put(null,"e");
}catch(NullPointerException e){
    System.out.println("Exception occured");

}
System.out.println(" ");
System.out.println(map3);



// Hashtable<Integer, String> ht = new Hashtable<>();
// ht.put(1, "Tejas");

    }
}
