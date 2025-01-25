public class BST {


    //-------- >>>>>> BUILT A BST

//    static class Node {
//        int data;
//        Node left;
//        Node right;
//
//        Node(int data) {
//            this.data = data;
//            this.left= left;
//            this.right= right;
//
//        }
//    }

    public static Node insert(Node root, int val) {

        if (root == null) {
            root = new Node(val);
            return root;
        }
        if(root.data>val){
            root.left= insert(root.left,val);
        }else{
            root.right= insert(root.right,val);
        }
        return root;
    }
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    // --------------->>>>>>>>> SEARCH A BST

    public static boolean search(Node root, int key){
        if(root==null){
            return false;
        }
        if(root.data==key){
            return true;
        }
        if(root.data>key){
            return search(root.left, key);
        }
        else{
            return search(root.right,  key);
        }
    }

    // ----------->>>>>>>>>> DELETE
    public static Node delete(Node root, int val){
        if(root==null){
            return null;
        }
        if(root.data< val){
            root.right=delete(root.right,val);
        }
        else if(root.data> val){
            root.left=delete(root.left,val);
        }
        else{
            // case 1 leaf node
            if(root.left==null && root.right==null){
                return null;
            }
            // case 2- single child
            if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }
            // case 3 - both children
            Node IS = findInorderSuccessor(root.right);
            root.data=IS.data;
            root.right=delete(root.right,IS.data);
        }
        return root;
    }
    public static Node findInorderSuccessor(Node root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }

     //------->>>>>>> PRINT IN RANGE

    public static void printInRange(Node root, int k1,int k2){
        if(root==null){
            return;
        }
        if(root.data>=k1 && root.data<=k2){
            printInRange(root.left,k1,k2);
            System.out.print(root.data+" ");
            printInRange(root.right,k1,k2);
        } else if (root.data<k1) {
            printInRange(root.right,k1,k2);
        }
        else{
            printInRange(root.left,k1,k2);
        }
    }

    //------>>>>>>>>>>>>>> IS VALID BST

    public static boolean isValidBST(Node root,Node min, Node max){
        if(root==null){
            return true;
        }
        if(min!=null && root.data<=min.data){
            return false;
        }
        else if(max!=null && root.data>=max.data){
            return false;
        }
        return isValidBST(root.left,min,root) && isValidBST(root.right,root,max);
    }

    //------------>>>>>>>>>>>>>> SORTER ARR TO BALANCE BST

    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static Node createBST(int arr[],int st,int end){
        if(st>end){
            return null;
        }
        int mid=(st+end)/2;
        Node root=new Node(arr[mid]);
        root.left=createBST(arr,st,mid-1);
        root.right=createBST(arr,mid+1,end);
        return root;
    }

//    public static void main(String[] args) {
//        int value[]= {5,1,3,4,2,7};
//        int value[]={8,5,3,1,4,6,10,11,14};
//        Node root= null;
//        for(int i=0;i<value.length;i++){
//            root= insert(root,value[i]);
//        }


//        inorder(root);
//        System.out.println();

//        if(search(root,6)){
//            System.out.println("found");
//        }else{
//            System.out.println("not found");
//        }

        //----- delete
//        root=delete(root,1);
//        System.out.println();
//        inorder(root);

//        printInRange(root,5,10);

//        if(isValidBST(root,null,null)){
//            System.out.println("valid");
//        }
//        else{
//            System.out.println("Not valid");
//        }

        //_----->>>> sorted arr to balance bst
//        int arr[]={3,5,6,8,10,11,12};
//        Node root=createBST(arr,0,arr.length-1);
//        preorder(root);

//    }
    //----------------------------------------------------------------------- NEW

    //------>>>>>>>>>>> HEIGHT OF TREE

    static class Node {
        int data;
        Node left,right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
//    public static int height(Node root){
//        if(root==null){
//            return 0;
//        }
//        int lh= height(root.left);
//        int rh= height(root.right);
//        return Math.max(lh,rh)+1;
//    }
//    //---->>>>>>>>>>>>>>> COUNT THE NODES
//
//    public static int count(Node root){
//        if(root==null){
//            return 0;
//        }
//        int leftCount=count(root.left);
//        int rightCount=count(root.right);
//        return leftCount+rightCount+1;
//    }
//
//    //------>>>>>>>>>>>>> SUM OF NODES
//
//    public static int sumNodes(Node root){
//        if(root==null){
//            return 0;
//        }
//        int leftSum=sumNodes(root.left);
//        int rightSum= sumNodes(root.right);
//        return leftSum+rightSum+root.data;
//    }
//
//    //-------->>>>>>>>>>>>>>>> DIAMETER OF A TREE
//
//    public static int diameter(Node root){
//        if(root==null){
//            return 0;
//        }
//        int leftDia=diameter(root.left);
//        int leftHie= height(root.left);
//        int rightDia=diameter(root.right);
//        int rightHie=height(root.right);
//
//        int selfDie= leftHie+rightHie+1;
//
//        return Math.max(selfDie,Math.max(leftDia,rightDia));
//    }
//
//    //--------->>>>>>>>>>>>>> SUBTREE OF ANOTHER TREE
//
//    public static boolean isSubtree(Node root,Node subRoot){
//        if(root==null){
//            return false;
//        }
//        if(root.data==subRoot.data){
//            if(isIdentical(root,subRoot)){
//                return true;
//            }
//        }
//        return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
//    }
//    public static boolean isIdentical(Node node,Node subRoot){
//        if(node==null && subRoot==null){
//            return true;
//        }else if(node==null || subRoot==null || node.data!=subRoot.data){
//            return false;
//        }
//        if(!isIdentical(node.left,subRoot.left)){
//            return false;
//        }
//        if (!isIdentical(node.right, subRoot.right)) {
//            return false;
//        }
//        return true;
//    }
//
//    //------>>>>>>>>>>>> K'TH LEVEL
//
//    public static void KLevel(Node root, int level,int k){
//        if(root==null){
//            return;
//        }
//        if(level==k){
//            System.out.print(root.data+" ");
//            return;
//        }
//        KLevel(root.left,level+1,k);
//        KLevel(root.right,level+1,k);
//
//    }

    //_-------------------->>>>>>>>>>>>>>>>>>>>> TOP VIEW OF A TREE

    public static void topView(Node root){

    }
    public static void main(String[] args) {
        

//        Node root= new Node(1);
//        root.left=new Node(2);
//        root.right= new Node(3);
//        root.left.left= new Node(4);
//        root.left.right=new Node(5);
//        root.right.left=new Node(6);
//        root.right.right=new Node(7);
//        System.out.println(height(root));
//        System.out.println(count(root));
//        System.out.println(sumNodes(root));
//        System.out.println(diameter(root));
//
//        //--subTree of another extra write
//        Node subRoot= new Node(2);
//        subRoot.left=new Node(4);
//        subRoot.right=new Node(5);
//        System.out.println(isSubtree(root,subRoot));



//        //--- K'TH LEVEL
//        int k=3;
//        KLevel(root,1,k);
    }

}

//




//class Solution {
//    public long repairCars(int[] ranks, int cars) {
//        long left = 1; // Minimum time
//        long right = (long) Math.pow(10, 9) * cars; // Maximum time (worst case)
//        long result = right;
//
//        while (left <= right) {
//            long mid = left + (right - left) / 2;
//
//            if (canRepairInTime(ranks, cars, mid)) {
//                result = mid;
//                right = mid - 1;
//            } else {
//                left = mid + 1; // Increase time
//            }
//        }
//
//        return result;
//    }
//
//    private boolean canRepairInTime(int[] ranks, int cars, long time) {
//        long totalCarsRepaired = 0;
//
//        for (int rank : ranks) {
//            // Calculate how many cars this mechanic can repair in the given time
//            long maxCars = (long) Math.sqrt(time / rank);
//            totalCarsRepaired += maxCars;
//
//            if (totalCarsRepaired >= cars) {
//                return true; // Enough cars can be repaired
//            }
//        }
//
//        return totalCarsRepaired >= cars;
//    }
//}