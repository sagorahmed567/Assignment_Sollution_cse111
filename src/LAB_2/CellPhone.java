//task7

package LAB_2;

public class CellPhone {
    public  String model = "Unknown";
    public int contact_count;
    public String[] contact_arr = new String[3];

    public void printDetails(){
        System.out.println("Phone Model: "+model);
        System.out.println("Contact Stored: "+contact_count);
        if(contact_count > 0){
            //Array print kora lagbe
            System.out.println("Stored Contacts.");
            for (int i = 0; i < contact_count ; i++) {
                System.out.println(contact_arr[i]);
            }
        }
    }


    public void storeContact(String p){
        if(contact_count < 3){ // we can store in Array
            System.out.println("Contact Stored");
            contact_arr[ contact_count] = p;
            contact_count++;

          //  contact_arr[ contact_count++] = p;




        }else{   // We can't store in array
            System.out.println("Memory full. New contact can't be stored.");
        }
    }

}
