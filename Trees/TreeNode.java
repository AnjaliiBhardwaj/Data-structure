import java.util.*;
public class TreeNode<T>{
    public T data;
    public ArrayList <TreeNode <T>> children;

    //constructor
    public TreeNode(T data){
        this.data=data;
        children=new ArrayList <>();
    }
}