interface IT
{
	void it1();
	void it2();
	void it3();
}
class IT1 implements IT
{
	public void it1(){}
	public void it2(){}
	public void it3(){}
}
class IT2 extends IT1
{
	public void it1()
	{
		System.out.println("Inside m1 method");
	}
}
class Interface
{
	public static void main(String[] args)
	{
		IT2 i = new IT2();
		i.it1();
	}
}
/*
interface it1
{
	int a = 7;
}
interface it2
{
	int a = 77;
}
class Iterface implements it1,it2
{
	public static void main(String[] args)
	{
		System.out.println(it1.a);
		System.out.println(it2.a);
	}
}*/

/*non-static blocks are allowed inside the interface.
interface it
{
	default void m1()
	{
		System.out.println("Inside m1 method");
	}
}
class Interface implements it
{
	public static void main(String[] args)
	{
		Interface i = new Interface();
		i.m1();
	}
}*/

/*Static methods are allowed inside the interface.
interface it
{
	static void m1()
	{
		System.out.println("Inside m1 method");
	}
}
class Interface
{
	public static void main(String[] arg)
	{
		it.m1();
	}
}*/

/*interface it1
{
	void m1();
}
class Interface implements it1
{
	static()
	{
		System.out.println("Inside m1 method");
	}
	public static void main(String[] args)
	{
		System.out.println("Hello Sana");
		Interface i = new Interface();
		i.m1();
	}
}*/

/*We can access the variables within interface.Variables are the part of interface.
interface it1
{
	int a=7;
}
class Interface implements it1
{
	static void m1()
	{
		System.out.println(a);
	}
	public static void main(String[] args)
	{
		System.out.println("Hello Sana");
		Interface i = new Interface();
		i.m1();
	}
}*/

/*We can create interface within a class.
class it
{
	interface it1
	{
		void m1();
	}
}
class Interface implements it.it1
{
	public void m1()
	{
		System.out.println("Inside m1 method");
	}
	public static void main(String[] args)
	{
		System.out.println("Hello Sana");
		Interface i = new Interface();
		i.m1();
	}
}*/

/*
interface it1
{
	interface it2
	{
		void m1();
	}
}
class Interface implements it1.it2
{
	public void m1()
	{
		System.out.println("Inside m1 method");
	}
	public static void main(String[] args)
	{
		System.out.println("Hello Sana");
		Interface i = new Interface();
		i.m1();
	}
}*/

/*At a single time a class can extends another class and implememts multiple inteface.
While implemented class and interfaces as same time we have to first use extends then we can use implement however the opposite and viceversa is not applicable.
interface it1
{
	void m1();
}
interface it2
{
	void m2();
}
class it3
{
	void m3()
	{
		System.out.println("Inside m3 method");
	}
}
class Interface extends it3 implements it2,it1
//class Interface implements it3 extends it2,it1
{
	public void m1(){ System.out.println("inside m1 method"); }
	public void m2(){ System.out.println("inside m2 method"); }
	//public void m3(){ System.out.println("inside m3 method"); }
	public static void main(String[] args)
	{		
		System.out.println("Hello Sana");
		Interface i = new Interface();
		i.m1();
		i.m2();
		i.m3();
	}
}*/

/*cyclic inheritance is not supported by java at interface level.
interface it1 extends it2
{
	void m1();
}
interface it2 extends it1
{
	void m2();
}
class Interface
{
	public static void main(String[] args)
	{
		System.out.println("Hello Sana");
		it1 i = new it2();
		i.m1();
		i.m2();
	}
}*/

/*cyclic inheritance is not supported by java at class level.
class it1 extends it2
{
	void m1()
	{
		System.out.println("inside m1");
	}
}
class it2 extends it1
{
	void m2()
	{
		System.out.println("inside m2");
	}
}
class Inheritance
{
	public static void main(String[] args)
	{
		System.out.println("Hello Sana");
		it1 i = new it2();
		i.m1();
		i.m2();
	}
}*/

/*
class c1
{
	void m1()
	{
		System.out.println("Inisde m1 method");
	}
}
class c3 
{
	void m3()
	{
		System.out.println("Inside m3 method");
	}
}
class c2 extends c1,c3
{
	void m2()
	{
		System.out.println("Inside m2 method");
	}
}
class Inheritance
{
	public static void main(String[] args)
	{
		System.out.println("Hello Sana");
		c2 c = new c2();
		c.m1();
		c.m2();
	}
}*/

/*
interface IciciBankAc
{
	void bankAc();
}
interface Loans
{
	void loans();
}
class customer1 implements IciciBankAc
{
	public void bankAc()
	{
		System.out.println("Create your account");
	}
}
class customer2 implements Loans
{
	public void loans()
	{
		System.out.println("Loans");
	}
}
class Interface
{
	public static void main(String[] args)
	{
		System.out.println("Hello Sana");
		IciciBankAc i = new customer1();
		i.bankAc();
		Loans e = new customer2();
		e.loans();
	}
}*/

/*
interface HdfcBankAc
{
	void bankAc();
}
interface bankLoan extends HdfcBankAc
{
	void bankLoan();
}
class Interface implements bankLoan
{
	public void bankAc()
	{
		System.out.println("bank account");
	}
	public void bankLoan()
	{
		System.out.println("bank loan");
	}
	public static void main(String[] args)
	{
		System.out.println("Hello Sana");
		Interface i = new Interface();
		i.bankAc();
		i.bankLoan();
	}
}*/

/*we can not create an obj of abstract class similarly we can't create an object of an interface.We can't create an object of an interface however we can definately store the address of an object
within an referance variable and that referance variable can either be a type of abstract class or interface.
interface IT1
{
	void m1();
}
class Interface implements IT1
{
    public void m1()
	{
		System.out.println("Inisde m1 method");
	}
	public static void main(String[] args)
	{
		System.out.println("Hello Sana");
		IT1 i = new IT1();
		i.m1();
	}
}*/

/*Whenever we compile a abstract class or interface class in both cases it will generate the .class file .
If a method is declare within the interface then by default by nature every method within an interface declare as public as well as abstract.
interface IT1
{
	void m1();
}
interface IT2 extends IT1
{
	void m2();
}
class Interface implements IT2
{
	public void m1()
	{
		System.out.println("Inside m1 method");
	}
	public void m2()
	{
		System.out.println("Inside m2 method");
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Interface i = new Interface();
		i.m2();
		i.m1();
	}
}*/
