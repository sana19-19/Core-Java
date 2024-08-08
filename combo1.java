class combo1 
{   static int a=7;
	{
		System.out.println("Hello World!");
	}
}

class combo2
{
	int b =5;
	public static void main(String[] args)
	{
		combo1 obj1 = new combo1();
		System.out.println(obj1.a);
		System.out.println(combo1.a);
	}
}
