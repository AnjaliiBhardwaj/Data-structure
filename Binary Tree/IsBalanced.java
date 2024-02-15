import java.util.*;
class IsBalanced{
    public static BinaryTreeNode<Integer> takeInput(){
        Scanner sc=new Scanner (System.in);
        int rootdata=sc.nextInt();
        if(rootdata==-1){
            return null;
        }
        BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer> (rootdata);
        Queue <BinaryTreeNode<Integer>> pendingNode=new LinkedList<>();
        pendingNode.add(root);
        while(!pendingNode.isEmpty()){
            BinaryTreeNode<Integer> frontNode=pendingNode.poll();
            int left=sc.nextInt();
            if(left!=-1){
                BinaryTreeNode<Integer> leftNode=new BinaryTreeNode<>(left);
                frontNode.left=leftNode;
                pendingNode.add(leftNode);
            }
            int right=sc.nextInt();
            if(right!=-1){
                BinaryTreeNode<Integer> rightNode=new BinaryTreeNode<>(right);
                frontNode.right=rightNode;
                pendingNode.add(rightNode);
            }

        }
        return root;
    }
    public static int height(BinaryTreeNode<Integer> root){
        if(root==null){
            return 0;
        }
        int leftheight=height(root.left);
        int rightheight=height(root.right);

        return (1+ Math.max(leftheight,rightheight));
    }
    public static boolean checkBalanced(BinaryTreeNode<Integer> root){
        if(root==null){
            return true;
        }
        // to check for every sub tree as well
        int leftheight=height(root.left);
        int rightheight=height(root.right);

        if(Math.abs(leftheight-rightheight)>1){
            return false;
        }
        boolean isLeftBalanced=checkBalanced(root.left);
        boolean isRightBalanced=checkBalanced(root.right);

        return (isLeftBalanced && isRightBalanced); 

    }

    public static void main(String[] args){
        BinaryTreeNode <Integer> root=takeInput();
        height(root);
        System.out.print("is balanced :"+ checkBalanced(root));
    }
}