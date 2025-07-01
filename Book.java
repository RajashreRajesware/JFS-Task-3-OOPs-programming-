package oops3;

public class Book {
    int bookId;
    String title;
    String author;
    Boolean isAvailable;

    public Book(int bookId, String title, String author,Boolean isAvailable){
        this.bookId=bookId;
        this.title=title;
        this.author=author;
        this.isAvailable=isAvailable;
    }
    public int getBookId(){
        return bookId;
    }
    public String getTitle(){
        return title;
    }

    public String getAuthor() {
        return author;
    }
    public boolean isAvailable(){
        return isAvailable;
    }

    public void setAvailable(Boolean available) {
        isAvailable = available;
    }
    public void setAvailable(boolean available) {
        isAvailable = available;
    }
    public void display(){
        System.out.println("BookID:"+bookId + ",Title:"+title +",author of the Book:"+author+",Availability of Book:"+isAvailable);

    }
}
