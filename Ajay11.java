class Ajay11
{
public static void main(String[] args)
{
m1(2);
m2(2,12.1f);
m3(true,12.7f,380.67);
m4(2,6,7.1f,567.787);
m5(2,87685887l,34.7f,324.87,'A',"Ajay");
}
public static void m1(int a)
{
System.out.println(a);

}

public static void m2(int a,float b)
{
System.out.println(a);
System.out.println(b);
System.out.println(a+b);


}

public static void m3(boolean a,float b,double c)
{
System.out.println(a);
System.out.println(b);
System.out.println(c);

}
public static void m4(int a,int b, float c,double d)
{
System.out.println(a);
System.out.println(b);
System.out.println(c);
System.out.println(d);
}
public static void m5(int a,long b,float c,double d,char e, String f)
{
System.out.println(a);
System.out.println(b);
System.out.println(c);
System.out.println(d);
}
}