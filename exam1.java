class exam1
{
	int a;
	{
		System.out.println("Inside non-static 1 block " +a);
	    a=10;
	}
	{
		System.out.println("Inside non-staic 2 block " +a);
		a=100;
	}
	exam1()
	{
		System.out.println("Inside const 0 arg " +a);
	}
	exam1(int a)
	{
		this();
		System.out.println("Inside const 0 arg " +a);
		a=200;
	}
	public static void main(String[] args)
	{
		System.out.println("Hello Sana");
		exam1 obj = new exam1();
		exam1 obj1 = new exam1(7);
	}
}
/*example5 ---> Rule is before execution compiler checks the is there in non static block is present or not and if there is a nonstatic block then it will execute all non static blocks from top to bottom then the controller will goes to constructor.
class exam1
{
	{
		System.out.println("Inside non-static block 1");
	}
	{
		System.out.println("Inside non-static block 2");
	}
	{
		System.out.println("Inside non-static block 3");
	}
	exam1()
	{
		System.out.println("Inside 0 arg block");
	}
	public static void main(String[] agrs)
	{
		System.out.println("Hello Sana");
		exam1 obj = new exam1();
	}
}
*/

/*example4 ---> Non-static blocks & costructors both are executed during object creation in that which one is get executed first?
-----> The non-staic block will get executed first,then the control goes to the constructor.
class exam1
{	exam1()
	{
		System.out.println("Inside 0 arg");
	}

	{
		System.out.println("Inside non-static block");
	}	
	public static void main(String[] args)
	{
		System.out.println("Hello Sana");
		exam1 obj = new exam1();
	}
}
*/

/*example3 ---> If a class contains an instance block / non static block how many times will it get executed?
-----> It depends upon the number of object creation or based on number of new keyword we create in a respective class that many times the nonstatic blocks are executed.
class exam1
{
	{
		System.out.println("Inside non-static block - 1");
	}
	{
		System.out.println("Inside non-static block - 2");
	}
	public static void main(String[] args)
	{
		System.out.println("Hello Sana");
		exam1 obj1 = new exam1();
		exam1 obj2 = new exam1();
		exam1 obj3 = new exam1();
	}
}
*/

/*example2 ---> Within a java class we not only create a single non-static block but also we can create multiple non-static blocks.Whenever there are multiple non-static blocks then the order of execution of these blocks will be from top to bottom.
class exam1
{
	{
		System.out.println("Inside non-static block - 1");
	}
	{
		System.out.println("Inside non-static block - 2");
	}
	{
		System.out.println("Inside non-static block - 3");
	}
	public static void main(String[] args)
	{
		System.out.println("Hello Sana");
		exam1 obj = new exam1();
	}
}*/

/*example1 ---> When exactly are non-static blocks are exicuted?
------> During object creation.
class exam1
{
	{
		System.out.println("Inside non static blolck");
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		exam1 obj = new exam1();
	}
}
*/
