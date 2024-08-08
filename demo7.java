class demo
{
	static sample refvar1;
}
class sample
{
	int a=100;
	void m1()
	{
		System.out.println("Inside m1 "+a);
	}
}
class nonpristatic
{
	public static void main(String[] args) 
	{
		demo.refvar1 = new sample();
		System.out.println(demo.refvar1.a);
		demo.refvar1.m1();
	}
}
