import java.util.*;
class StudentUse{
    public static void main(String[] args){
        Student s1=new Student(); // default constructor
        s1.name="Anjali";
        // s1.rollNum=11; accessing private val directly is not possible
        s1.setVal(11);
        System.out.println(s1.name);
        System.out.println(s1.getVal());

        // if using own constructor
        // Student s1=new Student("Anjali",123);
    }
}