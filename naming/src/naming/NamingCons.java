package naming;

 class NamingCons {
	
public static void main(String args[] )
{   Cons cs=new Cons();
	Naming n=new Naming(5,"priya");
}
 }
class Cons{
    int a,c;
    String name;
    Cons()
	{
	name="123";
	c=Integer.parseInt(name);
	System.out.println(c);
    	System.out.println("constructor");
    	
	}
    
	Cons(int a)
	{
		this.a=a;
		
	}
	
}
class Naming extends Cons{
	Naming(int a, String b)
	{
		super(a);
		System.out.println(a);
		System.out.println(b);
		int d=50;
		b=String.valueOf(d);
		System.out.println(b);
	
	}
}
