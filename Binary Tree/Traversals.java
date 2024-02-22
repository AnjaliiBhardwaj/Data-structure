import java.util.*;
class Traversals{
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
    public static void Inorder(BinaryTreeNode<Integer> root){
        if(root==null){
            return;
        }
        Inorder(root.left);
        System.out.print(root.data+" ");
        Inorder(root.right);
    }
    public static void postOrder(BinaryTreeNode<Integer> root) {
		//Your code goes here
		if (root == null) {
            return;
        }

        // Recursively traverse the left subtree
        postOrder(root.left);

        // Recursively traverse the right subtree
        postOrder(root.right);

        // Process the current node (print or do something with the data)
        System.out.print(root.data + " ");
	}
    public static void main(String[] args){
        BinaryTreeNode<Integer> root=takeInput();
        Inorder(root);
        postOrder(root);
    }
}