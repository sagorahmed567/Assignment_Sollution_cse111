package LAB_2;

public class MobilePhone {

    public int contact_capacity;
    public int contact_count = 0;
    public String[] name;
    public int[] contact_number;

    public void setContactCapacity(int n){
        this.contact_capacity = n;
        this.name = new String[n];
        this.contact_number = new int[n];

    }

    public void addContact(String s1, int n){
        if(contact_count < contact_capacity){
            this.name[contact_count] = s1;
            this.contact_number[contact_count] = n;
            contact_count+=1;;
            System.out.println("The contact of "+s1+" is added");
        }
        else{
            System.out.println("Storage Full!");
        }

    }
    public void makeCall(int n){
        for(int i = 0; i < contact_count; i++ ){
            if(contact_number[i] == n){
                System.out.println("Calling "+ name[i]);
            }
        }
    }

    public void details(){
        System.out.println("Totatl Contacts: "+ contact_count+"\nContact List: ");
        for(int i = 0; i < contact_count; i++ ){
            System.out.println(name[i]+":"+contact_number[i]);

        }

    }
}
