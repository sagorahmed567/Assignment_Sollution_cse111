package LAB_2;

public class ChickenBurger {
    public String bun = "Sesame";
    public int price = 200;
    public String sauceOption = "Less";
    public String spiceLevel;

    public String[] validSpiceArray = {"Mild","Spicy","Naga","Extreme"};


    public void customizeSpiceLevel(String level){
        boolean flag = false;
        for(int i = 0; i < validSpiceArray.length; i++){
            if(validSpiceArray[i].equals(level)){
                flag = true;
                this.spiceLevel = level;
                break;
            }
        }

        if(flag){
            System.out.println("Spice level set to "+level);
        }
        else{
            System.out.println("This spice level is unavailable.");

        }
    }


    public String serveBurger(){
        if(spiceLevel == null){
            return "Cannot serve now. Customize Spice Level first.";
        }

        return "The burger is being served:-\nBun Type: "+
                this.bun+"\nPrice: "+this.price+"\nSauce Option: "+
                sauceOption+"\nSpice Level: "+spiceLevel
                ;
    }
}
