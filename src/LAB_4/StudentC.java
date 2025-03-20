package LAB_4;
//Task 4
public class StudentC {
    public int ID;
    public double cgpa = Integer.MIN_VALUE;

    public int max = 4;
    String[] course_arr = new String[4];
    int tracker = 0;
    public StudentC(int n){
        this.ID = n;
        System.out.println("A student with ID "+n+" has been created.");
    }
    public StudentC(int n, double cgpa){
        this.ID = n;
        this.cgpa = cgpa;
        System.out.println("A student with ID "+n+" and cgpa: "+cgpa+" has been created.");

    }
    public void addCourse(String s){
        if(cgpa == Integer.MIN_VALUE){
            System.out.println("Failed to add "+s+"\nSet CG first");
        }
        else if (cgpa < 3.0){
            // adding course for cg under 3.0
            if (tracker < 3) {
                course_arr[tracker] = s;
                tracker++;
                if (tracker == 3) {
                    System.out.println("CG is low. Can't add more than 3 courses.");
                }
            }
        }
            // adding course for cg under 3.0
            else {
                if (tracker < max) {
                    course_arr[tracker] = s;
                    tracker++;
                    if (tracker == 4) {
                        System.out.println("Maximum 4 courses allowed.");
                    }
                }
            }
    }


    public void addCourse(String[] arr){

        if(cgpa == Integer.MIN_VALUE){
            System.out.println("Failed to add courses "+"\nSet CG first");
        }

        else if(cgpa < 3.0){
            // checking cgpa less than 3.0
            if(tracker < 3){
                for(String s: arr){
                    course_arr[tracker] = s;
                    tracker++;
                    if(tracker == 3){
                        System.out.println("CG is low. Can't add more than 3 courses");
                    }
                }
            }
        }else{
            if(tracker < 4){
                for(String s: arr){
                    course_arr[tracker] = s;
                    tracker++;
                    if(tracker == 4){
                        System.out.println("Failed to add "+arr[tracker] +"\n Maximum 4 courses allowed. ");
                        break;
                    }
                }
            }
        }
    }
    public void storeCG(double n){
        cgpa = n;
    }
    public void storeID(int n){
        this.ID = n;
    }

    public void removeAllCourse(){
        tracker = 0;
        for (int i = 0; i < course_arr.length; i++) {
            course_arr[i] = null;
        }
    }
    public void showAdvisee(){
        System.out.println("Student Id: "+ID+", CGPA: "+cgpa);
        System.out.println("Added courses are: ");

        for (int i = 0; i < tracker; i++) {
            if(i == tracker-1){
                System.out.println(course_arr[i-1]);
            }else{
                System.out.print(course_arr[i]+" ");
            }
        }
    }
}
