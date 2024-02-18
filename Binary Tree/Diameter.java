import java.util.*;
class Diameter{
    public static int height(BinaryTreeNode<Integer> root){
        if(root==null){
            return 0;
        }
        int leftHeight=height(root.left);
        int rightHeight=height(root.right);

        return 1+(Math.max(leftHeight,rightHeight));
    }
    public static int diameter(BinaryTreeNode<Integer> root){
        if(root==null){
            return 0;
        }
        //if tree has child at every node(have left tree and right tree both)
        int option1=height(root.left)+height(root.right);
        //if both the starting and ending farthest nodes exist on left side of the tree
        int option2=diameter(root.left);
        //if both the starting and ending farthest nodes exist on right side of the tree
        int option3=diameter(root.right);

        return(Math.max(option1,Math.max(option2,option3)));
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
    public static void main(String[] args){
        BinaryTreeNode <Integer> root=takeInput();
        System.out.println("diameter: "+ diameter(root));
    }
}