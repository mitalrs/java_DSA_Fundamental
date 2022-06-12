import java.util.*;


//Set dont allow repit element || Set like a bag always print randome order element
public class HashsetDemo 
{
    public static void main(String[] aStrings)
    {
        Set<Integer> hset= new HashSet<>();

        //This will be add the element
        hset.add(111);
        hset.add(222);
        hset.add(333);
        hset.add(444);

        System.out.println(hset);
        //Set dont allow repit element 
        hset.add(222);
        System.out.println(hset);

        hset.remove(333);
        System.out.println(hset);

        //This will find element present or not
        System.out.println(hset.contains(444));

        //This will return true/false
        System.out.println(hset.isEmpty());

        //This will return array element size
        System.out.println(hset.size());

        //clear a set || remove all element
        hset.clear();
        System.out.println(hset);
    }
}


