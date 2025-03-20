package LAB_4;

public class Student {
    public String name;
    public String prog;
    public Student(String s1, String s2){
        this.name = s1;
        this.prog = s2;
    }
    public void updateName(String name){
        this.name = name;
    }
    public void updateProgram(String p){
        this.prog = p;
    }
    public String accessProgram(){
        return this.prog;
    }
}
