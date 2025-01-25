import java.util.*;
import java.util.LinkedList;

public class QueueC {
//    public static void main(String[] args) {
////        Queue<Integer> q=new LinkedList<>();
//        Queue<Integer> q=new ArrayDeque<>();
//        q.add(1);
//        q.add(2);
//        q.add(3);
//        q.add(4);
//        while(!q.isEmpty()){
//            System.out.println(q.peek());
//            q.remove();
//        }
//
//    }

    //------>>>>>>>>>> QUEUE USING TWO STACKS
//    static class Queue{
//        static Stack<Integer> s1=new Stack<>();
//        static Stack<Integer> s2=new Stack<>();
//
//        public static boolean isEmpty(){
//            return s1.isEmpty();
//        }
//        public static void add(int data){
//            while(!s1.isEmpty()) {
//                s2.push(s1.pop());
//            }
//            s1.push(data);
//            while(!s2.isEmpty()){
//                s1.push(s2.pop());
//            }
//        }
//        public static int remove(){
//            if(isEmpty()){
//                System.out.println("queue empty");
//                return -1;
//            }
//            return s1.pop();
//        }
//        public static int peek(){
//            if(isEmpty()){
//                return -1;
//            }
//            return s1.peek();
//        }
//    }
//
//    public static void main(String[] args) {
//        Queue q= new Queue();
//        q.add(1);
//        q.add(2);
//        q.add(3);
//        while(!q.isEmpty()){
//            System.out.println(q.peek());
//            q.remove();
//        }
//    }

    //----->>>>>>>>>>>> FIRST NON REPEATING LATER

//    public static void printNonReating(String str){
//        int freq[]=new int[25]; // 'a'...'z'
//        Queue<Character> q= new LinkedList<>();
//        for(int i=0;i<str.length();i++){
//            char ch=str.charAt(i);
//            q.add(ch);
//            freq[ch-'a']++;
//
//            while (!q.isEmpty() && freq[q.peek()-'a']>1){
//                q.remove();
//            }
//            if(q.isEmpty()){
//                System.out.print(-1+" ");
//            }else{
//                System.out.print(q.peek()+" ");
//            }
//        }
//        System.out.println();
//    }
//
//    public static void main(String[] args) {
//        String str="aabccxb";
//        printNonReating(str);
//    }


     //_------->>>> interleave two halves of a queue

//    public static void interLeave(Queue<Integer> q){
//        Queue<Integer> firstHalf= new LinkedList<>();
//        int size=q.size();
//        for(int i=0;i<size/2;i++){
//            firstHalf.add(q.remove());
//        }
//
//        while(!firstHalf.isEmpty()){
//            q.add(firstHalf.remove());
//            q.add(q.remove());
//        }
//    }
//
//    public static void main(String[] args) {
//        Queue<Integer> q=new LinkedList<>();
//        q.add(1);
//        q.add(2);
//        q.add(3);
//        q.add(4);
//        q.add(5);
//        q.add(6);
//        q.add(7);
//        q.add(8);
//        q.add(9);
//        q.add(10);
//        interLeave(q);
//        while(!q.isEmpty()){
//            System.out.print(q.remove()+" ");
//
//        }
//        System.out.println();
//    }


    //-------->>>>>>>>> QUEUE REVERSE

//    public static void reverse(Queue<Integer> q){
//        Stack<Integer> s=new Stack<>();
//        while(!q.isEmpty()){
//            s.push(q.remove());
//        }
//        while(!s.isEmpty()){
//            q.add(s.pop());
//        }
//    }
//
//    public static void main(String[] args) {
//        Queue<Integer> q=new LinkedList<>();
//        q.add(1);
//        q.add(2);
//        q.add(3);
//        q.add(4);
//        q.add(5);
//
//        reverse(q);
//
//        while(!q.isEmpty()){
//            System.out.print(q.remove()+" ");
//        }
//        System.out.println();
//    }

    //--->>>>>>>>>>>>>> DEQUE(double Ended Queue)

//    public static void main(String[] args) {
//        Deque<Integer> deque=new LinkedList<>();
//        deque.addFirst(1);
//        deque.addFirst(2);
//        deque.addLast(3);
//        deque.addLast(4);
//
//        System.out.println(deque);
//        deque.removeFirst();
//        System.out.println(deque);
//
//        System.out.println("first ele:"+deque.getFirst());
//        System.out.println("Last ele:"+deque.getLast());
//    }

    //--->>>>>>>>> IMPLEMENT QUEUE USING DEQUE

//    static class Stack{
//        Deque<Integer> deque= new LinkedList<>();
//
//        public  void push(int data){
//            deque.addLast(data);
//        }
//
//        public int pop(){
//            return deque.removeLast();
//        }
//        public int peek(){
//            return deque.getLast();
//        }
//    }
//    static class Queue{
//        Deque<Integer> deque= new LinkedList<>();
//        public void add(int data) {
//            deque.addLast(data);
//        }
//        public int remove() {
//            return deque.removeLast();
//        }
//        public int peek() {
//            return deque.getFirst();
//        }
//
//    }
//
//    public static void main(String[] args) {
//        Queue q= new Queue();
//        q.add(1);
//        q.add(2);
//        q.add(3);
//        System.out.println(("pee"+ q.peek()));
//        System.out.println(q.remove());
//        System.out.println(q.remove());
//        System.out.println(q.remove());
//
//    }

    //----------------->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> STACL & QUEUE USING DEQUE

    static class Stack{
        Deque<Integer> deque= new LinkedList<>();
        public void push(int data){
            deque.addLast(data);
        }
        public int pop(){
            return deque.removeLast();
        }
        public int peek(){
            return deque.getLast();
        }

    }

    public static void main(String[] args) {
        Stack s= new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s.peek());
        System.out.println(s.pop());

    }
}
