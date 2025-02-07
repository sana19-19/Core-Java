/*Example6 ---> Whenever static blocks are part of single the class loader will be responsible to load the static member of respective blocks ,however if ther is more than one class within a java program the jvm will never load all static members of all the classes.Only when the jvm is clear as well as aware to call other class member only then an exceplitly call will be given to class loader to load the static members in the memory.
class staticBlock
{
	static
	{
		System.out.println("Inside static  block");
	}
}
class sample
{
	static
	{
		System.out.println("Inside static sample block");
	}
	public static void main(String[] args)
	{
		System.out.println("Hello Sana");
		staticBlock obj = new staticBlock();
	}
}*/

/*Example4 ---> static blocks are executed only once during the class loading time. Nonstatic and constructor blocks execution is based on new keyword or object creation.
class staticBlock
{   static
	{
		System.out.println("Inside static block");
	}
	{
		System.out.println("Inside non static block");
	}
	staticBlock()
	{
		System.out.println("Inside constructor o arg");
	}
	public static void main(String[] args)
	{
		System.out.println("Hello Sana");
		staticBlock obj = new staticBlock();
		staticBlock obj1 = new staticBlock();
		staticBlock obj2 = new staticBlock();
	}
}*/

/*Example3 ---> static and non static block are combine.
class staticBlock
{
	static 
	{
		System.out.println("Iside static block");
	}
	{
		System.out.println("Inside non-static block");
	}
	public static void main(String[] args)
	{
		System.out.println("Hello Sana");
		staticBlock obj = new staticBlock();
	}
}
*/

/*Example2 ---> we can create one or multiple static blocks. the order of execution of the blocks are top to bottom.
class staticBlock
{
	static
	{
		System.out.println("Insdie static block-1");
	}
	static
	{
		System.out.println("Insdie static block-2");
	}
	static
	{
		System.out.println("Insdie static block-3");
	}
	public static void main(String[] args)
	{
		System.out.println("Hello Sana");
	}
}*/

/* Example1 ---> Q.when exactly static blocks are executed?
-----> during class loader time.Class loader is in built method or prefined class to execute static blocks,there is no need for object creation.
Static blocks-----> static
                    {Statements;
					}
class staticBlock 
{
    static 
	{
		System.out.println("Hello Sana");
	}
	public static void main(String[] args)
	{
		System.out.println("Hello Shubham");
	}
}
*/

/*When do we make a member static or non static in real time?
------> Whenever there is need to store the unique data go for the static blocks .However if the data is commom to all then we can go for non-static member.
*/