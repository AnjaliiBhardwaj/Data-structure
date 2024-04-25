// Use of static keyword
class Human{
    int age;
    String name;
    int salary;
    boolean married;
    static long population;
    
    public Human(int age,String name,int salary,boolean married){
        this.age=age;
        this.name=name;
        this.salary=salary;
        this.married=married;
        //why class name because static keyword is independent of objects so not using this keyword
        Human.population+=1;
    }
}