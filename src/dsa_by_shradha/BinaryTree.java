package dsa_by_shradha;
import java.util.Queue;
import java.util.LinkedList;
public class BinaryTree {
    static int index=-1;
   //static Scanner ob =new Scanner(System.in);
    public static void main(String[] args) {
        int arr[]={12,13,-1,-1,14,-1,-1};
       Node root= createTree(arr);
        //System.out.println(root.data);
        System.out.println(heightOfTree(root));
    }
    public static void inOrder(Node root){
        if(root==null){
            return ;
        }
        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }
    public static void levelOrder(Node root){
        if(root==null){
            System.out.println("Tree is Empty");
            return;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
          Node current=q.remove();
            if(current == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                System.out.println(current.data);
                if(current.left!=null){
                    q.add(current.left);
                }
                if(current.right!=null){
                    q.add(current.right);
                }
            }
        }
    }
    static int sumValue(Node root){
        if(root==null){
            return 0;
        }
        int l=sumValue(root.left)+root.data;
        int r=sumValue(root.right);
        return l+r;
    }
   static public int count(Node root){
        if(root==null){
            return 0;
        }
        int l=count(root.left);
        int r=count(root.right);
        return l+r+1;
    }
    public static int heightOfTree(Node root){
        if(root==null){
            return 0;
        }
        int l=count(root.left)+1;
        int r=count(root.right);

        return (l>r?l:r);
    }
    public static  Node createTree(int arr[]){
        Node root=null;
        index++;
        int data=arr[index];
        if(arr[index]==-1){
           return null;
        }
        root=new Node(data);
        root.left=createTree(arr);
        root.right=createTree(arr);
        return root;
    }
}
class Node {
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
    }
}