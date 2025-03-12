//task5

package LAB_2;

public class Course {
    public String courseName;
    public String courseCode;

    public int courseCredit;


    public void updateDetails(String s1, String s2, int i){
        this.courseName = s1;
        this.courseCode = s2;
        this.courseCredit = i;
    }
    public void displayCourse(){
        System.out.println("Course Name: "+ this.courseName);
        System.out.println("Course Code: "+this.courseCode);
        System.out.println("Course Credit: "+this.courseCredit);

    }
}
