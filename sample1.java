class sample2 
{   static int a=7;
    static void m1()
		{
		System.out.println("Inside m1");
	    }
}
class semo
{
	public static void main(String[] args) 
		{
		System.out.println("Start!");
		semo obj=new semo();
		obj.test();
		System.out.println("Stop!");
	    }
	void test()
		{
		System.out.println(sample2.a);
		sample2 obj=new sample2();
		System.out.println(obj.a); obj.m1();
	    }
}
