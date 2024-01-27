import java.util.*;
class BinaryTreeUse{
    public static void print(BinaryTreeNode<Integer> root){
        if(root==null){
            return;
        }
        String toBePrinted=root.data+" ";
        if(root.left !=null){
            toBePrinted+="L: "+root.left.data+" ";
        }
        if(root.right !=null){
            toBePrinted+="R: "+root.right.data+" ";
        }
        System.out.println(toBePrinted);
        print(root.left);
        print(root.right);
    }
    public static BinaryTreeNode<Integer> takeInput(Scanner sc){
        int rootdata;
        System.out.println("Enter the root data:");
        rootdata=sc.nextInt();
        if(rootdata ==-1){
            return null;
        }
        BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(rootdata);
        root.left=takeInput(sc);
        root.right=takeInput(sc);

        return root;
    }
    public static void main(String[] args){
    //     BinaryTreeNode <Integer> root= new BinaryTreeNode<>(1);
    //     BinaryTreeNode <Integer> node1=new BinaryTreeNode<>(2);
    //     root.left=node1;
    //     BinaryTree <Integer> node2=new BinaryTreeNode<>(3);
    //     root.right=node2;
    //     BinaryTree <Integer> node3=new BinaryTreeNode<>(4);
    //     node2.left=node3;
    Scanner sc=new Scanner(System.in);
    BinaryTreeNode<Integer> root=takeInput(sc);
    print(root);
    }
}
