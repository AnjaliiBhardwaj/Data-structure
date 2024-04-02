class Employee{
    String name;
    int salary;
    String phoneNum;
}
class EmployeeUse{
    public static void main(String[] args){
        Employee e1=new Employee();
        e1.name="Anjali";
        e1.salary=60000;
        e1.phoneNum="9876534567";
        System.out.print(e1.name);
    } 
}
/**If you want to run the main method from the EmployeeUse class, you need to specify the EmployeeUse class as the entry point when running the Java program. Here's how you can do it:

Compile the Java file containing both classes (Employee.java):

Copy code
-------------javac Employee.java------
Run the Java program using the EmployeeUse class as the entry point:

Copy code
---------java EmployeeUse--------------
This way, you specify the class containing the main method (EmployeeUse in this case) when running the program, and it should execute without any issues. */