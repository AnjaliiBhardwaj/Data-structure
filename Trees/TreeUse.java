import java.util.*;
public class TreeUse{
    public static TreeNode<Integer> takeInput(){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter next node data");
        n=sc.nextInt();
        TreeNode <Integer> root=new TreeNode<Integer>(n);
        System.out.println("Enter the number of child nodes");
        int childnode=sc.nextInt();
        for(int i=0;i<childnode;i++){
            TreeNode<Integer> child=takeInput();
            root.children.add(child);
        }
        return root;
    }
    public static void main(String[] args){
        //create nodes which are not linked yet
        TreeNode <Integer> root=takeInput();
        // TreeNode <Integer> node1 =new TreeNode<Integer>(2);
        // TreeNode <Integer> node2=new TreeNode<Integer>(3);
        // TreeNode <Integer> node3=new TreeNode<Integer>(5);
        // TreeNode <Integer> node4=new TreeNode<Integer>(9);

        // //linking the nodes
        // root.children.add(node1);
        // root.children.add(node2);
        // root.children.add(node3);
        // node2.children.add(node4);

        // System.out.println(root);
    }
}