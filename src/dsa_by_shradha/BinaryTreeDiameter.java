package dsa_by_shradha;
import java.lang.Math;

class NodeInTree {
    int data;
    NodeInTree Left;
    NodeInTree Right;
    NodeInTree(int data){
        Left=null;
        Right=null;
        this.data=data;
    }
}
class Create{
    static int index=-1;

    public NodeInTree createTree(int a[]){
        NodeInTree rootNode=null;
        index++;
        if(a[index]==-1){
            return null;
        }
        rootNode=new NodeInTree(a[index]);
        rootNode.Left=createTree(a);
        rootNode.Right=createTree(a);
        return rootNode;
    }
}
public class  BinaryTreeDiameter {
    public static void main(String[] args) {
        int ar[]={1,2,-1,-1,4,-1,-1};
        Create ob=new Create();
        System.out.println(ob.createTree(ar).data);
    }
}
