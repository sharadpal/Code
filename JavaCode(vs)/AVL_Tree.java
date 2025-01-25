import java.util.*;
public class AVL_Tree {
    static class Node{
        int data,height;
        Node left,right;
        Node(int data){
            this.data=data;
            height=1;
        }
    }
    public static Node root;
    public static int height(Node data){
        if(root==null){
            return 0;
        }
        return root.height;
    }
    static int max(int a,int b){
        return (a>b) ? a:b;
    }

    public static int getBalance(Node root){
        if(root==null){
            return 0;
        }
        return height(root.left) - height(root.right);
    }
    public static Node leftRotate(Node x){
        Node y= x.right;
        Node T2= y.left;
        // perform rorate
        y.left= x;
        x.right= T2;
        //update heights
        x.height= Math.max(height(x.left),height(x.right))+1;
        y.height= Math.max(height(y.left), height(y.right))+1;
        return y;
    }

    public static Node rightRotate(Node y){
        Node x= y.left;
        Node T2= x.right;
        // perform rotation
        x.right= y;
        y.left= T2;
        // update height
        y.height= Math.max(height(y.left), height(y.right))+1;
        x.height= Math.max(height(x.left),height(x.right))+1;
        return x;
    }

    public static Node insert(Node root,int key){
        if(root==null){
            return new Node(key);
        }
        if(key<root.data){
            root.left= insert(root.left,key);
        }
        else if(key>root.data){
            root.right= insert(root.right,key);
        }
        else{
            return root;
        }  // updatae root.height
        root.height=1+Math.max(height(root.left),height(root.right));
        // get root's balance factor
        int bf= getBalance(root);
        if(bf>1 && key<root.left.data){  // left left case
            return rightRotate(root);
        }
        if(bf<-1 && key>root.right.data){   // right right case
            return leftRotate(root);
        }
        if(bf>1 && key>root.left.data){      // left right case
            root.left= leftRotate(root.left);
            return rightRotate(root);
        }
        if(bf<-1 && key<root.right.data){  // right left case
            root.right= rightRotate(root.right);
            return leftRotate(root);
        }
        return root;      // returned if avl balanced
    }
    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        root= insert(root,10);
        root=insert(root,20);
        root= insert(root,30);
        root=insert(root,40);
        root= insert(root,50);
        root=insert(root,25);
        preorder(root);
    }
}
