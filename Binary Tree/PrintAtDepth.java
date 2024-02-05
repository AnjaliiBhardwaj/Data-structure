import java.util.*;
class PrintAtDepth{
    public static void printDepth(BinaryTreeNode<Integer> root,int k){
        if(root==null){
            return ;
        }
        if(k==0){
            System.out.print(root.data+" ");
            return ;
        }
        printDepth(root.left,k-1);
        printDepth(root.right,k-1);
    }
    public static BinaryTreeNode<Integer> takeInput(){
        Scanner sc=new Scanner(System.in);
        int rootdata=sc.nextInt();
        if(rootdata==-1){
            return null;
        }
        BinaryTreeNode<Integer> root=new BinaryTreeNode<>(rootdata);
        Queue<BinaryTreeNode<Integer>> pendingNode=new LinkedList<>();
        pendingNode.add(root);
        while(!pendingNode.isEmpty()){
            BinaryTreeNode<Integer> frontNode=pendingNode.poll();
            int leftchild=sc.nextInt();
            if(leftchild!=-1){
                BinaryTreeNode<Integer> leftChild=new BinaryTreeNode<>(leftchild);
                pendingNode.add(leftChild);
                frontNode.left=leftChild;
            }
            int rightchild=sc.nextInt();
            if(rightchild!=-1){
                BinaryTreeNode<Integer> rightChild=new BinaryTreeNode<>(rightchild);
                pendingNode.add(rightChild);
                frontNode.right=rightChild;
            }
        }
        return root;
    }
    public static void main(String[] args){
        BinaryTreeNode<Integer> root =takeInput();
        int k=sc.nextInt();
    }
}