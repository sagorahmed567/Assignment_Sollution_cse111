package LAB_4;

public class BracuStudent {
    public String name;
    public String address;
    public boolean flag = false;
    public BracuStudent(String name, String address){
        this.name = name;
        this.address = address;
    }
    public void getPass(){
        flag = true;
    }

    public void updateHome(String home){
        this.address = home;
    }


    public void showDetails(){
        System.out.println("Student Name: "+name+"\nLives in "+address+"\nHave Bus Pass? "+ flag);
    }
}
