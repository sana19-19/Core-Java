class nonstaticmethod3 
{   char a = 'x';
}
class demo
{
	void m1()
	{
		System.out.println("Inside m1");
	}
}
class sample
{
	public static void main(String[] args) 
	{
		nonstaticmethod3 obj = new nonstaticmethod3();
		System.out.println(obj.a);
		demo obj1 = new demo();
		obj1.m1();
	}
}
