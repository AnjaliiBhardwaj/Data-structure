import java.util.*;
class RemoveLeaf{
    public static BinaryTreeNode<Integer> takeInput(){
        Scanner sc=new Scanner(System.in);
        int rootData=sc.nextInt();
        if(rootData==-1){
            return null;
        }
        BinaryTreeNode<Integer> root=new BinaryTreeNode<>(rootData);
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
    public static BinaryTreeNode<Integer> removeLeaves(BinaryTreeNode<Integer> root){
        if(root==null){
            return null;
        }
        if(root.left==null && root.right==null){
            return null;
        }
        root.left=removeLeaves(root.left);
        root.right=removeLeaves(root.right);

        return root;
    }
    public static void print(BinaryTreeNode<Integer> root){
        if(root==null){
            return;
        }
        Queue <BinaryTreeNode<Integer>> pendingNode=new LinkedList<>();
        pendingNode.add(root);
        while(!pendingNode.isEmpty()){
            BinaryTreeNode<Integer> front=pendingNode.poll();
            if(front!=null){
                System.out.print(front.data+" ");
                if(front.left==null){
                System.out.print("L:-1 ");
            }
                else{
                System.out.print("L: "+front.left.data);
            }
            if(front.right==null){
                System.out.print("R: -1");
            }
            else{
                System.out.print("R: "+front.right.data);
            }
            System.out.println();
            pendingNode.add(front.left);
            pendingNode.add(front.right);
            }
            
        }
    }
    public static void main(String[] args){
        BinaryTreeNode <Integer> root=takeInput();
        BinaryTreeNode <Integer> newRoot= removeLeaves(root);
        print(newRoot);

    }
}