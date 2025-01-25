import java.util.*;
//import java.util.PriorityQueue;
public class priority {
//    public static void main(String[] args) {
////        PriorityQueue<Integer> pq= new PriorityQueue<>();
//      PriorityQueue<Integer> pq= new PriorityQueue<>(Comparator.reverseOrder());
//
//        pq.add(3);    //o(logn)
//        pq.add(4);
//        pq.add(1);
//        pq.add(7);
//
//        while(!pq.isEmpty()){
//            System.out.println(pq.peek());
//            pq.remove();
//        }
//    }




  //------------------------>>>>>>>>>>>>>>>>>> impliment, class ke object ko compare kese kare


    static class Student implements Comparable<Student>{    // overide
        String name;
        int rank;
        public Student(String name, int rank){
            this.name=name;
            this.rank= rank;

        }
        @Override
        public int compareTo(Student s2){
            return this.rank-s2.rank;
        }
    }

    public static void main(String[] args) {

        PriorityQueue<Student> pq= new PriorityQueue<>();
        pq.add(new Student("A",4));
        pq.add(new Student("B",5));
        pq.add(new Student("c",2));
        pq.add(new Student("D",12));
        while(!pq.isEmpty()){
            System.out.println(pq.peek().name+"->"+pq.peek().rank);
            pq.remove();
            // output c->2
            //A->4
            //B->5
            //D->12
        }


    }
}
