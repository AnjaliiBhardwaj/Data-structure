public class Map{
    ArrayList<MapNode<K,V>> buckets;
    int count; //no of ele
    int numBuckets;
    public Map(){
        buckets=new ArrayList<>();
        numBuckets=20;
        for(int i=0;i<numBuckets;i++){
            buckets.add(null);
        }
    }
}