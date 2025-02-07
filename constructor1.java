class 
{
}
/* Example7 ---> If we don't create any constructor then the compiler will create a default 0 argument empty implementation constructor.
class constructor1
{
	
	public static void main(String[] args)
	{
		System.out.println("Hello Sana");
	}
}*/

/* Example5 ---> Within java program class we can create minimum one constructor or we can create multiple constructor.
class constructor1
{
	constructor1()
	{
		System.out.println("Inside constructor 1");
	}
	constructor1(int a)
	{
		System.out.println("Inside const 1 "+a);
	}
	
	public static void main(String[] args)
	{
		System.out.println("Hello Sana");
		constructor1 b1 = new constructor1();
        constructor1 b2 = new constructor1(7);
	}
}*/

/* Example6 ---> How many times will a constructor will get exicuted?
------> Based on the number of time we used new keyword or based on the number of time we create object that many times the constuctor will get exicuted.
class constructor1
{
	constructor1()
	{
		System.out.println("Inside const");
		//return constructor1();
	}
	public static void main(String[] args)
	{
		System.out.println("Hello Sana");
		constructor1 b1 = new constructor1();
		constructor1 b2 = new constructor1();
		constructor1 b3 = new constructor1();
	}
}*/

/*Example8 ---> In java class e can't create duplicate constructor.
class constructor1
{
	constructor1()
	{
		System.out.println("Inside const1");
	}
    constructor1()
	{
		System.out.println("Inside const2");
	}
	constructor1()
	{
		System.out.println("Inside const3");
	}
	public static void main(String[]args)
	{
		System.out.println("Hello world!");
		constructor1 obj = new constructuor1();
	}
}*/

/*Example4 -----> How does the constructor know that the control has to be return from constructor?
------>With the help of return statement.If we didn't add return statement then by default compiler add return statement during compiler execution time.
class constructor1
{
	constructor1()
	{
		System.out.println("Inside const1");
	}
	public static void main(String[] args)
	{
		System.out.println("Hello Sana");
		constructor1 obj = new constructor1();
	}
}*/

/*Example3 --- Whichever class obj we create that class constructor will be invoked or called.
class constructor1
{
	constructor1()
	{
		System.out.println("Inside const");
	}
	public static void main(String[]args)
	{
		System.out.println("Hello Sana");
		constructor1 obj = new constructor1();
	}
}*/

/* Example1 --- The constructor name should be same as class name.
Constructor can accept the arguments.
Constructor don't have return type.
class constructor1
{
	constructor1()
	{
		
	}
}*/

/*Example2 --- The constructor only will executed when we create an object.
class constructor1 
{
	constructor1()
	{
		System.out.println("Inside const1");
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}*/