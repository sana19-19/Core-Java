/* Example 19 ---> we can't use this() without construcutor.	
class this1
{
	int a=7;
	void m1()
	{   this();
		System.out.println("Indise m1 method");
	}
	public static void main(String[] args)
	{
		System.out.println("Hello Sana");
        this1 obj = new this1();
		obj.m1();
	}
}*/

/*Example 14 ---> we can create mutliple constructor with multiple arguments.
class this1
{  int a;
	this1()
	{
		System.out.println("Inside 0 arg");
	}
	this1(int a)
	{
		System.out.println("Inside 1 arg");
	}
	this1(int a,float b)
	{
		//this();
		System.out.println("Iside 2 args");
	}
	public static void main(String[] args)
	{
		System.out.println("Hello Sana");
		this1 obj = new this1(7,7.7f);

	}
}*/

/*Example 16 ---> within a constructor we can use this() statement as well as this keyword.
class this1
{   int a;
    this1()
	{
		System.out.println("Inside 0 ars"+a);
	}
	this1(int a)
	{
		this();
		this.a=a;
		System.out.println("Inside 1 arg");
	}
	void m1()
	{
		System.out.println("Isnide m1 method "+a);
	}
	public static void main(String[] args)
	{
		System.out.println("hello Sana");
		this1 obj = new this1(7);
		obj.m1();
	}
}*/

/*Example15 ---> this statement is the first line of constructor.
class this1
{   int a=5;
   this1()
	{
		this(7);
		System.out.println("Inside 0 arguments");
		
	}
	 this1(int a)
	{
		 System.out.println("Inside 1 argument");
		System.out.println(this.a);
		System.out.println(a);
	}
	public static void main(String[] args)
	{
		System.out.println("Hello Sana");
		this1 obj = new this1();
	}
}*/

/* Example15  ----> this2.java:5: error: call to this must be first statement in constructor
                this();
                    ^
1 error
class this1 
{
	static int a=7;
	{
		this();
		System.out.println("Inside static method");
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
*/
 /* Example 18 ---> java doesn't support the recursive  constructor invocation.
class this1
{
	int a;
	{
		System.out.println("Inside non-static block 1"+a);
		int a = 10;
	}
	{
		System.out.println("Inside non-staic block 2"+a);
	}
	this1(int a)
	{
		this(9);
		System.out.println("Inside const 0 arg"+a);
	}
	public static void main(String[] args)
	{
		System.out.println("Hello Sana");
		this1 obj = new this1(7);
	}
}

