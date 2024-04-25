//Use of static keyword
public class Main{
    public static void main(String[] args){
        Human anjali=new Human(21,"Anjali",30000,false);
        Human riya=new Human(20,"Riya",10000,true);
        Human raj=new Human(30,"Raj",95000,true);

        System.out.println(anjali.name);
        //correct
        //even if we do not create object still we can access static variable  
        System.out.println(Human.population);
        //incorrect but still works
        System.out.println(raj.population);
        //if i dont use static then population changes will not reflect,i want population to be the factor that is independent of object and it willl be same for every property
    }
}