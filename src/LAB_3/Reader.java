package LAB_3;

public class Reader {
    public int capacity = 0;
    public int book_count = 0;
    public String name = "New user";
    public String[] st_arr;
    public String createReader(String s, int n){
        st_arr = new String[n];
        this.capacity = n;
        this.name = s;
        return "A new reader is created!";
    }

    public void addBook(String s){
        if(book_count < capacity){
            st_arr[book_count] = s;
            book_count++;
        }else{
            System.out.println("No more capacity");
        }
    }

    public void readerInfo(){
        System.out.println("Name: "+name+"\nCapacity: "+capacity);
        System.out.println("Books:");
        for (int i = 0; i < st_arr.length; i++) {
            System.out.println("Book "+(i+1)+":"+st_arr[i]);


        }
    }

}
