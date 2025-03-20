package LAB_4;

public class Teacher {
    public String name;
    public String initial;
    public int tracker = 0;
    String [] arr = new String[3];

   public Course c;
    public Teacher(String name,String dept){
        this.name = name;
        this.initial = dept;
        System.out.println("A new teacher has been created.");
    }
    public void addCourse(Course c){
        if(tracker < 3){
            this.arr[tracker] = c.course;
            tracker++;
        }
    }
    public void printDetail(){
        System.out.println("Name: "+this.name+"\nInitial: "+this.initial+"\nList of courses: ");
        for (int i = 0; i < tracker; i++) {
            System.out.println(arr[i]);
        }
    }


}
