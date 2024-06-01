class Constover
{
private int value;
Constover (){
this.value=0;
}
Constover(int val)
{
this.value=val;
}
Constover(int val,int val1)
{
this.value=val+val1;
}
public int print(){
return value;
}
public static void main(String [] args){
Constover a1= new Constover();
Constover a2= new Constover(3);
Constover a3= new Constover(2,3 );
System.out.println("1st constructor :"+a1.print());
System.out.println("2st constructor :"+a2.print());
System.out.println("3st constructor :"+a3.print());
}
}