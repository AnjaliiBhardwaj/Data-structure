public class BoxWeight extends Box{
    double weight;

    public BoxWeight(){
        this.weight=-1;
    }
    BoxWeight(BoxWeight other){
        super(other);
        weight=other.weight;
    }
    BoxWeight(double side , double weight){
        super(other);
        this.weight=weight;
    }

    BoxWeight(double side, double weight)
    public BoxWeight(double l,double w,double h, double weight){
        super(l,w,h); // call the parent class constructor
        //used to initialise values present in parent class
        this.weight=weight;
    }
}