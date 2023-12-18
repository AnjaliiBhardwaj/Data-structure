import java.util.*;
class DeleteNode{
    public static Node <Integer> DeleteNode(Node <Integer> head,int pos){
        Node <Integer> temp=head,prev=head;
        int count=0;
        while(temp!=null){
            if(count==pos){
                prev.next=temp.next;
                break;
            }
            prev=temp;
            temp=temp.next;
            count++;
        }
        return head;
    }
    public static void print(Node <Integer> head){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
        System.out.println();
    }
    public static Node<Integer> takeInput(){
        Scanner sc=new Scanner(System.in);
        int data=sc.nextInt();
        Node <Integer> head=null,tail=null;

        while(data!=-1){
            Node <Integer> newnode=new Node<Integer> (data);
            if(head==null){
                head=newnode;
                tail=newnode;
            }
            else{
                tail.next=newnode;
                tail=tail.next;
            }
            data=sc.nextInt();
        }
        return head;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int pos=sc.nextInt();
        Node <Integer> head=takeInput();
        head=DeleteNode(head,pos);
        print(head);
    }
}