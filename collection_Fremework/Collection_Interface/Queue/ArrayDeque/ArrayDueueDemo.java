import java.util.*;

public class ArrayDueueDemo
{
    public static void main(String[] argStrings)
    {
        ArrayDeque<Integer> dq = new ArrayDeque<>();

        //This wiss use for add element
        dq.offer(20);
        dq.offer(50);
        dq.offer(60);
        dq.offer(70);
        dq.offer(80);

        System.out.println(dq);

        //This will peek a next elment in line 
        System.out.println(dq.peek());         //default peek first element
        System.out.println(dq.peekFirst());    //peek first elemebnt
        System.out.println(dq.peekLast());     //peek last element

        System.out.println(dq);

        //This will poll/remove a next elment in line 
        System.out.println("remove "+dq.poll());         //default poll first element
        System.out.println("remove "+dq.pollFirst());    //poll first elemebnt
        System.out.println("remove "+dq.pollLast());     //poll last element

        System.out.println(dq);
        }
}