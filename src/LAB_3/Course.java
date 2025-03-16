package LAB_3;
//ungraded


public class Course {
    public String name;
    public String code;
    public int max = 4;
    public int current = 0;

    String[] syllabus = new String[4];
    public void updateDetails(String s1, String s2){
        this.name = s1;
        this.code = s2;
    }
    public void addContent(String s){
        if(current < max){
            System.out.println(s+" was added. ");
            syllabus[current] = s;
            current++;
        }
        else{
            System.out.println("Cannot add more contents. ");
        }
    }
    public void addContent(String s1, String s2){
        String[] st = {s1,s2};
        for(String element: st){
            if(current < max){
                syllabus[current] = element;
                current++;
                System.out.println( element + " was added. ");
            }
            else{
                System.out.println("Cannot add more content. ");
            }
        }
    }
    public void  printDetails(){
        System.out.println("Course Details: \nCourse Name: "+name+"\nCourse Code: "+code+"\nCourse Syllabus: ");


        if(current == 0){
            System.out.println("No content yet");
        }
        for (int i = 0; i < current; i++) {
            if(i == current - 1  ) {
                System.out.print(syllabus[i]);
                System.out.println();
            }else{
                System.out.print(syllabus[i]+",");
            }

        }
    }

}
