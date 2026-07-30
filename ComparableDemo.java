import java.util.ArrayList;

public class ComparableDemo {
    public static void main(String[] args) {
        
    
     ArrayList<student> list = new ArrayList<>();

        list.add(new student(3, "Tejas", 80));
        list.add(new student(1, "Ram", 90));
        list.add(new student(2, "Sita", 70));

        Collections.sort(list);   // uses compareTo()

        for (student s : list) {
            System.out.println(s);
        }
}
