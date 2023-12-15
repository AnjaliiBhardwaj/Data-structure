import java.util.*;
class InsertNode{
    public static Node <Integer> takeInput(){
        Scanner sc=new Scanner(System.in);
        Node <Integer> head=null,tail=null;
        int data=sc.nextInt();

        while(data!=-1){
            Node<Integer> newnode=new Node<Integer>(data);
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
    public static Node<Integer> Insert(Node <Integer> head, int pos, int val){
        Node<Integer> newnode=new Node<Integer> (val);
        if(pos==0){
            newnode.next=head;
            return newnode;
        }
        int i=0;
        Node<Integer> temp=head;
        while(i<pos-1){
            temp=temp.next;
            i++;
        }
        newnode.next=temp.next;
        temp.next=newnode;
        return head;
    }
    public static void print(Node <Integer> head){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int pos=sc.nextInt();
        int val=sc.nextInt();
        Node <Integer> head=takeInput();
        head= Insert(head,pos,val);
        print(head);
    }
}