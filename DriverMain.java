package SecondTask;
import java.util.Scanner;
public class DriverMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        DriverMain dm=new DriverMain();
        System.out.println("Employee Id:");
        int eId=sc.nextInt();
        sc.nextLine();
        System.out.println("Employee name:");
        String name=sc.next();
        System.out.print("Employee Salary: ");
        double salary = sc.nextDouble();
        System.out.print("Product ID: ");
        int pId = sc.nextInt();
        System.out.print("Product Price: ");
        double price = sc.nextDouble();
        System.out.print("Enter Product Quantity: ");
        int quantity = sc.nextInt();

        Employee e=new Employee(eId,name,salary);
        Product p=new Product(pId,price,quantity);
        e.calcTax();
        p.calcTax();
    }
}
