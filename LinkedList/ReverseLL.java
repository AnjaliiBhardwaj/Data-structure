import java.util.*;
class node{
    int data;
    node next;

    node(int data){
        this.data=data;
        this.next=null;
    }
}
class ReverseLL{
    public static node takeInput(){
        node head=null;
        node tail=null;
        Scanner sc=new Scanner(System.in);
        int val=sc.nextInt();
        while(val!=-1){
            node newNode= new node(val);
            if(head==null){
                head=newNode;
                tail=newNode;
            }
            else{
                tail.next=newNode;
                tail=newNode;
            }
            val=sc.nextInt();
        }
        return head;
    }

    //T.c-> O(2n);
    //S.c-> O(n);
    public static node reverseUsingStack(node head){
        Stack <Integer> st=new Stack<>();
        node temp=head;
        while(temp!=null){
            st.push(temp.data);
            temp=temp.next;
        }

        temp=head;
        while(!st.isEmpty() && temp!=null){
            temp.data=st.pop();
            temp=temp.next;
        }
        return head;
    }

    //T.c ->O(n)
    //S.c ->O(1)
    public static node reverse(node head){
        node prev=null;
        node curr=head;
        node front=head;
        while(curr!=null){
            front=curr.next;
            curr.next=prev;
            prev=curr;
            curr=front;
        }
        return prev;
    }
    public static node recursive(node head){
        if(head==null || head.next==null){
            return head;
        }
        // Recursive step:
        // Reverse the linked list starting
        // from the second node (head.next)
        node newHead=recursive(head.next);
        node front=head.next;
        front.next=head;
        head.next=null;

        return newHead;
    }
    public static void print(node head){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args){
        node head=takeInput();
        // node newHead=reverseUsingStack(head);
        // node newHead=reverse(head);
        // print(newHead);
        node newHead=recursive(head);
        print(newHead);
    }
}