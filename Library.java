package oops3;
import java.util.ArrayList;
public class Library {
    private ArrayList<Book>books;
    public Library(){
        books=new ArrayList<>();
    }
    public void addBook(Book b){
        books.add(b);
        System.out.println("Book added");
    }
    public void removeBook(int bId){
        for(Book b : books){
            if(b.getBookId()==bId){
                books.remove(b);
                System.out.println("removed");
                return;
            }
        }
        System.out.println("Enter correct Book ID");
    }
    public void displayBooks(){
        if(books.isEmpty()){
            System.out.println("No Book!!!");
        }
        else {
            for(Book b:books){
                b.display();
            }

        }
    }
}
