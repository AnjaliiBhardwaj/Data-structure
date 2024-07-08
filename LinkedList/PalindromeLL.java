import java.util.*;
class node{
    int data;
    node next;

    node (int data){
        this.data=data;
        this.next=null;
    }
}
class PalindromeLL{
    public static node takeInput(){
        Scanner sc=new Scanner(System.in);
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
                tail=tail.next;
            }
            val=sc.nextInt();
        }
        return head;
    }

    public static boolean palindrome(node head){
        //using stack 
        //t.c-> O(n)
        //s.c-> O(n)
        node temp=head;
        int count=1;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        count=count/2;
        Stack <node> st=new Stack<>();
        node helper=head;
        while(count>=1){
            st.push(helper);
            helper=helper.next;
            count--;
        }
        while(helper!=null){
            node check=st.pop();
            if(helper.data!=check.data){
                return false;
            }
            helper=helper.next;
        }
        return true;
    }

    public static node reverse(node head){
        node prev=null;
        node curr=head;
        node front=head;

        while(curr!=null){
            front=front.next;
            curr.next=prev;
            prev=curr;
            curr=front;
        }
        return prev;
    }
    public static boolean palindromeOpt(node head){
        //T.c-> O(n)
        node slow=head;
        node fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        node newHead=slow.next;
        slow.next=null;
        
        //reverse second half;
        node head2=reverse(newHead);

        //compare both list
        node l1=head;
        node l2=head2;
        while(l1!=null && l2!=null){
            if(l1.data!=l2.data){
                return false;
            }
            l1=l1.next;
            l2=l2.next;
        }
        return true;

    }
    public static void main(String[] args){
        node head=takeInput();
        boolean ans=palindromeOpt(head);
        System.out.println(ans);
    }
}