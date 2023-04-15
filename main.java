import java.util.*; // this is not necessary
abstract class abs
{
	abstract void method();	
}
 class parent extends abs
{
	private int a;
	public void setter(int ab)
	{
		a=ab;
		
	}
	public int  getter()
	{
		return a;
	}
	public void method()
	{
		System.out.println(a+"  Hi");
	}
	
	protected void meth1()
	{
		System.out.println("PArent meth1");
	}
}

 class child extends parent
{
	protected  void meth1()
	{
		System.out.println("Child meth2");
	}
	public void add(int a,int b)
	{
		System.out.println(a+b);
	}
	public void add(double a,double b,int c)
	{
		System.out.println(a+b+c);
	}
}
public class main
{
	public static void main(String[] args)
	{
		child c1=new child();
		c1.meth1();
		c1.add(10,10);
		c1.add(10,10.5,6);
		c1.setter(10);
		c1.getter();
		c1.method();		

	}
}



	
