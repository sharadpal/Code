import java.util.*;
import java.util.LinkedList;

public class BinaryTreeB {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data= data;
            this.left= null;
            this.right= null;

        }
    }
    static class BinaryTree{
        static int idx=-1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode= new Node(nodes[idx]);
            newNode.left= buildTree(nodes);
            newNode.right= buildTree(nodes);
            return newNode;
        }
        //---->>>>> preorder
        public static void preorder(Node root){
            if(root==null){
                return;
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);

        }
        //------->>>>>INORDER

        public static void inorder(Node root){
            if(root==null){
                return;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
        //----->>> POSTORDER
        public static void postorder(Node root){
            if(root==null){
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }


    }

    //----->>>>>>>>>>> LEVEL ORDER TRAVERSAL



    public static void levelOrder(Node root){
        if(root==null){
            return;
        }

       Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node currNode= q.remove();
            if(currNode==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else
            {
                System.out.print(currNode.data+"");
                if(currNode.left!=null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }

            }
        }
    }
    //----->>>>>>>>>>> LOWEST COMMON ANCESTOR(LEFT,RIGHT SIDE SAME LEVELTIME NODE HO
    public static Node lca2(Node root, int n1, int n2){
        if(root==null || root.data==n1 || root.data==n2){
            return root;
        }
        Node leftLca= lca2(root.left,n1,n2);
        Node rightLca= lca2(root.right,n1,n1);
        if(rightLca==null){
            return leftLca;
        }
        if(leftLca==null){
            return rightLca;
        }
        return root;
    }
    //---->>>>>>>>>>>> MIN DISTANCE B/W TWO NODES
    public static int lcaDist(Node root,int n){
        if(root==null){
            return -1;
        }
        if(root.data==n){
            return 0;
        }
        int leftDist= lcaDist(root.left,n);
        int rightDist= lcaDist(root.right,n);
        if(leftDist==-1 && rightDist==-1){
            return -1;
        } else if (leftDist==-1) {
            return rightDist+1;
        }else {
            return leftDist+1;
        }
    }
    public static int minDist(Node root, int n1,int n2){
        Node lca= lca2(root,n1,n2);
        int dist1= lcaDist(lca,n1);
        int dist2= lcaDist(lca,n2);
        return dist1+dist2;
    }

    public static void main(String[] args) {
//        int nodes[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
//        BinaryTree tree= new BinaryTree();
//
//        Node root=tree.buildTree(nodes);
//        System.out.println(root.data);
//        tree.preorder(root);
//        tree.inorder(root);
//        tree.postorder(root);
//        tree.levelOrder(root);

        // LCA2
        Node root= new Node(1);
        root.left= new Node(2);
        root.right= new Node(3);
        root.left.left= new Node(4);
        root.left.right= new Node(5);
        root.right.left= new Node(6);
        root.right.right= new Node(7);

        int n1=4, n2= 6;
//        System.out.println(lca2(root,n1,n2));
        System.out.println(minDist(root,n1,n2));
    }
}
