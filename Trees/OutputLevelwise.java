import java.util.*;
class OutputLevelwise{
    public static TreeNode<Integer> takeInput(){
        Scanner sc=new Scanner(System.in);
        int rootdata=sc.nextInt();
        TreeNode<Integer> root=new TreeNode <Integer>(rootdata);
        Queue<TreeNode<Integer>> pendingNode=new LinkedList<>();
        pendingNode.add(root);
        while(!pendingNode.isEmpty()){
            TreeNode <Integer> frontNode=pendingNode.poll();
            int childCount=sc.nextInt();
            for(int i=0;i<childCount;i++){
                int child=sc.nextInt();
                TreeNode <Integer> childNode=new TreeNode<Integer>(child);
                frontNode.children.add(childNode);
                pendingNode.add(childNode);
            }
        }
        return root;
    }
    public static print(TreeNode<Integer> root){
        Queue<TreeNode<Integer> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int levelsize=q.size();
            for(int i=0;i<levelsize;i++){
                TreeNode<Integer> currentNode=q.poll();
                System.out.print(currentNode.data);
                for(TreeNode<Integer>child:currentNode.children){
                    q.add(child);
                }   
            }
            System.out.println();
        }

    }
    public static void main(String[] args){
        TreeNode<Integer> root=takeInput();
        print(root);
    }
}