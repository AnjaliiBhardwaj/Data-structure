import java.util.*;
class Pair{
    int value;
    int weight;

    Pair(int value,int weight){
        this.value=value;
        this.weight=weight;
    }
}
class FractionalKnapsack{
    public static double knapsack(int capacity,Pair items[]){
        // Sort items by value to weight ratio
        Arrays.sort(items, (a, b) -> Double.compare((double)b.value / b.weight, (double)a.value / a.weight));

        double totalValue = 0.0;

        for (Pair item : items) {
            if (capacity - item.weight >= 0) {
                // If the item can be fully included
                capacity -= item.weight;
                totalValue += item.value;
            } else {
                // If the item cannot be fully included, take the fraction of it
                totalValue += (double)item.value * capacity / item.weight;
                break;
            }
        }
        return totalValue;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int cap=sc.nextInt();
        Pair item[]=new Pair[n];
        for(int i=0;i<n;i++){
            int value=sc.nextInt();
            int weight=sc.nextInt();
            item[i]=new Pair(value, weight);
        }
        double maxVal=knapsack(cap,item);
        System.out.print(maxVal);
    }
}