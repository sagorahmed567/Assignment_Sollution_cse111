package LAB_3;

public class Library {
    public int max_capacity;
    public int total = 0;
    String[] book_arr ;
    public void setBookCapacity(int n){
        this.max_capacity = n;
        this.book_arr = new String[max_capacity];
    }
    public void addBook(String s){
        if(this.total < this.max_capacity){
            System.out.println("Book "+ "'" +s+"'"+" added to the library");
            book_arr[total] = s;
            this.total+=1;

        }
        else{
            System.out.println("Exceeds maximum capacity. You can't add more than "+ max_capacity+"books");
        }
    }
    public void printDetail(){
        System.out.println("Maximum capacity: "+ max_capacity);
        System.out.println("Total Books: "+total);
        System.out.println("Book List: ");
        for (int i = 0; i < this.total; i++) {
            System.out.println(book_arr[i]);
        }
    }

}
