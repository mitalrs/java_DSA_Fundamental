import java.util.*;

public class priorityqueuedemo
 {
    public static void main(String[] args)
    {
        Queue<Integer> pqueue = new PriorityQueue<>();

        pqueue.offer(100);
        pqueue.offer(200);
        pqueue.offer(300);
        pqueue.offer(400);

        System.out.println(pqueue);

        //This will remove the priority element
        pqueue.poll();
        System.out.println(pqueue);

        //This will peek element next on line
        System.out.println(pqueue.peek());



        //if want peek element in revers order or max element
        Queue<Integer> pcqueue = new PriorityQueue<>(Comparator.reverseOrder());

        pcqueue.offer(10);
        pcqueue.offer(60);
        pcqueue.offer(80);
        pcqueue.offer(40);
        pcqueue.offer(30);
        pcqueue.offer(20);

        System.out.println(pcqueue);
    }
}
