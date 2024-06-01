import java.util.Scanner;
class Const
{
private String name;
private int accno;
private double sal;
private double ta;
private double hr;
private double da;
double totalsal;
Scanner sc= new Scanner(System.in);

 Const(String name,int accno,double sal,double ta,double hr,double da){
this.name=name;
this.accno=accno;
this.sal=sal;
this.ta=ta;
this.hr=hr;
this.da=da;

}
public void salary(){
System.out.println("name of person is :"+ name + " And accno is " + accno+" "+ "sal is :"+"-->" +sal+""+ "ta is :" +ta+"-->"+ " hr is" +hr+"-->"+ "da is"+"-->"+da);
totalsal=ta+hr+da+sal;
System.out.println("total salary is : " +totalsal);
}
public static void main(String []args){
Scanner sc= new Scanner(System.in);
Const a1= new Const("ajay",123,3.22,3.9,43.1,53.0);
//Const a2= new Const(1.94,3.9,43.1,53.0);
//a1.printdetails();
a1.salary();
}
}