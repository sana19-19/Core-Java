import java.util.Scanner;
class Practice
{
	public static void main(String[] args) 
	{
		int number;
		Scanner sc = new Scanner(System.in);
		number=sc.nextInt();
		System.out.println(number);
		int table;
		int sum=0;
		for(int i=1;i<=10;i++)
		{
			table = number*i;
			System.out.println(number + " * " +i+ " = " + table);
			sum = sum+table;
			System.out.println(sum);
		}

	}
}
