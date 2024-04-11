import java.util.ArrayList;
public class Priority_Queue{
    private ArrayList<Integer> heap;
    public Priority_Queue(){
        heap=new ArrayList<>();
    }
    boolean isEmpty(){
        return heap.size()==0;
    }
    int size(){
        return heap.size();
    }
    int getMin() throw PriorityQueueException
    {
        if(isEmpty()){
            //Throw an exception
            throw new PriorityQueueException();
        }
        return heap.get(0);
    }
}