class pattern1 
{
	public static void main(String[] args) 
	{
		int count=1;
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=i;j++)
			{
			System.out.print("  "+count+" ");
			count++;
			}
		   System.out.println();
		}
	}
}
/* 
for(int i=0;i<=2;i++)
{
	for(int j=0;j<=i;j++)
	{
		System.out.println(" * ");
		
		}
		System.out.println( );
		} */