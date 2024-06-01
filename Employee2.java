class Employe
{
String ename;
int dno;
double salary;
public Employe()
{
System.out.println("Acc created");
}
public Employe(String ename)
{
this.ename=ename;
System.out.println("taking only name");
}
public Employe( String ename, int id)
{
this.ename=ename;
this.dno=dno;
System.out.println("taking only name and id");
}
public Employe(String ename , double id, double salary)
{
this.ename=ename;
this.dno=dno;
this.salary=salary;
System.out.println("taking only name and id and cno");
}

public void pd()
{
System.out.println(name);
System.out.println(dno);
System.out.println(salary);

}
public static void main( String[] args)
{
Employee m1=new Employe();
Employee m2=new Employe("Ajay");
Employee m3=new Employe("Vipul","adc");
Employee m4=new Employe("Ajit","adc",1234);
m1.pd();
m2.pd();
m3.pd();
m4.pd();

}
}


