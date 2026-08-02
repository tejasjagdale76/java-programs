// Problem statements :
// Create a Java program that stores Employee names as keys and their current salaries as values in a HashMap. 
// Initialize the map with at least four employees.
// Using a Lambda expression (without Streams), apply a 10% bonus to every employee whose salary is currently below $50,000.
// Print the updated list of employees and their new salaries using the forEach method

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EmpProblem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        HashMap<String,Integer>map=new HashMap<>();
        map.put("Tejas",100000);
        map.put("Laxshman",20000);
        map.put("Ravan",300000);
        map.put("sita",100);

        //NORMAL FOE LOOP

        // for(Map.Entry<String,Integer>entry:map.entrySet())
        // {
            
        //     int Salary=entry.getValue();
        //     if(Salary<50000)
        //     {
        //         int bouns=Salary*10/100;
        //         int NewSalary=Salary+bouns;
        //         map.put(entry.getKey(), NewSalary);
        //     }
        // }
        // System.out.println(map);


        //USING FOR-EACH LOOP WITH LAMBDA FUNCTION

        map.forEach((name,Salary)->{
            
            if(Salary<50000)
            {
                int bonus=Salary*10/100;
                int NewSalary=bonus+Salary;
                map.put(name,NewSalary);
            }

        });

        //NORMAL PRINTING OF MAP
        // System.out.println(map);

        //USING FOR_EACH 
        map.forEach((name,Salary)->{
            System.out.println("Name:"+name+"  Salary:"+Salary);

        });
    }
}
