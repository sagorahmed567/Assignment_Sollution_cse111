package LAB_4;

public class Triangle {
    public int side1;
    public int side2;
    public int side3;

    public String s;
    public int perimeter;
    public Triangle(int n1, int n2, int n3){
        this.side1 = n1;
        this.side2 = n2;
        this.side3 = n3;
    }
    public void triangleDetails(){
        System.out.println("Three sides of the triangle are: "+side1+","+side2+","+side3);
        this.perimeter = side1+side2+side3;
        System.out.println("Perimeter: "+perimeter);
    }
    public String printTriangleType(){
        if(side1 == side2 && side1 == side3){
             s = "Equilateral";
        }else if(side1 == side2 || side1 == side3 || side2 == side3 ){
             s ="Isosceles";
        }
        else{
            s = "Scalene";
        }
        return "This is a "+s+" Triangle.";
    }
    public void compareTriangles(Triangle x){
       if(this == x) {
           System.out.println("These two triangle objects have the same address.");
       }else{
           if(this.side1 == x.side1 && this.side2 == x.side2 && this.side3 == x.side3){
               System.out.println("Addresses are different but the sides of the triangles are equal.");

           }else {
               if(this.perimeter == x.perimeter) {
                   System.out.println("Only the perimeter of both triangles is equal.");
               }else{
                   System.out.println("Addresses, length of the sides and perimeter all are different.");
               }
           }
       }
    }
}
