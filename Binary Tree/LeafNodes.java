import java.util.*;
class LeafNodes{
    public static int countLeaves(BinaryTreeNode<Integer> root){
        if(root==null){
            return 0;
        }
        if(root.left==null && root.right==null){
            return 1;
        }
        return countLeaves(root.left)+countLeaves(root.right);
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
        BinaryTreeNode<Integer> root=takeInput();
        int ans=countLeaves(root);
        System.out.print(ans);
    }
}