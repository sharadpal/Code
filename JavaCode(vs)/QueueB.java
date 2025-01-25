public class QueueB {
    //------>>>>>>>IMPLIMENTATION USING ARRAY(FIXED SIZE)
//    public static class Queue{
//        static int arr[];
//        static int size;
//        static int rear;
//        Queue(int n){
//            arr= new int[n];
//            size= n;
//            rear= -1;
//        }
//        public static boolean isEmpty(){
//            return rear==-1;
//        }
//        //---->>>>ADD
//        public static void add(int data){
//            if(rear==size-1){
//                System.out.println("Queue is full");
//                return;
//            }
//            rear= rear+1;
//            arr[rear]= data;
//        }
//        //---->>>>REMOVE
//        public static int remove(){
//            if(isEmpty()){
//                System.out.println("Queue is empty");
//                return -1;
//            }
//            int front= arr[0];
//            for(int i=0;i<rear;i++){
//                arr[i]= arr[i+1];
//            }
//            rear= rear-1;
//            return front;
//        }
//        //-->>PEEK
//        public static int peek(){
//            if(isEmpty()){
//                System.out.println("Queue is empty");
//                return -1;
//            }
//            return arr[0];
//        }
//
//
//    }
//
//    public static void main(String[] args) {
//        Queue q= new Queue(5);
//        q.add(1);
//        q.add(2);
//        q.add(3);
//        while(!q.isEmpty()){
//            System.out.println(q.peek());
//            q.remove();
//        }
//    }







    //----------------->>>>>>>>>>>>>>>>>>>>>>>> CIRCULAR QUEUE

//    public static class Queue{
//        static int arr[];
//        static int size;
//        static int rear;
//        static int front;
//        Queue(int n){
//            arr= new int[n];
//            size= n;
//            rear= -1;
//            front=-1;
//        }
//        public static boolean isEmpty(){
//            return rear==-1 && front==-1;
//
//        }
//        public static boolean isFull(){
//            return (rear+1)%size==front;
//        }
//        //---->>>>ADD
//        public static void add(int data){
//            if(isFull()){
//                System.out.println("Queue is full");
//                return;
//            }
//            //ADD 1ST ELEMENT
//            if(front==-1){
//                front=0;
//            }
//            rear= (rear+1)%size;
//            arr[rear]= data;
//        }
//        //---->>>>REMOVE
//        public static int remove(){
//            if(isEmpty()){
//                System.out.println("Queue is empty");
//                return -1;
//            }
//            int result= arr[front];
//            //LAST ELEMENT DELETE
//            if(rear==front){
//                rear=front=-1;
//
//            }
//            else{
//                front= (front+1)%size;
//            }
//            return result;
//
//        }
//        //-->>PEEK
//        public static int peek(){
//            if(isEmpty()){
//                System.out.println("Queue is empty");
//                return -1;
//            }
//            return arr[front];
//        }
//    }
//
//    public static void main(String[] args) {
//        Queue q= new Queue(3);
//        q.add(1);
//        q.add(2);
//        q.add(3);
//        System.out.println(q.remove());
//        q.add(4);
//        System.out.println(q.remove());
//        q.add(5);
//
//        while(!q.isEmpty()){
//            System.out.println(q.peek());
//            q.remove();
//
//
//
//        }
//    }




    //--------------->>>>>>>>>>>>> QUEUE USING LINKEDLIST

//    static class Node{
//        int data;
//        Node next;
//
//        Node(int data){
//            this.data= data;
//            this.next= next;
//        }
//    }
//    static class Queue {
//        static Node head = null;
//        static Node tail = null;
//
//        public static boolean isEmpty() {
//            return head == null && tail == null;
//        }
//
//        //-->>>ADD
//        public static void add(int data) {
//            Node newNode = new Node(data);
//            if (head == null) {
//                head = tail = newNode;
//                return;
//            }
//            tail.next = newNode;
//            tail = newNode;
//        }
//
//        //-->> REMOVE
//
//        public static int remove() {
//            if (isEmpty()) {
//                System.out.println("empty queue");
//                return -1;
//            }
//            int front = head.data;
//            // SINGLE ELEMENT
//            if (tail == head) {
//                tail = head = null;
//            } else {
//                head = head.next;
//            }
//            return front;
//        }
//
//        //PEEK
//        public static int peek() {
//            if (isEmpty()) {
//                System.out.println("empty queue");
//                return -1;
//            }
//            return head.data;
//        }
//    }
//
//    public static void main(String[] args) {
//        Queue q= new Queue();
////        System.out.println(q);
//        q.add(1);
//        q.add(2);
//        q.add(3);
//        q.add(4);
//        System.out.println("Print Queue=");
//
////        System.out.println(q.remove());
//        System.out.println("queue's head:="+ q.peek());
//
//
//
//        while(!q.isEmpty()){
//            System.out.println(q.peek());
//            q.remove();
//        }
//    }
//
}