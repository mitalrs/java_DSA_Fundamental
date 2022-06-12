import java.util.*;

public class LinkedListdemo
{
    public static void main(String[] args)
    {
        List<Integer> list= new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);


        //This will add 6 at end of the list
        list.add(6); 
        System.out.println(list);

        //This will add 70 on position 1
        list.add(1,70);
        System.out.println(list);



        //creating a new list
        List<Integer> newList= new ArrayList();
        newList.add(10);
        newList.add(20);
        newList.add(30);


        //This will add all the element of newlist in a previous list
        list.addAll(newList);  
        System.out.println(list);


        //get a indext element
        System.out.println(list.get(7)); 


        //This will remove the index element
        list.remove(5);  
        System.out.println(list);


        //This will remove element by element value
        list.remove(Integer.valueOf(20));  
        System.out.println(list);


        //This will update the value 
        list.set(3,88888);
        System.out.println(list);


        //This will be clear all the element
        list.clear();
        System.out.println(list);


        //This will check in list some element have or not
        System.out.println(list.contains(10));




        //Travel array one by one element
        List<Integer> listTraveling= new LinkedList<>();
        listTraveling.add(10);
        listTraveling.add(20);
        listTraveling.add(30);
        listTraveling.add(40);
        listTraveling.add(50);
        System.out.println(listTraveling);


        // for loop
        for(int i=0; i<listTraveling.size();i++)
        {
            System.out.println("The element is "+ listTraveling.get(i));
        }

        //for each loop
        for(Integer element: listTraveling)
        {
            System.out.println("foreach element "+ element);
        }

        //iterator
        Iterator<Integer> iteret = listTraveling.iterator();
    
        while(iteret.hasNext())
        {
            System.out.println("iterat "+iteret.next());
        }


    }
}