package LAB_4;

public class Toy {
    public String  name;
    public int price;
    public Toy(String s, int n){
        this.name = s;
        this.price = n;
        System.out.println("A new toy has been made!");
    }
    public void updatePrice(int n){
        this.price = n;
    }
    public void updateName(String s){
        System.out.println("changing Old name: "+name);
        this.name = s;
        System.out.println("new name: "+name);
    }
    public void showPrice(){
        System.out.println("Price: "+price);
    }
}
