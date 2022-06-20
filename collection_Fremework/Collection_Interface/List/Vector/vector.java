import java.util.*;

public class vector {
    
    public static void main(String[]args)
    {
        Vector<Integer> v = new Vector<>();
        v.add(12);
        v.add(13);
        v.add(14);
        v.add(15);

        System.out.println("capacity "+v.capacity());

        v.remove(2);

        for(int i: v)
        {
            System.out.println(i);
        }
    }
}

//ava Vector contains many legacy methods that are not the part of a collections framework.

/* java come with vector
vector introduce:1.0
arraylist introduce:1.2 */

//difference btween arraylist and Vector
// vector... if you will excid the linit u will incress the linit 100%
// arrayList.. incress the capaciry 50% 
// arrayList save the memory

//vector Sychronised
//therotycaly thredsafe but not practically.....slow
// arrayList not a theardsafe....fast
