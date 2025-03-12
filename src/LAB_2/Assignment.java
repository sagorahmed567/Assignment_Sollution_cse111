//task6

package LAB_2;

public class Assignment {
    public int tasks;
    public String difficulty;
    public boolean submission;

    public void printDetails(){
        System.out.println("Number Of Task: "+tasks);
        System.out.println("Difficulty Level: "+difficulty);
        System.out.println("Submission_Required: "+submission);
    }
     public String makeOptional(){
        if(submission){
            submission = false;
            return "Assignment will not require submission";
        }else{
           return "Submission is already not required";
        }


     }

}
