package LAB_4;

public class BracuBus {
    public String route;
    public int max_capacity = 2;
    public int passenger_count = 0;
    String[] passenger_arr = new String[max_capacity];

    public BracuBus(String route, int max_capacity){
        this.route = route;
        this.max_capacity = max_capacity;
    }
    public BracuBus(String route){
        this.route = route;
    }
    public void board(){

    }
    public void board(BracuStudent s1){
        if(s1.flag){
            if(this.route.equals(s1.address)){
                System.out.println(s1.name+" boarded the bus.");
                passenger_arr[passenger_count] = s1.name;
                passenger_count++;
                if(passenger_count == max_capacity){
                    System.out.println("Bus is Full!");
                }
            }else{
                System.out.println("You got on the wrong bus!");
            }
        }else{
            System.out.println("You don't have a buss pass!");
        }

    }
    public void board(BracuStudent s1, BracuStudent s2){
        BracuStudent[] arr = {s1,s2};
        for(BracuStudent s: arr) {
            if(s.flag){
                if(this.route.equals(s.address)){
                    System.out.println(s.name+" boarded the bus.");
                    passenger_arr[passenger_count] = s.name;
                    passenger_count++;
                    if(passenger_count == max_capacity){
                        System.out.println("Bus is Full!");
                        break;
                    }
                } else{
                    System.out.println("You got on the wrong bus!");
                }
            }else{
                System.out.println("You don't have a bus pass!");
            }

        }
    }

    public void showDetails(){
        System.out.println("Bus Route: "+ route );
        System.out.println("Passenger Count: "+ passenger_count + " (" +"Max: "+max_capacity+ ")" +"\nPassengers on Board :");
        for (int i = 0; i < passenger_count; i++) {
            System.out.print(passenger_arr[i]+" ");
        }
    }
}
