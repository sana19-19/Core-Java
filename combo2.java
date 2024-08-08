class combo2
{   int a=7;
   public static void main(String []args)
	{
		
		combo2 obj1 = new combo2();
        obj1.m1();

	}
	void m1()
	{
		System.out.println(a);
		//System.out.println(combo2.a);------->error
		combo2 obj1 = new combo2();
		System.out.println(obj1.a);
    }
}