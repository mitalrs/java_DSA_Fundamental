import java.util.*;

public class LinkedListQueue
{
    public static void main(String[] args)
    {
        Queue<Integer> queue= new LinkedList<>();

        //This will offer the element to add
        queue.offer(22);
        queue.offer(33);
        queue.offer(44);
        queue.offer(55);
        System.out.println(queue);

        //return the removed element with remove element
        System.out.println(queue.poll());

        System.out.println(queue);

        //This will says who is out the next (whiuch remove next)
        System.out.println(queue.peek());
    }
}