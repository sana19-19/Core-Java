interface demo
{
	void m1();
	void m2();
}
class Anony
{
	demo d = new demo()
	{
		public void m1(){System.out.println("Hi");}
		public void m2(){System.out.println("HIIIIIIIII");}
	};
	public static void main(String[] args)
	{
		Anony a = new Anony();
		a.d.m1();
		a.d.m2();
	}
}
/*abstract class sample
{  abstract void m1();
   abstract void m2();
}
class Anony 
{
	sample s = new sample()
	{
		void m1(){System.out.println("hi");}
		void m2(){System.out.println("HIII");}
	};
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Anony a = new Anony();
		a.s.m1();
		a.s.m2();
	}
}*/
