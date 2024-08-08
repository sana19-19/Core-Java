class objcreate1
{
	int a = 7;
	void test()
	{
		System.out.println("Inside test method");
	}
	static objcreate1 m1()
	{
		System.out.println("Inside m1 method");
		return new objcreate1();
	}
	public static void main(String[] args)
	{
		objcreate1 ss = m1();
		ss.test();
	}
}
/*class objcreate1 
{
	int a=7;
	static void m1(objcreate1 dd)
	{
		System.out.println("Inside m1 method");
		System.out.println(dd.a);
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		objcreate1 dd = new objcreate1();
		System.out.println(dd.a);
		m1(new objcreate1());
	}
}
*/