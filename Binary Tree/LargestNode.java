import java.util.*;
class LargestNode{
    public static BinaryTreeNode<Integer> takeInput(){
        Scanner sc=new Scanner (System.in);
        int rootdata=sc.nextInt();
        if(rootdata==-1){
            return null;
        }
        BinaryTreeNode<Integer> root=new BinaryTreeNode<>(rootdata);
        Queue <BinaryTreeNode<Integer>> pendingNode=new LinkedList<>();
        pendingNode.add(root);
        while(!pendingNode.isEmpty()){
            BinaryTreeNode<Integer> frontNode=pendingNode.poll();
            int leftdata=sc.nextInt();
            if(leftdata!=-1){
                BinaryTreeNode<Integer> leftChild=new BinaryTreeNode<>(leftdata);
                frontNode.left=leftChild;
                pendingNode.add(leftChild);
                
            }
            int rightdata=sc.nextInt();
            if(rightdata!=-1){
                BinaryTreeNode<Integer> rightChild=new BinaryTreeNode<>(rightdata);
                 frontNode.right=rightChild;
                pendingNode.add(rightChild);
               
            }
        }
        return root;

    }
    public static int Largest(BinaryTreeNode<Integer> root){
        if(root==null){
            return -1;
        }
        int largest=root.data;
        int largestLeft=Largest(root.left);
        int largestRight=Largest(root.right);
        
        return (Math.max(largest,Math.max(largestLeft,largestRight)));

    }
    public static void main(String[] args){
        BinaryTreeNode<Integer> root=takeInput();
        int ans=Largest(root);
        System.out.print(ans);
    }
}