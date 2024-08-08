class nonstatic3 
{
	int a=100;
	static nonstatic3 ref;
	void m1()
	{
		System.out.println("Inside m1");
	}
}
class demo
{
	public static void main(String[] args) 
	{
		nonstatic3.ref=new nonstatic3();
		System.out.println(nonstatic3.ref.a);
		nonstatic3.ref.m1();
	}
}
