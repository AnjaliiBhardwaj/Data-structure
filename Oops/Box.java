public class Box{
    double l;
    double w;
    double h;

    Box(){
        this.l=-1;
        this.w=-1;
        this.h=-1;
    }
    //cube
    Box(double side){
        this.w=side;
        this.l=side;
        this.h=side;
    }

    Box(double l,double w,double h){
        this.l=l;
        this.w=w;
        this.h=h;
    }

//This constructor is used to create a new Box object that is a copy of an existing Box object. It ensures that the new Box has the same dimensions (h, l, and w) as the original Box.
    Box(Box old){
        this.h=old.h;
        this.l=old.l;
        this.w=old.w;
    }
    public void information(){
        System.out.println("Running the box");
    }
}