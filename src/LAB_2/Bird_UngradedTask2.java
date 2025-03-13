package LAB_2;

public class Bird_UngradedTask2 {
    public String name;
    public void flyUp(int n){
        System.out.println(this.name+" has flown up "+ n+ " feet");
    }
    public void makeNoise(){
        if(this.name.equals("Parrot")){
            System.out.println("Squawk");
        }
        else if(this.name.equals("Eagle")){
            System.out.println("Squee");
        }
    }
    public void flyDown(int n){
        if(n != 1){
            System.out.println(this.name+" has flown down "+n+ " feet");
        }else{
            System.out.println(this.name+" has flown down "+n +" feet and landed");
        }
    }

}
