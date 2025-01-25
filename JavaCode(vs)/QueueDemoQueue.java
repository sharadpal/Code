
import java.util.*;
public class QueueDemoQueue {
    public static void main(String[] args) {
        // MINI HEAP
//        ArrayDeque<Integer> aq= new ArrayDeque<>();
////        PriorityQueue<Integer> aq= new PriorityQueue<>(Collections.reverseOrder());  // max heap
//        aq.add(10);
//        aq.addFirst(20);
//        aq.addLast(40);
//        aq.remove();
//        System.out.println(aq);

        PriorityQueue<Integer> pq= new PriorityQueue<>();
        pq.add(10);
        pq.add(5);
        pq.add(20);
        pq.add(12);
        pq.add(1);
        pq.remove();
        System.out.println(pq);
    }


//    public static void main(String[] args) {
//        TreeSet<Integer> hs= new TreeSet<>();
//        hs.add(10);
//        hs.add(50);
//        hs.add(30);
//        hs.add(40);
//         Iterator it = hs.iterator();
//         while(it.hasNext()){
//             System.out.println(it.next());
//         }
//
//    }
}

