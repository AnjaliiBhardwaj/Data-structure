// Compile time Polymorphism
public class Numbers{
    //constructor overloading
    int sum(int a, int b){
        return a+b;
    }
    int sum(int a, int b,int c){
        return a+b+c;
    }
    public static void main(String[] args){
        Numbers obj=new Numbers();
        obj.sum(2,3);
        obj.sum(1,2,3);
    }
}