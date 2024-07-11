import java.util.*;
class BinaryNode{
    int data;
    BinaryNode left;
    BinaryNode right;

    BinaryNode(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
class MorrisTraversal{
    public static BinaryNode takeInput(Scanner sc){
        int rootdata=sc.nextInt();
        if(rootdata==-1){
            return null;
        }
        BinaryNode root=new BinaryNode(rootdata);
        root.left=takeInput(sc);
        root.right=takeInput(sc);

        return root;
    }
    public static void getInorder(BinaryNode root){
        if(root==null){
            return;
        }
        BinaryNode curr=root;
        BinaryNode pre;
        while(curr!=null){
            if(curr.left==null){
                System.out.print(curr.data+" ");
                curr=curr.right;
            }
            else{
                //find predecessor of current 
                pre=curr.left;
                while(pre.right!=null && pre.right!=curr){
                    pre=pre.right;
                }
                //make curr right child of predecessor
                if(pre.right==null){
                    pre.right=curr;
                    curr=curr.left;
                }
                // now break the thread to curr, revert the changes and move to right part
                else{
                    pre.right=null;
                    System.out.print(curr.data+" ");
                    curr=curr.right;
                }/* End of if condition pre->right == NULL
                   */

            }/* End of if condition current->left == NULL*/
        }
    }

    public static void getPreorder(BinaryNode root) {
        if (root == null) {
            return;
        }
        BinaryNode curr = root;
        BinaryNode pre;
        while (curr != null) {
            if (curr.left == null) {
                System.out.print(curr.data + " ");
                curr = curr.right;
            } else {
                // find the predecessor of current
                pre = curr.left;
                while (pre.right != null && pre.right != curr) {
                    pre = pre.right;
                }
                // make current the right child of its predecessor
                if (pre.right == null) {
                    System.out.print(curr.data + " "); // print before making the link
                    pre.right = curr;
                    curr = curr.left;
                } else { // revert the changes made in the 'if' part to restore the original tree
                    pre.right = null;
                    curr = curr.right;
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        BinaryNode root=takeInput(sc);
        getInorder(root);
        getPreorder(root);
    }
}