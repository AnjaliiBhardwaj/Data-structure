
class Student{
    private int rollNum;
    String name;

    public Student(int rollNum,String name){
        this.rollNum=rollNum;
        this.name=name;
    }
    public int getRollNum(){
        return rollNum;
    }
    }
class Main1{
    public static void main(String[] args){
        Student s1=new Student(12,"Anjali");
        System.out.println(s1.name);
    }
}