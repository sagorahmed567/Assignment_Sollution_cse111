package LAB_3;


public class Cart {
    public double discount  = 0.0;
    public int item_count = 0;
    public int max_item = 3;
    public int cart;
    public double total = 0.0;

    public String[] item = new String[max_item];
    public double[] price = new double[max_item];

    public void create_cart(int n){
        this.cart = n;
    }
    public void addItem(double n, String s){

        if(item_count < max_item){
            price[item_count] = n;
            item[item_count] = s;
            item_count+=1;
            System.out.println(s+" added to cart "+ cart+"\nYou have "+item_count+" item(s) in your cart now.");
            total += n;
        }
        else{
            System.out.println("You already have "+max_item+" item(s) in your cart now.");
        }
    }
    public void addItem(String s, double n){
        if(item_count < max_item){
            price[item_count] = n;
            item[item_count] = s;
            item_count+=1;
            System.out.println(s+" added to cart "+ cart+"\nYou have "+item_count+" item(s) in your cart now.");
            total += n;
        }
        else{
            System.out.println("You already have "+max_item+" item(s) in your cart now.");
        }

    }
    public void giveDiscount(double n){
        discount = n;
        total -= total * (n/100);
    }
    public void cartDetails() {

            System.out.println("Your cart(c" + cart+")");
            for (int j = 0; j < item_count; j++) {
                System.out.println(item[j] + " - " + price[j]);
            }
            System.out.println("Discount applied: " + discount + "%");
            System.out.println("Total Price: " + total);


    }

}
