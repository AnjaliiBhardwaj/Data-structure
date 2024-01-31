import java.util.*;
class InputIteratively{
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
    public static void print(BinaryTreeNode<Integer> root){
        if(root==null){
            return;
        }
        Queue <BinaryTreeNode<Integer>> pendingNode=new LinkedList<>();
        pendingNode.add(root);
        while(!pendingNode.isEmpty()){
            BinaryTreeNode<Integer> front=pendingNode.poll();
            if(front!=null){
                System.out.print(front.data);
                if(front.left==null){
                System.out.print("L:-1");
            }
                else{
                System.out.print("L:"+front.left.data);
            }
            if(front.right==null){
                System.out.print("R:-1");
            }
            else{
                System.out.print("R:"+front.right.data);
            }
            System.out.println();
            pendingNode.add(front.left);
            pendingNode.add(front.right);
            }
            
        }


    }
    public static void main(String[] args){
        BinaryTreeNode<Integer> root=takeInput();
        print(root);
    }
}