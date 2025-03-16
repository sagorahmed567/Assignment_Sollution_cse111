package LAB_3;
//Ungraded Task

public class MoneyTracker {
    public String name = null;
    public double balance = 0.0;
    //public double total = 0.0;
    public double addBalance;
    public double spent;
    public void createTracker(String s){
        this.name = s;
        this.balance = 1.0;
    }
    public String info(){
        return "Name: "+name+"\nCurrent Balance: "+balance;
    }

    public void income(int x){
        System.out.println("balance Updated!");
        balance += x;
        addBalance = x;
    }


    public void expense(double expense){
        if(balance < expense ){
            System.out.println("Not enough balance");
        }else if(balance - expense == 0.0){
            System.out.println("you're Broke.");
        }else{
            System.out.println("Balance Updated!");
            balance -= expense;
            spent = expense;
        }
    }

    public void showHistory(){
        System.out.println("Last added: "+addBalance+"\nLast spent "+spent);
    }
}
