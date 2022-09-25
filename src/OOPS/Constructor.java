package OOPS;
class Employee{
    int salary;
    int age;
    String name;

    public Employee(){
        salary = 75000;
        age = 12;
        name =  "akash yadav";
    }
    public  Employee(String n , int a1 , int s){
        name = n;
        age = a1;
        salary = s;
    }
    public int getSalary(){
        return salary;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
}

public class Constructor {
    public static void main(String[] args) {
        Employee emp1 = new Employee("kartik" , 12 , 2000);
        System.out.println(emp1.getAge());
        System.out.println(emp1.getName());
        System.out.println(emp1.getSalary());
    }
}
