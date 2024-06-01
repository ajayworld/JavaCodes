import java.util.Scanner;
class Bank
{
private String name;
private int accno;
private double balance;
private double sal;
 double reduce;
private double deposite;
double totalsal;
Scanner sc = new Scanner(System.in);


Bank(String name,int accno,double balance,double sal,double deposite)
{
this.name=name;
this.accno=accno;
this.balance=balance;
this.sal=sal;
this.deposite=deposite;
 
}
Bank(double reduce){
this.reduce=reduce;
}

public void details()
{
System.out.println("enter name :");
name=sc.next();
System.out.println("enter acc no :");
accno=sc.nextInt();
System.out.println("balannce");
balance=sc.nextDouble();
System.out.println("sal of emp :");
sal=sc.nextDouble();
System.out.println("deposite");
deposite=sc.nextDouble();
totalsal=balance+sal+deposite;

System.out.println("Name of the person :" + name + ", Accno is :" +accno+ "  Account Balance is : " +balance+ " salary of the emp :" + sal+ " ammount is deposite :" +deposite);
System.out.println("total balance is" +totalsal);
}
public void afterreduce(){
System.out.println("reduce amount" + totalsal);
reduce=sc.nextDouble();

System.out.println("complete balance after traansection  is :"+  (totalsal-reduce));
}
public static void main(String args[]){
Bank a1= new Bank("ajay",123,124.553,235.44,45.3);
a1.details();
a1.afterreduce();
}

}
