class if1 
{
	public static void main(String[] args) 
	{
		/*int age = 14;
		if(age>=10)
		{
		  System.out.println("not a child");
		}
		int age = 18;
		if(age>=18)
		{
			System.out.println("Eligible for voting");
		}
		else
		{
			System.out.println("Not eligible for voting");
		}*/
		int age = 18;
		char gender = 'M';
		if((gender=='F' && age>=21)||(gender=='M' && age>=18))
		{
			System.out.println("eligible for marraige");
		}
		else
		{
			System.out.println("Not eligible for marraige");
		}


	}
}
