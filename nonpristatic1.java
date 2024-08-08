class nonpristatic1 
{
	/*char a='x';
	static nonpristatic1 ref = new nonpristatic1();
	public static void main(String []args)
	{
		System.out.println(nonpristatic1.ref.a);
	}*/
	static nonpristatic1 ref;
	public static void main(String[]args)
	{
		ref = new nonpristatic1();
		ref.m1();
	}
	void m1()
	{
		System.out.println("Inside m1");
	}
}
