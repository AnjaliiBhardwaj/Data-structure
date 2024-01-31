import java.util.*;
class SumOfNodes{
    public static BinaryTreeNode<Integer> takeInput(){
        Scanner sc=new Scanner(System.in);
        int rootdata=sc.nextInt();
        if(rootdata==-1){
            return null;
        }
        BinaryTreeNode<Integer> root=new BinaryTreeNode<>(rootdata);
        Queue <BinaryTreeNode<Integer>> pendingNode=new LinkedList<>();
        pendingNode.add(root);
        while(!pendingNode.isEmpty()){
            BinaryTreeNode<Integer> frontNode=pendingNode.poll();
            int leftNodeData=sc.nextInt();
            if(leftNodeData!=-1){
                BinaryTreeNode<Integer> leftNode = new BinaryTreeNode<>(leftNodeData);
                frontNode.left=leftNode;
                pendingNode.add(leftNode);
            }
            int rightNodeData=sc.nextInt();
            if(rightNodeData!=-1){
                BinaryTreeNode<Integer> rightNode = new BinaryTreeNode<>(rightNodeData);
                frontNode.right=rightNode;
                pendingNode.add(rightNode);
            }
        }
        return root;
    }
    public static int NodeSum(BinaryTreeNode<Integer> root){
        if(root==null){
            return 0;
        }
        int sum=0;
        sum=NodeSum(root.left)+NodeSum(root.right);
        return (sum + root.data);
    }
    public static void main(String[] args){
        BinaryTreeNode<Integer> root=takeInput();
        System.out.print(NodeSum(root));
    }
}