package SecondTask;

public class Product implements Taxable{
    int pId;
    double price;
    int quantity;

    Product(int pId,double price,int quantity){
        this.pId=pId;
        this.price=price;
        this.quantity=quantity;
    }
    public void calcTax(){
        double tax=price * salesTax;
        System.out.println("Sales tax : "+tax);
    }
}
