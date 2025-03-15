package LAB_3;

public class TaxiLagbe {
    public String taxi_num;
    public String area;
    public int max_seat = 4;
//    public int fare;
    public int passenger_count = 0;
    public int total_fare = 0;
    public String[] passenger_list = new String[4];

    public void storeInfo(String s1, String s2){
        this.taxi_num = s1;
        this.area = s2;
    }
    public void addPassenger(String name, int fare){
        if(passenger_count < max_seat ){
            System.out.println("Dear "+name+"! Welcome to TaxiLagbe.");
            this.total_fare += fare;
            passenger_list[passenger_count] = name;
            passenger_count++;

        }
        else{
            System.out.println("Dear "+name+"! Welcome to TaxiLagbe.\nTaxi Full! No more passengers can be added.");
        }
    }

    public void addPassenger(String name1, int fare1,String name2, int fare2){

        //this array will check the max seat limits for individual passengers
        String[] arr = {name1,name2};
        int[] arr1 = {fare1,fare2};

        for (int i = 0; i < 2; i++) {
            if(passenger_count < max_seat){
                System.out.println("Dear  "+arr[i]+"! Welcome to TaxiLagbe.");
                passenger_list[passenger_count] = arr[i];
                passenger_count+=1;
                if(arr[i].equals(name1)) {
                    this.total_fare += fare1;
                }else{
                    this.total_fare += fare2;
                }

            }
            else{
                System.out.println("Dear "+arr[i]+"! Welcome to TaxiLagbe.\n Taxi Full! No more Passengers can be added.");
                break;
            }
        }

    }

    public void printDetails(){
        System.out.println("Taxi number: "+taxi_num+"\nThis taxi can cover "+area+" area.\nTotal Passengers: "+passenger_count);
        System.out.println("Passenger Lists: ");
        for (int i = 0; i < passenger_count; i++) {
            System.out.println(passenger_list[i]);
        }
        System.out.println("Total collected fare: "+total_fare+" Tk");
    }
}
