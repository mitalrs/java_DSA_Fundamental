import java.util.*;

public class treeSetdemo
{
    public static void main(String[] args) 
    {
        Set<Integer> ts = new TreeSet<>();
  
        //This will be add new element
        ts.add(99);
        ts.add(89);
        ts.add(49);
        ts.add(59);

      
        //Set never allow repear 
        ts.add(49);
        System.out.println(ts);

        //This will remove the element by element
        ts.remove(89);
        System.out.println(ts);

        //This wil be check the element present or not
        System.out.println(ts.contains(44));

        //This will be ckeck set empty or not
        System.out.println(ts.isEmpty());

        //This will be retun element size in Set
        System.out.println(ts.size());

        //Clear whole element
        ts.clear();
        System.out.println(ts);
    }
}
