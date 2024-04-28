class Main{
    public static void main(String[] args){
        Shapes shape=new Shapes();
        Circle circle=new  Circle();
        // Square square= new Square();
        Shapes square=new Square();// it will store ref of square and will refer to square
        shape.area();
        circle.area();
        square.area();// it will call square
    }
}