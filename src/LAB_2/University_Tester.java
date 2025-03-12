//task1
package LAB_2;

public class University_Tester {
    public static void main(String[] args) {
        University var1 = new University();
        University var2 = new University();

        System.out.println();
        System.out.println("Location of first object: "+ var1);
        System.out.println("Location of second object: "+ var2+"\n");


        System.out.println("The location of the objects are not same"+"\n");


        System.out.println("Instance variables of the first object are: ");
        System.out.println(var1.name);
        System.out.println(var1.country+"\n");

        System.out.println("Instance variables of the second object are: ");
        System.out.println(var2.name);
        System.out.println(var2.country+"\n");

        System.out.println("Changing  instance variables of the first object");
        var1.name = "Imperial College London";
        var1.country = "England";
        System.out.println(var1.name);
        System.out.println(var1.country+"\n");


        System.out.println("Changing  instance variables of the first object");
        var2.name = "BRAC University";
        var2.country = "Bangladesh";
        System.out.println(var2.name);
        System.out.println(var2.country);





    }
}
