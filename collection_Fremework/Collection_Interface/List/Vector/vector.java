import java.util.*;

public class vector {
    
    public static void main(String[]args)
    {
        Vector<Integer> v = new Vector<>();
        v.add(12);
        v.add(13);
        v.add(14);
        v.add(15);

        System.out.println(v.capacity());

        v.remove(14);

        for(int i: v)
        {
            System.out.println(i);
        }
    }
}

//ava Vector contains many legacy methods that are not the part of a collections framework.
