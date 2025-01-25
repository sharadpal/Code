import java.util.*;



public class Stack1 {

    // 1 ------------------------>>>>>>>>> STACK USING ARRAYlIST
//
//
//    static class Stack {
//        static ArrayList<Integer> list = new ArrayList<>();
//
//        public static boolean isEmpty() {
//            return list.size() == 0;
//        }
//
//        //---->>> PUSH
//        public static void push(int data) {
//            list.add(data);
//        }
//
//        //--->>>> POP
//        public static int pop() {
//            if (isEmpty()) {
//                return -1;
//            }
//            int top = list.get(list.size() - 1);
//            list.remove(list.size() - 1);
//            return top;
//        }
//
//        //-->>>>> PEAK
//        public static int peek() {
//            if (isEmpty()) {
//                return -1;
//            }
//            return list.get(list.size() - 1);
//        }
//    }
//
//    public static void main(String[] args) {
//        Stack s = new Stack();
//        s.push(1);
//        s.push(2);
//        s.push(3);
//
//        while (!s.isEmpty()) {
//            System.out.println(s.peek());
//            s.pop();
//        }
//        System.out.println(s.peek());
//
//    }



    // 2 ---------->>>>>>>>>>>>>>>>>>> STACK USING LINKED LIST

//    static class Node{
//        int data;
//        Node next;
//        Node(int data){
//            this.data= data;
//            this.next= null;
//        }
//    }
//    static class Stack{
//        static Node head= null;
//        public static boolean isEmpty(){
//            return head==null;
//        }
//        // ------->>>>>> PUSH
//        public static void push(int data){
//            Node newNode= new Node(data);
//            if(isEmpty()){
//                head= newNode;
//                return;
//            }
//            newNode.next= head;
//            head= newNode;
//        }
//        //-------->>> POP
//
//        public static int pop(){
//            if(isEmpty()){
//                return -1;
//            }
//            int top= head.data;
//            head= head.next;
//            return top;
//        }
//
//        //---->>>> PEEK
//
//        public static int peek(){
//            if(isEmpty()){
//                return -1;
//            }
//            return head.data;
//        }
//    }
//
//    public static void main(String[] args) {
//        Stack s =new Stack();
//        s.push(1);
//        s.push(2);
//        s.push(3);
//        while(!s.isEmpty()){
//            System.out.println(s.peek());
//            s.pop();
//        }
//    }


    // 3 -------->>>>>>>>>>>>> STACK USING JAVA COLLECTION FRAMWORK

//    public static void main(String[] args) {
//        Stack<Integer> s = new Stack();
//        s.push(1);
//        s.push(2);
//        s.push(3);
//        while (!s.isEmpty()) {
//            System.out.println(s.peek());
//            s.pop();
//        }
//    }


    //---------->>>>>>>>>>>>>>>>>>>>>>>>> PUSH AT BOTTOM OF STACK

//     public static void pushAtBotton(Stack<Integer> s, int data){
//         if(s.isEmpty()){
//             s.push(data);
//             return;
//         }
//         int top= s.pop();
//         pushAtBotton(s,data);
//         s.push(top);
//     }
//
//    public static void main(String[] args) {
//        Stack<Integer> s= new Stack<>();
//        s.push(1);
//        s.push(2);
//        s.push(3);
//        pushAtBotton(s,4);
//        while(!s.isEmpty()){
//            System.out.println(s.pop());
//        }
//    }


    //------------->>>>>>>>>>>>>>>>> REVERSE A STRING USING STACK

//    public static String reverseString(String str){
//        Stack<Character> s= new Stack<>();
//        int idx=0;
//        while(idx<str.length()){
//            s.push(str.charAt(idx));
//            idx++;
//        }
//        StringBuilder result= new StringBuilder("");
//        while(!s.isEmpty()){
//            char curr= s.pop();
//            result.append(curr);
//        }
//        return result.toString();
//    }
//
//    public static void main(String[] args) {
//        String str="abc";
//        String result= reverseString(str);
//        System.out.println(result);
//    }
//

    //------->>>>>>>>> REVERSE A STACK BY USING RECURSION

//    public static void pushAtBotton(Stack<Integer> s, int data){
//        if(s.isEmpty()){
//            s.push(data);
//            return;
//        }
//        int top= s.pop();
//        pushAtBotton(s,data);
//        s.push(top);
//    }
//    public static void reverseStack(Stack<Integer> s){
//        if(s.isEmpty()){
//            return;
//        }
//        int top= s.pop();
//        reverseStack(s);
//        pushAtBotton(s,top);
//    }
//    public static void printStack(Stack<Integer> s){
//        if(!s.isEmpty()) {
//            System.out.println(s.pop());
//        }
//    }
//
//    public static void main(String[] args) {
//        Stack<Integer> s= new Stack<>();
//        s.push(1);
//        s.push(2);
//        s.push(3);
//        // 3,2,1
//        reverseStack(s);
//        printStack(s);
//        //1,2,3
//    }



    // _------------>>>>>>>>>>>> NEXT    GREATER NUMBER
//
//    public static void main(String[] args) {
//        int arr[]={6,8,0,1,3};
//        Stack<Integer> s=new Stack<>();
//        int nxtGreater[]=new int[arr.length];
//
//        for(int i=arr.length-1;i>=0;i--){
//            while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
//                s.pop();
//            }
//            if(s.isEmpty()){
//                nxtGreater[i]=-1;
//            }else{
//                nxtGreater[i]=arr[s.peek()];
//            }
//            s.push(i);
//        }
//        for(int i=0;i<nxtGreater.length;i++){
//            System.out.print(nxtGreater[i]+ " ");
//        }
//        System.out.println();
//    }


    //------->>>>>>>>>>>>>>> VALID PARENTHESES

    public static boolean isValid(String str){
        Stack<Character> s= new Stack<>();
        for(int i=0;i<str.length();i++) {
            char ch = str.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                s.push(ch);
            } else {
                if (s.isEmpty()) {
                    return false;
                }
                if ((s.peek() == '(' && ch == ')')
                        || (s.peek() == '{' && ch == '}')
                        || (s.peek() == '[' && ch == ']')) {
                    s.pop();
                }
                else {
                    return false;
                }
            }
        }
        if(s.isEmpty()){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        String str="({})[]";
        System.out.println(isValid(str));
    }

}



