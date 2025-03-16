package LAB_3;

//ungraded


public class Customer {
    public String name;
    public int maxItem = 4;
    public int item_count = 0;

    public int price = 0;

     String[] item_arr = new String[maxItem];
     int[] price_arr = new int[maxItem];

    public void createCustomer(String name){
        this.name = name;


    }
    public void addItem(String item, int price){
         if(item_count < maxItem){
             System.out.println(item+" added to cart. ");
             item_arr[item_count] = item;
             price_arr[item_count] = price;
             item_count++;
         } else{
             System.out.println("Cart is full.");
         }
    }
    public void addItem(String item1, int price1, String item2, int price2){

       if(item_count < maxItem) {
           item_arr[item_count] = item1;
           price_arr[item_count] = price1;
           item_count += 1;
       }
        if(item_count < maxItem) {
            item_arr[item_count] = item2;
            price_arr[item_count] = price2;
            item_count += 1;

        }
        System.out.println(item1 + " and " + item2 + " added to cart");

    }


    public void calculatePrice(){
        for(int price:price_arr){
           this.price += price;
        }
        System.out.println("Total: "+price);
    }

    public void showCart(){
        System.out.println("Customer :"+name);
        for (int i = 0; i < item_count; i++) {
            System.out.println("Item: "+item_arr[i]+"   Price: "+price_arr[i]);
        }
    }


}
