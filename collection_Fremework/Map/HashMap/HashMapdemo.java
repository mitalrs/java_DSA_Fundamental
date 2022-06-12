import java.util.*;

public class HashMapdemo
{
    public static void main(String[] args)
    {
        Map<String, Integer> hashmap = new HashMap<>();

        hashmap.put("one",1);
        hashmap.put("two",2);
        hashmap.put("three",3);
        hashmap.put("four",4);

        Syste.out.println(hashmap);

        if(!hashmap.containsKey("two"))
        {
            hashmap.out("two",226);
        }

        hashmap.putIfAbsent("three",33);
        System.out.println(hashmap);


        for(map.Entry<String, Integer> e:hashmap.entrySet())
        {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        for(String key: hashmap.keySet())
        {
            System.out.println(key);
        }

        for(nteger value: hashmap.value())
        {
            Syetem.out.println(value);
        }
    }
}

