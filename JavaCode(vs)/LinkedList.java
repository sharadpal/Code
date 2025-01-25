public class LinkedList {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data= data;
            this.next= null;
        }
    }
    public static LinkedList.Node head;
    public static LinkedList.Node tail;
    public static int size;
    public void addFirst(int data){
        Node newNode= new Node(data);
        size++;
        if(head==null){
            head=tail= newNode;
            return;
        }
        newNode.next= head;
        head=newNode;
    }
    public void addLast(int data){
        Node newNode= new Node(data);
        size++;
        if(head==null){
            head= tail= newNode;
            return;
        }
        tail.next= newNode;
        tail= newNode;
    }
    public void print(){
        if(head==null){
            System.out.println("LL is empty");
            return;
        }
        Node temp= head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp= temp.next;
        }
        System.out.println("null");
    }
    public void add(int idx,int data){
        if(idx==0){
            addFirst(data);
            return;
        }
         Node newNode = new Node(data);
        size++;
        Node  temp=  head;
        int i=0;
        while(i<idx -1){
            temp= temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next= newNode;
    }

    //  --->>>> remove First

    public int removeFirst(){
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size ==1 ) {
            int val=  head.data;
            head = tail= null;
            size=0;
            return val;

        }
        int val = head.data;
        head= head.next;
        size--;
        return val;
    }
    //------->>>>>>>  removeLast
     public  int removeLast(){
        if(size==0){
            System.out.println("LL is empty");
             return Integer.MIN_VALUE;
        }
        else if(size== 1 ){
            int  val= head.data;
            head= tail=null;
            size=0;
            return val;
        }
        Node prev= head;
        for(int i=0;i<size-2;i++){
             prev= prev.next;
        }
        int val= prev.next.data;
        prev.next= null;
        tail=prev;
        size--;
        return val;
     }

     //----->>>>>>>> search(Iterative)
    public int itrSearch(int key){
        Node temp= head;
        int i=0;
        while(temp!=null){
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    //--------->>>>>>>>>> recursive search

    public int helper(Node head,int key){
        if(head ==null) {
            return -1;
        }
        int idx= helper(head.next,key);
        if (idx == -1) {
            return -1;
        }
        return idx+1;
    }
    public int recSearch(int key){
        return helper(head,key);
    }

    //------->>>>>>>>> reverse a linkedList


    public void reverse(){
        Node prev = null;
        Node curr= tail= head;
        Node next;
        while(curr!=null){
            next= curr.next;
            curr.next= prev;
            prev= curr;
            curr= next;
        }
        head= prev;
    }

    //-------->>>>>>>>  deleteN th from end

    public void deleteNthfromEnd(int n ){
        int size= 0;
        Node temp= head;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        if(n==size){
            head= head.next;
            return;
        }
        int i=1;
        int iTofind = size-n;
         Node prev = head;
         while(i<iTofind){
             prev= prev.next;
             i++;
         }
         prev.next= prev.next.next;
         return;
    }

    //------>>>>>>>> detect a cycle Algorithm

    public static boolean isCycle(){
        Node  slow= head;
        Node fast= head;

        while(fast!=null && fast.next !=null){
            slow = slow.next;
            fast= fast.next.next; //+2
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    //-------------->>>>>>>>>>>>>>  REMOVE CYCLE
    public static void removeCycle(){
        Node slow= head;
        Node fast= head;
        boolean cycle= false;
        while(fast!=null && fast.next!=null){
            slow= slow.next;
            fast= fast.next.next;
            if(fast==slow) {
                cycle = true;
                break;
            }
        }
        if(cycle==false){
            return;
        }
        slow= head;
        Node prev= null;
        while(slow!=fast){
            prev= fast;
            slow= slow.next;
            fast=fast.next;
        }
        prev.next= null;
    }

    //--------------->>>>>>>>>>>> zig-zag

    public void zigZag(){
        //find mid

        Node slow = head;
        Node fast= head.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast= fast.next.next;
        }
        Node mid= slow;

        //reverse 2nd half
        Node curr= mid.next;
        mid.next= null;
        Node prev= null;
        Node next;

        while(curr!=null){
            next= curr.next;
            curr.next= prev;
            prev= curr;
            curr= next;
        }

        Node left= head;
        Node right= prev;
        Node nextL,nextR;


    }






    public static void main(String[] args) {
////        LinkedList ll=new LinkedList();
////        ll.addFirst(2);
////        ll.addFirst(1);
////        ll.addLast(3);
////        ll.addLast(4);
////        ll.add(2,9);
////        ll.print();
//
////        System.out.println(ll.size); // size
////        ll.removeFirst();
////        ll.print();
////        ll.removeLast();
////        ll.print();
////        System.out.println(ll.size);
////        System.out.println(ll.itrSearch(3));
////        System.out.println(ll.itrSearch(10));
////        System.out.println(ll.recSearch(3));
////        System.out.println(ll.recSearch(10));
////        ll.reverse();
////        ll.print();
////        ll.deleteNthfromEnd(3);
////        ll.print();
//
//
//
//        head= new Node(1);
//        head.next= new Node(2);
//        head.next.next= head;
//        System.out.println(isCycle());
        removeCycle();



    }

}
