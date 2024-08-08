class ic
{
	int i = 7;
	void m1()
	{
		System.out.println(i);
		ic2 i2 = new ic2();
		System.out.println(i2.s);
	}
	class ic2
	{
		void m2()
		{
			float s=7.7f;
		}
	}
}
class Innerclass
{
	public static void main(String[] args)
	{
		ic i1 = new ic();
		i1.m1();
	}
}
/*class ic
{
	int var1 = 7;
	void m1()
	{
		System.out.println(var1);
		//m2();------> error
	}
	class ic2
	{
		int var2 = 77;
		void m2()
		{
			System.out.println(var2);
			//m1();
		}
	}
}
class InnerClass
{
	public static void main(String[] args)
	{
		new ic().new ic2().m2();
		ic i = new ic();
		i.m1();
	}
}*/

/*
class ic
{
	private int var1 =7;
	private float var2 =7.7f;
	class ic2
	{
		void m1()
		{
			System.out.println(var1+var2);
		}
	}
}
class InnerClass
{
	public static void main(String[] args)
	{
		System.out.println("Hello Sun");
		ic i = new ic();
		new ic().new ic2().m1();
	}
}*/

/*class ic
{
	int i = 7;
	class ic2
	{
		void m1()
		{
			System.out.println("inside m1 method");
			System.out.println(i);
		}
	}
}
class InnerClass
{
	public static void main(String[] args)
	{
		ic ii = new ic();
		System.out.println(ii.i);
		new ic().new ic2().m1();
	}
}*/

/*class parse
{
	public static void main(String[] args)
	{
		String str1 ="10";
		String str2 = "20";
		int i = Integer.parseInt(str1);
		int s = Integer.parseInt(str2);
		System.out.println(str1+str2);
		System.out.println(i+s);
	}
}*/

/*class ToString
{
	public static void main(String[] args)
	{
		Integer i = new Integer(7);
		int ii = i.intValue();
		System.out.println(i);
		System.out.println(i.toString());
		System.out.println(ii);
		//System.out.println(ii.toString());

	}
}*/

/*class ToString
{
	public static void main(String[] args)
	{
		Integer i = Integer.valueOf(7);
		System.out.println(i);
		System.out.println(i.toString());
	}
}*/

/*class st
{
	void m1()
	{
		System.out.println("Hi world!");
	}
}
class ToString 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		st s = new st();
		s.m1();
		System.out.println(s.toString());
	}
}*/

/*
class ToString
{
	public static void main(String[] args)
	{
		Integer i = new Integer(7);
		System.out.println(i);
		System.out.println(i.toString());
	}
}*/

