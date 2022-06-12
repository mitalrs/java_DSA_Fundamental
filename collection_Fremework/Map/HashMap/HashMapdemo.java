import java.util.*;

public class HashMapdemo
{
    public static void main(String[] args)
    {
        Map<String, Integer> hashmap = new HashMap<>();

        //This will be add key-value pare
        hashmap.put("one",1);
        hashmap.put("two",2);
        hashmap.put("three",3);
        hashmap.put("four",4);

        System.out.println(hashmap);


        //if u want to do not override key-value pare by use the key
        if(!hashmap.containsKey("two"))
        {                                                                              //containKey and putIfAbsent
            hashmap.put("two",226);                                                    // have a same behavior
        }

        //if u want to do not override key
        hashmap.putIfAbsent("three",33);
        System.out.println(hashmap);


        //Get a entey set/map
        for(Map.Entry<String, Integer> e:hashmap.entrySet())
        {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        //Return a key 
        for(String key: hashmap.keySet())
        {
            System.out.println(key);
        }

        //Return a value
        for(Integer value: hashmap.values())
        {
            System.out.println(value);
        }

        //This will be check the value have in map or not
        System.out.println(hashmap.containsValue(3));

        //This will be return true or false for map is empty or not
        System.out.println(hashmap.isEmpty());

        //Clear whole map
        hashmap.clear();
        System.out.println(hashmap);
    }
}

