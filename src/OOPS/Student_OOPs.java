package OOPS;
    class Student {
        int rollNo;
        String name;
        int marks;
        int salary;

        public void printDetails() {
            System.out.println(rollNo);
            System.out.println(name);
            System.out.println(marks);
        }
        public int getSalary(){
            return salary;
        }
    }





    public class Student_OOPs {
        public static void main(String[] args) {
            Student shubham = new Student();
            shubham.rollNo = 12;
            shubham.name = "Srivastava";
            shubham.marks = 98;
            shubham.printDetails();
            shubham.salary = 25000;
            int s = shubham.getSalary();
            System.out.println(s);

            // System.out.println(shubham.name);
            //  System.out.println(shubham.marks);
        }

    }

