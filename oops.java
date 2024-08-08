class oops1
{
	void m1(int a)
}
/*Example 28 ---> static and non static blocks.
class oops1
{
	{
		System.out.println("Inisde non-static block -oops1");
	}
	static
	{
		System.out.println("Inisde static block - oops1");
	}
}
class oops2 extends oops1
{
	{
		System.out.println("Inisde non-static block -oops2");
	}
	static
	{
		System.out.println("Inisde static block - oops2");
	}
}
class oops
{
	public static void main(String[] args)
	{
		new oops2();
	}
}*/

/*Example 29--->static,non-static and const.
class oops1
{
	{
		System.out.println("Inside ono static block-oops1");
	}
	static 
	{
		System.out.println("Inside static block-oops1");
	}
	oops1()
	{
		System.out.println("Inside 0 arg const-oops1");
	}
}
class oops2 extends oops1
{
	{
		System.out.println("Inside ono static block-oops2");
	}
	static 
	{
		System.out.println("Inside static block-oops2");
	}
	oops2()
	{
		System.out.println("Inside 0 arg const-oops2");
	}

}
class oops
{
	public static void main(String[] args)
	{
		new oops2();
	}
}*/

/*Exxample 24 --->Parent without const child have 2 const and both have non-static blocks.
class oops1
{
	{
		System.out.println("Inside non-static block");
	}
}
class oops2 extends oops1
{
	{
		System.out.println("Inside non-static block---oops2");
	}
	oops2()
	{
		System.out.println("Inside 0 arg constructor");
	}
	oops2(int a)
	{
		System.out.println("Inisde 1 arg constructor");
	}
}
class oops
{
	public static void main(String[] args)
	{
		new oops2();
		new oops2(7);
	}
}*/

/*Example 23-->Without constructor with non static block.
class oops1
{
	void m1()
	{
		System.out.println("Inside m1 method");
	}
}
class oops2 extends oops1
{
	void m2()
	{
		System.out.println("Inside m2 method");
	}
}
class oops
{
	public static void main(String[] args)
	{
		new oops2();
	}
}*/

/*Example 22---> instance block + constructor
class oops1
{
	{
		System.out.println("Inside non-static block---oops1");
	}
	oops1()
	{
		System.out.println("Inside 0 arg const----oops1");
	}
}
class oops2 extends oops1
{
	{
		System.out.println("Inside non-static block----oops2");
	}
	oops2()
	{
		System.out.println("Inside 0 arg const---oops2");
	}
}
class oops
{
	public static void main(String[] args)
	{
		System.out.println("Hello Sana");
		new oops2();
	}
}*/

/*Example 20 ---> Constructors are never part of the inheritance because constructor name should same as the class name .if it doesn't get satisfied then it violet the rulenumber one of the constructor.
To ensure rule is not voileted constructor never be a part of inheritance.however due to the super statement the control will moves to the super class constructor and that is how parent class constructor will get executed.
class oops1
{
	oops1()
	{
		System.out.println("Inside 0 arg constructor ---oops1");
	}
}
class oops2 extends oops1
{
	oops2()
	{
		System.out.println("Inside 0 arg constructor---oops2");
	}
	oops1()
	{
		System.out.println("Inside 0 arg constructor ----oops2");
	}
}
class oops
{
	public static void main(String[] args)
	{
		System.out.println("Hello Sana");
		oops2 op2 = new oops2();
	}
}*/

/*Example 19 --->With the help one object we can call the multiple child constructors as well as parent constructor by using the this and super statement.
class oops1
{
	oops1()
	{
		System.out.println("Inside 0 arg const ---oops1");
	}
}
class oops2 extends oops1
{
	oops2()
	{
		this(7);
		System.out.println("Inside 0 arg const ---oops2");
	}
	oops2(int a)
	{
		super();
		System.out.println("Inside 1 arg const");
	}
}
class oops
{
	public static void main(String[] args)
	{
		oops2 op2 = new oops2();
	}
}*/

/*Example 18--->Regardless how many constructor have been creted in child class that many time the constructor will call the another contructor within the parent class.
class oops1
{
	oops1()
	{
		System.out.println("Inside 1 arg constructor-oops1");
	}
}
class oops2 extends oops1
{
	oops2()
	{
		System.out.println("Inside 0 age construcor-oops2");
	}
	oops2(int a)
	{
		System.out.println("Inisde 1 arg constructor "+a);
	}
}
class oops
{
	public static void main(String[] args)
	{
		System.out.println("Hello Sana");
		oops2 op2 = new oops2();
		oops2 op1 = new oops2(7);
	}
}*/

/*Example 17 ----> Whenever the compiler adds the super statement it will always responsible to call 0 arg constructor within th eparent class. Hence the above example is throwing an error.
class oops1
{
	oops1(int a)
	{
		System.out.println("Inside 1 arg const ---oops1");
	}
}
class oops2 extends oops1
{
	oops2()
	{
		System.out.println("Insdie 0 arg const");
	}
	oops2(int a)
	{
		System.out.println("Inside 1 arg const ---oops2");
	}
}
class oops
{
	public static void main(String[] args)
	{
		oops2 op2 = new oops2();
		oops2 oop2 = new oops2();
	}
}*/

/*Example 16----> if we didn't add the super statement the compiler will add the super statement during compilation time by default.
class oops1
{
	oops1()
	{
		System.out.println("Inside oops1 0 arg const");
	}
}
class oops2 extends oops1
{
	oops2()
	{
		System.out.println("Inside oops2 0 arg const");
	}
}
class oops
{
	public static void main(String[] args)
	{
		System.out.println("hello Sana");
		oops2 op2 = new oops2();
	}
}*/

/*Example 15-----> Constructor ---> The super statement is ude s to call the constructor within hte super class . the super statement is only applicable under the concept of inheritance.
class oops1
{
	oops1()
	{
		System.out.println("Inside oops1 0 arg const");
	}
}
class oops2 extends oops1
{
	oops2()
	{
		super();
		System.out.println("Inside oops2 0 arg const");
	}
}
class oops
{
	public static void main(String[] args)
	{
		System.out.println("Hello Sana");
		oops2 op2 = new oops2();
	}
}*/

/*The super keyword is not only use to differentiate wit respective variable where the names are same but can also used to call methods where method names are also same.
class oops1
{
	void m1()
	{
		System.out.println("Inside m1 method");
	}
}
class oops2 extends oops1
{
	void m1()
	{
		System.out.println("Inside m2 method");
	}
	void test()
	{
		System.out.println("Inside test method");
		this.m1();
		super.m1();
	}
}
class oops
{
	public static void main(String[] args)
	{
		System.out.println("Hello Sana");
		oops2 op2 = new oops2();
		op2.test();
	}
}*/

/*Example 13-Super keyword to use this keyword there is mandatorily  need the concept of inheritance.Super keyword is mean to store the super class object address.
class oops1
{
	 int a=7;
	void m1()
	{
		System.out.println("Inside m1 method" + a);
	}
}
class oops2 extends oops1
{
	 int a=77;
	 void m2(int a)
	{
		System.out.println("Inside m2 method " + a);
		System.out.println("Inside m1-m2 method " + super.a);
		System.out.println(this.a);
	}
}
class oops
{
	public static void main(String[] ags)
	{
		System.out.println("Hello Sana");
		oops2 op2 = new oops2();
		op2.m2(9);
	}
}*/

/*Static members and static methods are also part of the inheritance.
class oops1
{
	static int a = 7;
	static void m1()
	{
		System.out.println("Inside m1 method");
	}
}
class oops2 extends oops1
{
	static float b = 7.7f;
	static void m2()
	{
		System.out.println("Inside m2 method");
	}
}
class oops
{
	public static void main(String[] args)
	{
		System.out.println("Hello Sana");
		System.out.println(oops2.b); oops2.m2();
		System.out.println(oops1.a); oops1.m1();
		System.out.println(oops2.a); oops2.m1();
	}
}*/

/* Once parent class we made final it will not allow member to inherit on child class. However the child class made final,so it will not have any impact on inheritance.
class oops1
{
	int a =7;
	void m1()
	{
		System.out.println("Inside m1 method");
	}
}
final class oops2 extends oops1
{
	float b =7.7f;
	void m2()
	{
		System.out.println("Inside m2 method");
	}
}
class oops
{
	char x='s';
	public static void main(String[] args)
	{
		System.out.println("Hello Sana");
		oops2 op2 = new oops2();
		System.out.println(op2.a); op2.m1();
		System.out.println(op2.b); op2.m2();
	}
}*/

/* We can avoid inheritance by making the class as final .
final class oops1
{
	void m1()
	{
		System.out.println("Inside m1 method");
	}
}
class oops2 
{
	void m2()
	{
		System.out.println("Inside m1 method");
	}
}
class oops
{
	public static void main(String[] args)
	{
		System.out.println("hello SANA");
		oops2 op1= new oops2();
		 op1.m2();
	}
}*/

/*Hierarchical Inheritance
class oops1
{
	int a = 7;
	void m1()
	{
		System.out.println("Inside m1 method"+ a);
	}
}
class oops2 extends oops1
{
	float  b = 7.7f;
	void m2()
	{
		System.out.println("Inside m1 method"+ b);
	}
}
class oops3 extends oops1
{
	char c = 'x';
	void m3()
	{
		System.out.println("Inside m1 method"+ c);
	}
}
class oops4 extends oops1
{
	boolean s = true;
	void m4()
	{
		System.out.println("Inside m1 method"+ s);
	}
}
class oops
{
	public static void main(String[] args)
	{
		System.out.println("Hello Sana");
		oops2 op2 = new oops2();
		System.out.println(op2.b); op2.m2();
		System.out.println(op2.a); op2.m1();
        oops3 op3 = new oops3();
		System.out.println(op3.c); op3.m3();
		System.out.println(op3.a); op2.m1();
		oops4 op4 = new oops4();
		System.out.println(op4.s); op4.m4();
		System.out.println(op4.a); op4.m1();
	}

}*/

/* Multi-level Inheritance 
class oops1
{ 
	int a = 7;
	void m1()
	{
		System.out.println("Inside m1 method");
	}
}
class oops2 extends oops1
{
	float b = 7.7f;
	void m2()
	{
	    System.out.println("Inside m2 method");
	}
}
class oops3 extends oops2
{
	char x = 's';
	void m3()
	{
		System.out.println("Inside m3 method");
	}
	public static void main(String[] args)
	{
		System.out.println("Hello Sana");
		oops3 op3 = new oops3();
		System.out.println(op3.a); op3.m1();
		System.out.println(op3.b); op3.m2();
		System.out.println(op3.x); op3.m3();
	}
	 
}*/

/*Single Inheritance
class oops1
{
	int a=7;
	void m1()
	{
		System.out.println("Inside m1 method");
	}
}
class oops extends oops1
{   float b=7.7f;
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		oops1 op1 = new oops1();
		System.out.println(op1.a);
		oops op2 = new oops();
		System.out.println(op2.b);
		System.out.println(op2.a);
	}
}*/

