class demo
{
	int a =7;
	void m1()
	{
		System.out.println(a);
	}
}
class sample extends demo
{
	float b = 7.7f;
	void m2()
	{
		System.out.println(b);
	}
}
class cyber
{
	void test(demo d1)
	{
		System.out.println("test");
		d1.m1();
		sample s1 = (sample)d1;
		s1.m1();
		s1.m2();
	}
}
class exam26
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		cyber c = new cyber();
		c.test(new sample());
	}
}
