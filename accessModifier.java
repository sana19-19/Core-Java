/*class aM1
{
	int a=100;
	void m1()
	{
		System.out.println("Inside m1 method - aM1 " +a);
	}
}
class aM2 extends aM1
{
	int a = 7;
	void m1()
	{
		System.out.println("Inside m1 method - aM2 "+b);
	}
}
class accessModifier
{
	public static void main(String[] args)
	{
		System.out.println("Hello Sana");
		aM1 ob = new aM2();
		ob.m1();
	}
}*/
class RBI
{ 
	final void active()
	{
		System.out.println("RBI 1%");
	}
	void personalloan()
	{
		System.out.println("RBI 8%");
	}
}
class HDFC extends RBI
{ 
	void personalloan()
	{
		System.out.println("HDFC 18%");
	}
    void active()
	{
		System.out.println("HDFC 12%");
	}
}
class ICICI extends RBI
{ 
	void personalloan()
	{
		System.out.println("ICICI 17%");
	}
}
class YES extends RBI
{ 
	void personalloan()
	{
		System.out.println("YES 15%");
	}
}
class accessModifier
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		RBI ob1 = new HDFC();
		ob1.personalloan();
		RBI ob2 = new ICICI();
		ob2.personalloan();
		RBI ob3 = new YES();
		ob3.personalloan();
	}
}
