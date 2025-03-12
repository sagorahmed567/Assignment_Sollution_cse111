package LAB_2;

public class Employee {

        private String name;
        private double salary;
        private String designation;


        public Employee() {
            this.salary = 30000;
            this.designation = "junior";
        }


        public void newEmployee(String name) {
            this.name = name;
        }

        public void displayInfo() {
            System.out.println("Employee Name: " + name);
            System.out.println("Employee Salary: " + salary + " Tk");
            System.out.println("Employee Designation: " + designation);
        }

        public void calculateTax() {
            if (salary > 50000) {
                System.out.println(name + " Tax Amount: " + (salary * 0.3) + " Tk");
            } else if (salary > 30000) {
                System.out.println(name + " Tax Amount: " + (salary * 0.1) + " Tk");
            } else {
                System.out.println("No need to pay tax");
            }
        }

        public void promoteEmployee(String newDesignation) {
            if (newDesignation.equals("senior")) {
                salary += 25000;
            } else if (newDesignation.equals("lead")) {
                salary += 50000;
            } else if (newDesignation.equals("manager")) {
                salary += 75000;
            }
            this.designation = newDesignation;
            System.out.println(name + " has been promoted to " + newDesignation);
            System.out.println("New Salary: " + salary + " Tk");
        }

}
