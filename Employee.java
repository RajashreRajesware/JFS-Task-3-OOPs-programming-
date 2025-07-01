package SecondTask;
interface Taxable {
    double salesTax=0.07;
    double incomeTax=0.105;

    void calcTax();
}
public class Employee implements Taxable
{
    int eId;
    String name;
    double salary;
    Employee(int eId,String name,double salary){
        this.eId=eId;
        this.name=name;
        this.salary=salary;
    }
    public void calcTax(){
        double tax= salary*incomeTax;
        System.out.println("Income tax :"+tax);
    }

}
