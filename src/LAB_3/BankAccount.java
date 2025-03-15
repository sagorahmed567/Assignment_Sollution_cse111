package LAB_3;

public class BankAccount {
    public int ac_No = 0;
    public String type = "Not Set.";


    public void setInfo(int n, String s){
        this.ac_No = n;
        this.type = s;
        System.out.println("Account information updated.");
    }
    public String printDetails(){
        return "Account no: "+ac_No+"\nType: "+ type;
    }

}
