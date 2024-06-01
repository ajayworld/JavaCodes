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

public void employeedetails()
{
System.out.println(ename);
System.out.println(dno);
System.out.println(salary);

}
public static void main( String[] args)
{
Employe m1=new Employe();
Employe m2=new Employe("Ajay");
Employe m3=new Employe("Vipul",123);
Employe m4=new Employe("Ajit",123,3331234);
m1.employeedetails();
m2.employeedetails();
m3.employeedetails();
m4.employeedetails();

}
}


