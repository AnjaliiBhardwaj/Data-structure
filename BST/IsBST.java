import java.util.*;
class IsBST{
    public static boolean isBST(BinaryTreeNode<Integer> root) {

		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */
		return isBSTHelper(root,Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	public static boolean isBSTHelper(BinaryTreeNode<Integer> root, int min, int max){
		if(root==null){
			return true;
		}
		if(root.data <min || root.data>max){
			 return false;
		}
		return isBSTHelper(root.left, min, root.data-1) && isBSTHelper(root.right, root.data+1, max);
	}
}