import java.util.*;

public class LinkedHashSetdemo 
{
    public static void main(String[] args)
    {
        Set<Integer> lhs = new LinkedHashSet<>();

        //Thia will add new element
        lhs.add(22);
        lhs.add(32);
        lhs.add(42);
        lhs.add(52);
        lhs.add(62);
        lhs.add(72);

        System.out.println(lhs);
        
        //This will remove the element
        lhs.remove(52);
        System.out.println(lhs);

        //This will be check element prent or not in set
        System.out.println(lhs.contains(32));

        //This will be check empty or not
        System.out.println(lhs.isEmpty());

        //This will be return element size || how manty element precent in Set
        System.out.println(lhs.size());

        //This will be clear whole set || remove all element
        lhs.clear();
        System.out.println(lhs);
    }
}
