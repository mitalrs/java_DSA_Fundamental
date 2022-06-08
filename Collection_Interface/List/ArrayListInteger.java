import java.util.*;

public class ArrayListInteger
{
    public static void main(String[] args)
    {
        List<Integer> list= new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        list.add(6); //This will add 6 at end of the list
        System.out.println(list);

        list.add(1,70);
        System.out.println(list); //This will add 70 on position 1



        //creating a new list
        List<Integer> newList= new ArrayList();
        newList.add(10);
        newList.add(20);
        newList.add(30);

        list.addAll(newList);  //This will add all the element of newlist in a previous list
        System.out.println(list);
    }
}