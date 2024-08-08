class this1
{
	void m1()
	{
		System.out.println("Inside m1 method");
		System.out.println(this);
	}
	public static void main(String[]args)
	{
		this1 ss = new this1();
		ss.m1();
		System.out.println(ss);
	}
}
/*class this1
{
	int a=7;
	void m1(int a)
	{
		System.out.println(this.a+a);
	}
	public static void main (String[] args)
	{
		this1 ss = new this1();
		this1 ss1 = new this1();
		ss.m1(70);
		ss.m1(700);
	}
}*/
/*class this1 
{
	int a=7;
	void m1(int a)
	{
		System.out.println("Inside m1 method");
		System.out.println(a);
		System.out.println(this.a);
	}
	public static void main(String[]args)
	{
		this1 ss = new this1();
		ss.m1(10);
	}
}*/

/*class this1 
{   int a=7;
    float b=7.7f;
    void m1()
	{
		System.out.println("Inside m1 method");
		System.out.println(a+b);
		System.out.println(this.a+this.b);
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		this1 ss = new this1();
		ss.m1();
	}
}*/



/* This : To differenciate between loacal var and instance var whenever both that names are same in such situations we use this keyword.
   This keyword is used to stored the current class onject address. */
