import java.util.*;
class PrintIthNode{
    public static void ithnode(Node<Integer> head,int i){
        int count=0;
        Node<Integer> temp=head;
        while(count<=i && temp!=null){
            if(count==i){
                System.out.print(temp.data);
                return;
            }
            temp=temp.next;
            count++;
        }

    }
    public static Node <Integer> takeinput(){
        Scanner sc=new Scanner(System.in);
        Node<Integer> head=null,tail=null;
        int data=sc.nextInt();
        while(data!=-1){
            Node <Integer> newnode=new Node<Integer> (data);
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
    // public static void print(Node <Integer> head){
    //     while(head!=null){
    //         System.out.print(head.data+" ");
    //         head=head.next;
    //     }
    //     System.out.println();
    // }
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int i=sc.nextInt();
        Node<Integer> head=takeinput();
        ithnode(head,i);
    }
}