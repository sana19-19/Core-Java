class poly1
{
	void m1(int a,float b)
	{
		System.out.println(a+b);
	}
	void m1()
	{
		System.out.println(0+20+"Cyber"+30+40);
	}
	public static void main(String[] args)
	{
		System.out.println("Hello Shubh");
		poly1 p1 = new poly1();
		p1.m1();
		p1.m1(7,7.7f);
	}
}
/*class poly1
{
	poly1()
	{
		System.out.println("Inside 0 arg const");
	}
	poly1(int a)
	{
		System.out.println("Inside 1 arg const");
	}
	poly1(int a ,float b)
	{
		System.out.println("Inside 2 arg const");
	}
	public static void main(String[] arg)
	{
		System.out.println("Hello Sana");
	    new poly1(7,7.7f);
		//p1.poly1();
		//p1.poly1(7);
		//p1.poly1(7,7.7f);
	}
}*/

/*class flipcart
{
	void payment(int card)
	{
		System.out.println("Card option");
	}
	void payment(String UPI)
	{
		System.out.println("UPI option");
	}
	void payment(float cash)
	{
		System.out.println("Cash option");
	}
}
class poly
{
	public static void main(String[] args)
	{
		System.out.println("hello shubh");
		flipcart f1 = new flipcart();
		f1.payment(5000);
		f1.payment("Sana@7777");
		f1.payment(5000.5f);
	}
}*/

/*class poly1
{
	void m1()
	{
		System.out.println("Inside m1 method");
	}
	void m1(int a)
	{
		System.out.println("Inside m1 method " +a);
	}
	void m1(int a , float b)
	{
		System.out.println("Inside m1 method " +a);
		System.out.println("Inside m1 method " +b);
	}
	public static void main(String[] args)
	{
		System.out.println("Hello shubh");
		poly1 p1 = new poly1();
		p1.m1();
		p1.m1(7);
		p1.m1(7,7.7f);
	}
}*/

/*class poly1
{
	void m1(int a)
	{
		System.out.println("Inside m1 method "+a);
	}
}
class poly2 extends poly1
{
	void m1(float b)
	{
		System.out.println("Inside m1 method "+b);
	}
}
class poly
{
	public static void main(String[] args)
	{
		System.out.println("Hello Shubh");
		poly2 p2 = new poly2();
		p2.m1(7.7f);
	}
}*/

/*class poly1
{
	void m1()
	{
		System.out.println("Inside m1 method - poly1");
	}
}
class poly2 extends poly1
{
	void m1(int a)
	{
		System.out.println("Inside m1 method - poly2");
	}
}
class Poly
{
	public static void main(String[] args)
	{
		System.out.println("Hello Sana");
		poly2 p1 = new poly2();
		p1.m1(7);
	}
}*/