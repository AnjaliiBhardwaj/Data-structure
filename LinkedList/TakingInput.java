//Using head only (Time Complexity= O(n2))
import java.util.*;
class TakingInput{
    public static Node <Integer> takeInput(){
        Node <Integer> head= null;
        Scanner sc=new Scanner(System.in);
        int data=sc.nextInt();

        while(data!=-1){
            Node <Integer> newnode=new Node <Integer>(data);
            //ist element insert
            if(head==null){
                head=newnode;
            }else{
                Node<Integer> temp=head;
                while(temp.next!=null){
                    temp=temp.next;
                }
                //found where last element is with next val null
                temp.next=newnode;
            }
            data=sc.nextInt();
        }
        return head;
    }
    public static void print(Node <Integer> head){
        
        while(head!=null){
            System.out.println(head.data+" ");
            head=head.next;
        }
    }

    public static void main(String[] args){
        Node<Integer> head = takeInput();
		print(head);
    }
}