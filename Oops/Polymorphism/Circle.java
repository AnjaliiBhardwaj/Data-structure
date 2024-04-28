class Circle extends Shapes{

    //this will run when obj of circle is created 
    //hence it is overriding the parent method
    @Override // annotation ,usually to check for if it is overriden or not
    void area(){
        System.out.println("Area is pie*r*r");
    }
}