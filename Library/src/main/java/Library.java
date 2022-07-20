import java.util.ArrayList;

public class Library {

    private ArrayList<Book>library;

    public Library(){
        this.library = new ArrayList<>(3);
    }

    public void addBook(Book book){
        if(checkIfFull()== "There is space"){
        this.library.add(book);}
    }
    public int bookCount() {
        return this.library.size();
    }

    public String checkIfFull() {
        if (bookCount() <= 3) {
            return "There is space";
        } else {
            return "Library is full";
        }

    }




}
