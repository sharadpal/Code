//import java.util.PriorityQueue;
import java.util.*;
public class Heap {
//    public static void main(String[] args) {
//        PriorityQueue<Integer> pq= new PriorityQueue<>();
//        pq.add(9);
//        pq.add(3);
//        pq.add(4);
//        pq.add(1);
//        while(!pq.isEmpty()){
//            System.out.println(pq.peek());
//            pq.remove();
//        }
//    }


    //----->>>> PRIORITY QUEUE FOR OBJECT

//    static class Student implements Comparable<Student>{
//        String name;
//        int rank;
//
//        public Student(String name,int rank){
//            this.name=name;
//            this.rank=rank;
//        }
//        @Override
//        public int compareTo(Student s2) {
//            return this.rank- s2.rank;
//        }
//    }
//
//    public static void main(String[] args) {
//        PriorityQueue<Student>pq= new PriorityQueue<>();
//        pq.add(new Student("A",4));
//        pq.add(new Student("B",5));
//        pq.add(new Student("C",2));
//        pq.add(new Student("D",12));
//
//        while(!pq.isEmpty()){
//            System.out.println(pq.peek().name+"->"+ pq.peek().rank);
//            pq.remove();
//        }
//    }


    // -->>>>>>>>>>>>   HEAP SORT

    public static void heapify(int arr[], int i, int size){
        int left= 2*i+1;
        int right= 2*i+2;
        int maxIdx= i;
        if(left<size && arr[left]>arr[maxIdx]){
            maxIdx= left;
        }
        if(right<size && arr[right]>arr[maxIdx]){
            maxIdx= right;
        }
        if(maxIdx!=i){
            int temp= arr[i];
            arr[i]=arr[maxIdx];
            arr[maxIdx]=temp;
            heapify(arr,maxIdx,size);
        }
    }
    public static void heapSort(int arr[]){
        // step1- build maxHeap
        int n= arr.length;
        for(int i=n/2;i>=0;i--){
            heapify(arr,i,n);
        }
        // step2- push largest at end
        for(int i=n-1;i>0;i--){
            // swap largest -first with last
            int temp= arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            heapify(arr,0,i);
        }
    }

    public static void main(String[] args) {
//        int arr[]= {1,2,4,5,3};
//        heapSort(arr);
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();

        // ------>>>>>>>>> connect N ROPES WITH MIN COST
        int ropes[]= {2,3,3,4,6};
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        for(int i=0;i<ropes.length;i++){
            pq.add(ropes[i]);
        }
        int cost=0;
        while(pq.size()>1){
            int min= pq.remove();
            int min2= pq.remove();
            cost+=min+min2;
            pq.add(min+min2);
        }
        System.out.println("cost of connecting n ropes=" + cost);
    }
}
