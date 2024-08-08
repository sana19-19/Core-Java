class san
{
	int a=7;
	void m1()
	{
		System.out.println("Inside m1");
	}
}
class com
{
	static int s=7;
	static s1 ss;
	static void s1()
	{
		System.out.println("Hello World");
	}
}
class s1
{
	static float b=7.7f;
	void m2()
	{
		System.out.println("Inside m2");
	}
	public static void main(String [] args)
	{
		System.out.println("Hello Jan");
		com d1 =new com();
		System.out.println(d1.s);
		System.out.println(com.s);
		d1.ss=new com();
	}
}