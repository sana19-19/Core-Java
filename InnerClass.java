class ic
{
	void m1()
	{
		ic1 i = new ic1();
		i.m1();
	}
	private class ic1
	{
		void m1()
		{
			System.out.println("Inside m1 method");
		}
	}
}
class InnerClass
{
	public static void main(String[] args)
	{
		System.out.println("Hello Hellow");
		new ic().m1();
	}
}
/*class ic
{
	int a = 7;
	float b = 7.7f;
	class ic1 extends ic
	{
		int a = 10;
		float b = 10.5f;
		void m1(int a,float b)
		{
			System.out.println("Inside m1 method");
			System.out.println(a+b);
			System.out.println(this.a+this.b);
			System.out.println(super.a+super.b);
		}
	}
}
class InnerClass
{
	public static void main(String[] args)
	{
		System.out.println("Hello hello");
		new ic().new ic1().m1(6,6.6f);
	}
}*/

/*class ic
{
	void m2()
	{
		//System.out.println(a+b);
		ic1 i = new ic1();
		System.out.println(i.a+i.b);
	}
	class ic1
	{
			private int a = 7;
			private float b = 7.7f;
	}
}
class InnerClass
{
	public static void main(String[] args)
	{
		System.out.println("Hello World");
		new ic().m2();
	}
}*/

/*class ic
{
	int a = 10;
	float b = 10.5f;
	class ic1
	{
		int a = 100;
		float b = 100.5f;
		void m1(int a,float b)
		{
			System.out.println("Inside m1 method");
			System.out.println(a+b);
			System.out.println(this.a+this.b);
			System.out.println(ic.this.a+ic.this.b);
		}
	}
}
class InnerClass
{
	public static void main(String[] args)
	{
		System.out.println("Hello World");
		new ic().new ic1().m1(1000,1000.5f);
	}
}*/

/*class ic
{
	private int a=7;
	class ic1
	{
		void m1()
		{
			System.out.println("Inside m1 method "+a);
		}
	}
}
class InnerClass
{
	public static void main(String[] args)
	{
		System.out.println("Hello World");
		new ic().new ic1().m1();
	}
}*/

/*class ic1
{
	void m2()
	{
		System.out.println("Inside m2 method");
	}
	class ic2
	{
		void m1()
		{
			System.out.println("Insdie m1 method");
			ic1 i = new ic1();
			i.m2();
		}
	}
}
class InnerClass
{
	public static void main(String[] args)
	{
		System.out.println("Hello Hello");
		new ic1().new ic2().m1();
	}
}*/

/*class in1
{	class in2
	{
		void m1()
		{
			System.out.println("Inside inner method");
		}
	}
}
class InnerClass 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		in1 i = new in1();
		in1.in2 i2 = i.new in2();
		i2.m1();
	}
}*/
