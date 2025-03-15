package LAB_3;

public class Shelf {
    public int capacity = 0;
    public int book_count = 0;
    public void addBooks(int n){
        if(this.capacity == 0){
            System.out.println("Zero capacity. Cannot add books");
        }
        else if(this.book_count + n <= this.capacity){
            this.book_count+=n;
            System.out.println(n+" books added to shelf.");
        }
        else if(this.book_count + n > this.capacity){
            System.out.println("Exceeds capacity.");
        }
    }
    public void showDetails(){
        System.out.println("self capacity: "+ capacity);
        System.out.println("Number of books: "+ book_count);

    }
}
