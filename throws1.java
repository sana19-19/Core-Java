class throws1 
{
	void m1() throws InterruptedException 
	{
		System.out.println("Inside m1 block");
		Thread.sleep(3000);
	}
	void m2() throws InterruptedException
	{
		System.out.println("Inside m2 method");
		m1();
	}
	void m3() throws InterruptedException
	{
		System.out.println("Inside m2 method");
		m2();
	}
	public static void main(String[] args) throws InterruptedException
	{
		System.out.println("Hello World!");
		throws1 t = new throws1();
		t.m3();
	}
}
