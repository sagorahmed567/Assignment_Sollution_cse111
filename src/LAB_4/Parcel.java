package LAB_4;

public class Parcel {
    public String name;
    public int weight = 0;
    public double total = 0.0;
    public Parcel(String s){
        this.name = s;
    }
    public Parcel(){}
    public Parcel(String name, int weight ){
        this.name = name;
        this.weight += weight;
    }

    public void addWeight(int n){
        this.weight += n;
        System.out.println("Updated Weight: "+weight);
    }

    public void calcFee(String s){
        if(s.equals("Dhanmondi")) {
            if (weight != 0) {
                this.total = (weight * 20) + 50;
            }else{
                this.total = 0;
            }
        }else{
            this.total = weight * 20;
        }
    }

    public void printDetails() {
        if(name == null){
            System.out.println("Set name first. ");
        }else{
            System.out.println("Name: "+name+"\nTotal Weight: "+weight+"\nTotal Fee: "+total);
        }
    }
}
