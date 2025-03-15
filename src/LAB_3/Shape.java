package LAB_3;

public class Shape {
    public String s;
    public double n1;
    public double n2;

    public void setParameters(String s, double r){
        this.s = s;
        this.n1 = r;


    }
    public void setParameters(String s, double n1,int n2){
        this.s = s;
        this.n1 = n1;
        this.n2 = n2;

    }
    public void setParameters(String s, double n1, double n2){
        this.s = s;
        this.n1 = n1;
        this.n2 = n2;

    }
    public String details(){
        if(this.s.equals("Circle")) {
           return  "shape name: " + s+"\nArea: " + String.format("%.2f",Math.PI * Math.pow(n1, 2));
        }

        else if(this.s.equals("Triangle")){
          return "shape name: "+s+"\nArea: "+ 0.5 * n1 * n2;
        }
        else if(this.s.equals("Rectangle")){
          return "shape name: "+s+"\nArea: "+n1* n2;
        }
        else{
            return "Invalid";
        }
    }
}
