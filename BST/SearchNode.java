import java.util.*;
class SearchNode{
    public static boolean searchInBST(BinaryTreeNode<Integer> root, int k) {
        if(root==null){
            return false;
        }
		 if(root.data==k){
            return true;
        }
        else if(root.data<k){
            return searchInBST(root.right,k);
        }
        else if(root.data>k){
            return searchInBST(root.left,k);
        }

        return false;
	}
}