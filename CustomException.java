class Flipkart
{
	int productPrice = 5000;
	void buyProduct(int CustAmount) throws InvalidAmountTransactionException
	{
		if (productPrice == CustAmount)
		{
			System.out.println("Your Transaction is done !.......");
		}
		else
		{
			System.out.println("Plz inter valid amonut..........");
			throws new InvalidAmountTransactionException();
		}
	}
}
class CustomException
{
	public static void main(String[] args) throws InvalidAmountTransactionException
	{
		Flipkart f = new Flipkart();
		f.buyProduct(2500);
	}
}
class InvalidAmountTransactionException extends Exception
{
}









/*Simple Program
import java.util.Scanner;
class flipkart
{
	int productPrice = 5000;
	void buyProduct()
	{int custAmount;
       Scanner sc = new Scanner(System.in);
		custAmount = sc.nextInt();
	    //int custAmount;
		if(productPrice == custAmount)
		{
			System.out.println("Your transaction is done !......");
		}
		else 
		{
			System.out.println("Plz inter valid amount......");
		}
	}
}
class CustomException extends flipkart
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		CustomException c= new CustomException();
		c.buyProduct();
	}
}*/
