import java.util.*;
class InputIteratively{
    public static BinaryTreeNode<Integer> takeInput(){
        Scanner sc=new Scanner(System.in);
        int rootdata=sc.nextInt();
        if(root.data==-1){
            return null;
        }
        Queue <BinaryTreeNode<Integer>> pendingNode=new LinkedList<>(rootdata);
        BinaryTreeNode<Integer> root=new BinaryTreeNode<>(rootdata);
        while(!pendingNode.isEmpty()){
            BinaryTreeNode <Integer> frontNode=pendingNode.poll();
            int leftChild=sc.nextInt();
            if(leftChild!=-1){
                BinaryTreeNode<Integer> child=new BinaryTreeNode<>(leftChild);
                frontNode.left.add(child);
                pendingNode.add(child);
            }
            int rightChild=sc.nextInt();
            if(rightChild!=-1){
                BinaryTreeNode<Integer> child=new BinaryTreeNode<>(rightChild);
                frontNode.right.add(child);
                pending.add(child);
            }

        }
        return root;
    }
    public static void print(BinaryTreeNode<Integer> root){
        
    }
    public static void main(String[] args){
        BinaryTreeNode<Integer> root=takeInput();
        print(root);
    }
}