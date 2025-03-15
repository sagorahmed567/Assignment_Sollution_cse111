package LAB_3;

public class Student {
    public String name = "Not Set";
    public String dept = "CSE";
    public double cgpa = 0.0;
    public int credit = 9;
    public String scholarship = " Not Set";

    public void updateDetails(String name, double cgpa, int credit){
        this.name = name;
        this.cgpa = cgpa;
        this.credit = credit;
    }
    public void updateDetails(String name, double cgpa){
        this.name = name;
        this.cgpa = cgpa;
    }

    public void updateDetails(String name, double cgpa, int credit, String dept){
        this.name = name;
        this.cgpa = cgpa;
        this.credit = credit;
        this.dept = dept;
    }
    public void checkScholarshipEligibility(){
        if(cgpa >= 3.5 && credit >10) {
            if(cgpa >= 3.5 && cgpa < 3.7){
                this.scholarship = "Need Based";
                System.out.println(name+" is eligible for Need-based scholarship");
            } else if(cgpa >= 3.7){
                this.scholarship = "Merit Based";
                System.out.println(name+" is eligible for Merit-based scholarship");
            }
        }
        else{
            scholarship = "No scholarship";
            System.out.println(name+" is not eligible for scholarship.");
        }
    }
    public void showDetails(){
        System.out.println("Name: "+name+"\nDepartment: "+ dept+"\nCGPA: "+cgpa+"\nCredits: "+credit+"\nScholarship  Status: "+scholarship);
    }

}
