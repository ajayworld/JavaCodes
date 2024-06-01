import java.util.Scanner;
class Calculator{
private int res;
Calculator(int v1 ,int v2){
this.res=v1+v2;
}

Calculator(int v1 ,int v2,int v3){
this.res=v1*v2*v3;

}
public int cal(){
 return res;
}
public static void main(String [] args)
{
Scanner sc= new Scanner(System.in);
System.out.println("enter 2 number for addition :");
int v1=sc.nextInt();
int v2=sc.nextInt();
System.out.println("enter 3rd number for multiplation :");
int v3=sc.nextInt();
Calculator a1 = new Calculator(v1,v2);
Calculator a2 = new Calculator(v1,v2,v3);
System.out.println("Addition of 2number is ---->"+a1.cal());
System.out.println("multiplication of 3number is ---->" +v1+"*"+v2+"*"+v3+"="+a2.cal());

}
}