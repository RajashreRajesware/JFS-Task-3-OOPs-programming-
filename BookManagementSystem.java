package oops3;
import java.util.Scanner;
public class BookManagementSystem {
    public static void main(String[] args) {
        Library lib=new Library();
        Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Add Book\n2. Remove Book\n3.Display  Books\n4. Exit");
            System.out.print("Enter option: ");
            int option = sc.nextInt();


            switch (option) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();
                    System.out.print("Is Available (true/false): ");
                    boolean isAvailable = sc.nextBoolean();
                    lib.addBook(new Book(id, title, author, isAvailable));
                    break;

                case 2:
                    System.out.print("Enter Book ID to remove: ");
                    int removeId = sc.nextInt();
                    lib.removeBook(removeId);
                    break;



                case 3:
                    lib.displayBooks();
                    break;

                case 4:
                    System.out.println("Exiting system...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}

