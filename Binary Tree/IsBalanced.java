import java.util.*;
class IsBalanced{
    public static BalancedTreeReturn isBalancedBetter(BinaryTreeNode<Integer> root){
        if(root==null){
            int height=0;
            boolean isBal=true;
            BalancedTreeReturn ans=new BalancedTreeReturn();
            ans.height=height;
            ans.isBalanced= isBal;

            return ans;
        }
        BalancedTreeReturn checkLeft=isBalancedBetter(root.left);
        BalancedTreeReturn checkRight=isBalancedBetter(root.right);

        boolean isBal=true;
        int height= 1+Math.max(checkLeft.height,checkRight.height);
        if(Math.abs(checkLeft.height - checkRight.height)>1){
            isBal=false;
        }
        else if(!checkLeft.isBalanced || !checkRight.isBalanced){
            isBal=false;
        }

        BalancedTreeReturn ans= new BalancedTreeReturn();
        ans.height=height;
        ans.isBalanced=isBal;

        return ans;

    }
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
        // checking for isBalanced field from the BalancedTreeReturn object.
        System.out.print("is balanced :"+ isBalancedBetter(root).isBalanced);
    }
}