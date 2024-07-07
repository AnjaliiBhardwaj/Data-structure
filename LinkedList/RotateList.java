import java.util.*;
class node{
    int data;
    node next;

    node(int data){
        this.data=data;
        this.next=next;
    }
}
class RotateList{
    public static node takeInput(Scanner sc){
        // Scanner sc=new Scanner(System.in);
        int val=sc.nextInt();
        node head=null;
        node tail=null;
        while(val!=-1){
            node newNode=new node(val);
            if(head==null){
                head=newNode;
                tail=head;
            }
            else{
                tail.next=newNode;
                tail=newNode;
            }
            val=sc.nextInt();
        }
        return head;
    }

    public static node rotation(node head,int k){
        if(head==null||head.next==null || k==0 ){
            return head;
        }
        node tail=head;
        int count=1;
        while(tail.next!=null){
            tail=tail.next;
            count++;
        }
        //make it circular
        tail.next=head;
        node newTail=tail;
        //if rotation is greator than size
        k=k%count;
        int cnt =1;
        int index=count-k;
        //ist pointed the new tail, as we know next itemto it will be head
        while(cnt<=index){
            newTail=newTail.next;
            cnt++;
        }
        head=newTail.next;
        newTail.next=null;
        return head;
    }
    public static void print(node head){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int k=sc.nextInt();
        node head=takeInput(sc);
        node newhead=rotation(head,k);
        print(newhead);
    }
}