/*Within a abstract class we can create static blocks,non-static blocks,variables and constructors .*/
abstract class abs1
{
	abstract void m1();
	int a=0;
	static void m2()
	{
		System.out.println("Inside static block "); 
	}
	{
		System.out.println("Inisde non-static block "+a);
		a=77;
	}
	abs1()
	{
		System.out.println("Inside 0 arg const "+a);
		a=777;
	}
}
class abs extends abs1
{
	void m1()
	{
		System.out.println("Inside m1 method "+a);
	}
	public static void main(String[] args)
	{
		System.out.println("Hello Sana");
		abs a = new abs();
		a.m1();
	}
}
/*abstract class abs1
{
	int a = 7;
	abs1()
	{
		System.out.println("Inside 0 arg const "+a );
		a = 77;
	}
	abstract void m1();
}
class abs extends abs1
{
	void m1()
	{
		System.out.println("Inside m1 method "+a);
	}
	public static void main(String[] args)
	{
		System.out.println("Hello Sana");
		abs ab = new abs();
		ab.m1();
	}
}*/

/*constructors are allowed to be created in  abstract classes.
abstract class abs1
{
	abs1()
	{
		System.out.println("Inside 0 arg const");
	}
}
class abs extends abs1
{
	abs()
	{
		System.out.println("Inside 1 arg const");
	}
	public static void main(String[] args)
	{
		System.out.println("Hello Sana");
		new abs();
	}
}*/

/* If there is no member within the abstarct class then there is no need to implementation in child class.
abstract class abs1
{
}
class abs extends abs1
{
	public static void main(String[] args)
	{
		System.out.println("Hello Sana");
	}
}*/

/*abstract class HDFCBanking
{
	abstract void banking();
	abstract void eStatement();
    abstract void upi();
}
class HDFCServices extends HDFCBanking 
{
	void banking() { System.out.println("Inside banking"); }
	void eStatement() { System.out.println("Inside eStatement"); }
	void upi() { System.out.println("Inside upi"); }

	public static void main(String[] args)
	{
		System.out.println("Hello Sana");
		HDFCServices cust = new HDFCServices();
		cust.banking(); cust.eStatement(); cust.upi();
	}
}*/

/*static methods and main methods are allowed in abstract class.
abstract class abs 
{
	abstract void m1();
	public static void main(String[] args)
	{
		System.out.println("sana");
	}
}*/

/*even the abstract class allow the complete method but we still can not create an object of abstract class.
abstract class abs1
{
	abstract void m1();
	void m2()
	{
		System.out.println("Inside m2 method");
	}
}
class abs
{
	void m1()
	{
		System.out.println("Inisde m1 method");
	}
	void m3()
	{
		System.out.println("Inside m3 method");
	}
	public static void main(String[] args)
	{
		System.out.println("Hello Sana");
	    new abs1().m1();
	}
}*/

/*Abstract classes are not 100% abstract by nature as they allow the both complete and incomplete methods which are created in abstract method.
abstract class abs1
{
	abstract void m1();
	void m2()
	{
		System.out.println("Inside m2 method parent");
	}
}
class abs2 extends abs1
{
	void m1()
	{
		System.out.println("Inside m1 method child");
	}
	void m3()
	{
		System.out.println("Inside m3 method");
	}
}
class abs
{
	public static void main(String[] args)
	{
		System.out.println("Hello Sana");
		abs2 ab2 = new abs2();
		ab2.m1();
	}
}*/

/*If a child inherit the all parent abstract class and if a child class does not perform all the implementation either or one method or all method then the child class by nature will become abstract.
For a child class to become a normal class it is mondatory that all the child classses should implement the all the abstract methods coming from parent class.
abstract class abs1
{
	abstract void m1();
    abstract void m2();
    abstract void m3();
}
class abs2 extends abs1
{
	void m1()
	{
		System.out.println("Inside m1 method");
	}
	void m2()
	{
		System.out.println("Inside m2 method");
	}
	void m3()
	{
		System.out.println("Inside m3 method");
	}
}
class abs
{
	public static void main(String[] args)
	{
		System.out.println("Hello Sana");
		abs2 ab2 = new abs2();
		ab2.m1();
		ab2.m2();
		ab2.m3();
	}
}*/

/*abstract class abs1
{
	abstract void m1();
}
class abs2 extends abs1
{
	void m1()
	{
		System.out.println("Inside m1 method");
	}
}
class abs
{
	public static void main(String[] args)
	{
		System.out.println("Hello Sana");
		abs2 ab2 = new abs2();------> We can create an object of normal class
		ab2.m1();
		abs1 ab1 = new abs1();-------> we can not create an object of abstract class
		ab1.m1();
	}
}*/

/*To achieve abstraction minimum required two classes.Between the classes there should be a concept called inheritance.
To acheive the abstraction the re should be a implement the concept of overiding which is the part of polymorphism.
abstract class abs1
{
	abstract void m1();
}
class abs2 extends abs1
{
	void m1()
	{
		System.out.println("Inside m1 method");
	}
}
class abs
{
	public static void main(String[] args)
	{
		System.out.println("Hello Sana");
		abs2 ab = new abs2();
		ab.m1();
	}
}*/

/* Only by declarig a method without body will not make a method as abstract .To make method abstract we have to use keyword called as abstract.
If a class contains the abstract method then by default the class by nature becaome abstract.To declare the class abstract we need to use abstract prifix.
Whenever we compile the normal or abstract class it will generate the .class file.
class abs1
{
	void m1();
}
class abs
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		abs1 a1 = new abs1();
		a1.m1();
	}
}*/
