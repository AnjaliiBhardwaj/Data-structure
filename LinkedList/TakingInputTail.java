//Using head and tail TC(O(n))
import java.util.*;
class TakingInputTail{
    public static Node<Integer> takeInput(){
        Node <Integer> head=null,tail=null;
        Scanner sc=new Scanner(System.in);
        int data= sc.nextInt();

        while(data!=-1){
            Node <Integer> newnode=new Node <Integer> (data);
            if(head==null){
                head=newnode;
                tail=newnode;
            }
            else{
                tail.next=newnode;
                tail=newnode;
            }
            data=sc.nextInt();
        }
        return head;
    }
    public static void print(Node<Integer> head){
         while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
        System.out.println();
    }
    public static void main(String[] args){
        Node<Integer> head = takeInput();
		print(head);
    }
}