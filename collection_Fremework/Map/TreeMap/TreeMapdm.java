import java.util.*;

public class TreeMapdm 
{
    public static void main(String[] args)
    {
        Map<String, Integer> treemap = new TreeMap<>();
       
        //add element in key-value pare
        treemap.put("one",1);
        treemap.put("two",2);
        treemap.put("three",3);
        treemap.put("four",4);
        treemap.put("five",5);

        System.out.println(treemap);

        //remove the element by key-value pare
        treemap.remove("two",2);
        System.out.println(treemap);
    }
}
