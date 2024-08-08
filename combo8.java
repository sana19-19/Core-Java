class combo8 
{   int a = 7;
	void m1()
	{
		System.out.println("Hello World!");	
	}
}
class demo
{
    public static void main(String[]args)
	{   System.out.println("Start");
		demo obj=new demo();
		obj.method();
		System.out.println("Stop");
	}
	void method()
	{
		System.out.println("Inside method");
		combo8 obj = new combo8();
		obj.m1();
		System.out.println(obj.a);
	}
}
