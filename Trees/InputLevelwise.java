import java.util.*;
class InputLevelwise{
    public static TreeNode <Integer> takeInputLevelwise(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the root data: ");
        int rootdata=sc.nextInt();

        Queue <TreeNode<Integer>> pendingNode=new LinkedList<>();
        TreeNode<Integer> root=new TreeNode <Integer>(rootdata);
        pendingNode.add(root);

        while(!pendingNode.isEmpty()){
            TreeNode <Integer> frontNode=pendingNode.poll();
            System.out.println("Enter the number of children: ");
            int numChildren=sc.nextInt();
            for(int i=0;i<numChildren;i++){
                System.out.println("Enter "+(i+1)+ "th child of "+frontNode.data);
                int children=sc.nextInt();
                TreeNode<Integer> childNode=new TreeNode<Integer>(children);

                frontNode.children.add(childNode);
                pendingNode.add(childNode);
            }
        }
        return root;
    }
    public static void print(TreeNode <Integer> root){
        String s=root.data+": ";
        for(int i=0;i<root.children.size();i++){
            s+=root.children.get(i).data+" ,";
        }
         System.out.println(s);
        for(int i=0;i<root.children.size();i++){
            print(root.children.get(i));
        }
    }
    
    public static void main(String[] args){
        TreeNode<Integer> root=takeInputLevelwise();
        print(root);
    }
}