import java.util.*;
class BinaryNode{
    int data;
    BinaryNode left;
    BinaryNode right;

    public BinaryNode(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}

class takeInput{
    public static BinaryNode takeInputIte(){
        Scanner sc=new Scanner(System.in);
        int rootdata=sc.nextInt();
        if(rootdata==-1){
            return null;
        }
        BinaryNode root=new BinaryNode(rootdata);
        Queue <BinaryNode> pendingNode=new LinkedList<>();
        pendingNode.add(root);
        while(!pendingNode.isEmpty()){
            BinaryNode front=pendingNode.poll();
            int leftdata=sc.nextInt();
            if(leftdata!=-1){
                BinaryNode leftNode=new BinaryNode(leftdata);
                front.left=leftNode;
                pendingNode.add(leftNode);
            }

            int rightdata=sc.nextInt();
            if(rightdata!=-1){
                BinaryNode rightNode=new BinaryNode(rightdata);
                front.right=rightNode;
                pendingNode.add(rightNode);
            }
        }
        return root;
    }
    public static void print(BinaryNode root){
        if(root==null){
            return;
        }
        if(root.data!=-1){
            System.out.print(root.data+" ");
        }
        print(root.left);
        print(root.right);
    }
    public static BinaryNode inputRec(Scanner sc){
        int rootdata=sc.nextInt();
        if(rootdata==-1){
            return null;
        }
        BinaryNode root=new BinaryNode(rootdata);
        root.left=inputRec(sc);
        root.right=inputRec(sc);
        return root;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        // BinaryNode root=inputRec(sc);
        BinaryNode root=takeInputIte();
        print(root);
    }
}