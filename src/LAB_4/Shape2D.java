package LAB_4;

public class Shape2D {
    public int length;
    public String name;
    public int breadth;
    public int side3 = Integer.MIN_VALUE;

    public Shape2D(){
        this.name = "Square";
        this.length = 5;
        System.out.println("A Square has been created with length "+length);
    }
    public Shape2D(int n1, int n2){
        this.name = "Rectangle";
        this.breadth = n2;
        this.length = n1;
        System.out.println("A Rectangle has been created with length: "+length+" and breadth: "+breadth);

    }
    public Shape2D(int n1, int n2,String s){
        this.name = s;
        this.length = n1;
        this.breadth = n2;
        System.out.println("A "+name +" has been created with height: "+length+"and base: "+breadth);
    }

    public Shape2D(int n1, int n2, int n3){
        this.name = "Triangle";
        length = n1;
        breadth = n2;
        side3 = n3;
        System.out.println("A triangle has been created with the following sides: "+length+","+breadth+","+side3);

    }

    public void area(){
        if(name.equals("Square")){
            System.out.println("The area of the "+name+" is: \n"+ Math.pow(length,2));
        }else if(name.equals("Rectangle")){
            System.out.println("The area of the "+name+" is: \n"+ ( breadth * length));
        }else if(name.equals("Triangle") && side3 == Integer.MIN_VALUE){
            System.out.println("The area of the "+name+" is: \n"+ ( 0.5* breadth * length));
        }else if(name.equals("Triangle") && side3 != Integer.MIN_VALUE){
            double s = (double) (length + breadth+ side3) / 2;
            double area = Math.sqrt(s*(s-length)*(s- breadth)* (s- side3));
            System.out.println(String.format("The area of the "+name+" is:\n%.2f ", area));
        }
    }
}
