import java.util.Scanner;
class Account
{
public static void main(String [] args)
{
Scanner s=new Scanner(System.in);


System.out.println("name");
String name= s.next();
System.out.println("phn");
long phn= s.nextLong();
System.out.println("att");
boolean att= s.nextBoolean();
System.out.println("amo");
double amo= s.nextDouble();

System.out.println(name);
System.out.println(phn);
System.out.println(att);
System.out.println(amo);
}
}



