class sample1 
{   static float x=7.7f;
    static void m1()
		{ 
		    System.out.println("Inside m1");
	    }
	public static void main(String[] args) 
		{
		    System.out.println("Start");
			sample1 obj = new sample1();
			obj.test();
			System.out.println("Stop");
	    }
	void test()
		{
			System.out.println("Inside test");
			sample1 obj=new sample1();
			sample1.m1();
			System.out.println(obj.x);
			System.out.println(sample1.x);
			System.out.println(x);
		}
	
}
