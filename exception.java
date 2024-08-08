class exception
{
	 void m1()
	{
		try
		{
			System.out.println(10/0);
		}
		catch (ArithmeticException ae)
		{
			//System.out.println(ae.toString());
			//System.out.println(ae.getMessage());
			ae.printStackTrace();
		}
	}
	void m2()
	{
		System.out.println("Inside m2 method");
		m1();
	}
	void m3()
	{
		System.out.println("Inside m1 method");
		m2();
	}
	public static void main(String[] args)
	{
		System.out.println("Hello Owais");
		exception e = new exception();
		e.m3();
	}
}
/*
class exception
{
	public static void main(String[] args)
	{
		try
		{
			System.out.println(10/0);
		}
		catch (ArithmeticException ae)
		{
			System.out.println(ae.toString());
			System.out.println(ae.getMessage());
				ae.printStackTrace();
		}
	}
}*/

/*class exception
{
	public static void main(String[] args)
	{
		try
		{
			System.out.println(10/0);
		}
		finally
		{
			System.out.println(10/2);
		}
	}
}*/

/*
class exception
{
	public static void main(String[] args)
	{
		try
		{
			//System.out.println(10/0);
			System.exit(1);
		}
		catch (ArithmeticException ae)
		{
			System.out.println("Hello");
		}
		finally
		{
			System.out.println("Inside finally");
		}
	}
}*/

/*
class exception
{
	public static void main(String[] args)
	{
		try
		{
			System.out.println("Inside try block");
			System.out.println(10/0);
		}
		catch (ArithmeticException ae)
		{
			System.out.println(10/2);
		}
		finally
		{
			System.out.println("Inside finally");
			try
			{
				System.out.println(10/0);
			}
			catch (ArithmeticException ae)
			{
				System.out.println("Inside catch block");
			}
		}
	}
}*/

/*class exception
{
	public static void main(String[] args)
	{
		try
		{
			System.out.println(10/0);
		}
		catch (Throwable t)
		{
			System.out.println("Inside catch block");
			try
			{
				System.out.println(10/0);
			}
			catch (ArithmeticException ae)
			{
				System.out.println(10/2);
			}
		}
	}
}*/

/*class exception
{
	public static void main(String[] args)
	{
		try
		{
			System.out.println("Hello Hello");
		}
		finally
		{
			System.out.println(0/0);
		}
	}
}*/

/*class exception
{
	public static void main(String[] args)
	{
		try
		{
			System.out.println("Inside try block");
		}
		finally
		{
			System.out.println("Inside finally block");
		}
	}
}*/

/*class exception
{
	public static void main(String[] args)
	{
		try
		{
			System.out.println(10/0);
		}
		finally
		{
			System.out.println("Inside finally");
		}
	}
}*/

/*class exception
{ 
	public static void main(String[] args)
	{
		try
		{
			System.out.println("Inside Try block");
			Thread.sleep(3000);
		}
		catch (Throwable t)
		{
			System.out.println("Inside catch block");
		}
		finally
		{
			System.out.println("Inside finally block");
		}
	}
}*/

/*class exception
{
	public static void main(String[] args)
	{
		try
		{
			System.out.println(10/0);
		}
		catch (ArithmeticException ae)
		{
			System.out.println("Hello");
			System.out.println(10/0);
		}
		finally
		{
			System.out.println("Inside finally");
		}
	}
}*/

/*class exception
{
	public static void main(String[] args)
	{
		try
		{
			System.out.println(10/0);
		}
		catch (ArrayIndexOutOfBoundsException ab)
		{
			System.out.println("Inside catch block");
		}
		finally
		{
			System.out.println("Inside finally block");
		}
	}
}*/

/*class exception
{
	public static void main(String[] args)
	{
		try
		{
			System.out.println(10/2);
		}
		catch (ArithmeticException a )
		{
			System.out.println("Hello Sana");
		}
		finally
		{
			System.out.println("Inside finally");
		}
	}

}*/

/*class exception
{
	public static void main(String[] args)
	{
		try
		{
			Thread.sleep(3000);
			//System.out.println(10/0);
		}
		catch (InterruptedException a)//------>Exeception and Throwable
		{
			System.out.println("Inside catch block");
			//Thread.sleep(3000);
		}
		finally
		{
			System.out.println("Inside finally");
		}
	}
}*/

/*class exception
{
	public static void main(String[] args)
	{
		System.out.println("Hello Sana");
		try
		{
			System.out.println(10/0);
		}
        catch (ArithmeticException a)
		{
			System.out.println("Inside Arithmetic Exception " +a);
		}
		catch (Exception e)
		{
			System.out.println("Inside catch block "+ e);
		}
		
	}
}*/

/*class exception
{
	public static void main(String[] args)
	{
		System.out.println("Hello Sana");
		try
		{
			System.out.println(10/0);
		}
		System.out.println("After try block");
		catch (ArithmeticException a)
		{
			System.out.println("Inside catch block");
		}
	}
}*/

/*class exception
{
	public static void main(String[] args)
	{
		System.out.println("Hello Sana");
		try
		{
			System.out.println(10/0);
		}
		catch(ArrayIndexOutOfBoundsException ab)
		{
			System.out.println("Inside ArrayIndexOutOfBounds Exception");
		}
		catch (ArithmeticException a )
		{
			System.out.println("Inside Arithmetic Exception");
		}
	}
}*/

/*class exception
{
	public static void main(String[] args)
	{
		System.out.println("Hello Sana");
		try
		{
			System.out.println("Inside try block");
			int[] a = {1,2,3,4,5,6,7};
			System.out.println(a[20]);
			System.out.println(10/0);
		}
		catch (ArrayIndexOutOfBoundsException a)
		{
			//System.out.println(a[6]);
			System.out.println(10/2);
		}
	}
}*/

/*class exception
{
	public static void main(String[] args)
	{
		try
		{
			System.out.println("Inside try block");
			System.out.println(10/2);
		}
		catch ( ArithmeticException a)
		{
			System.out.println("Inside catch block");
		}
	}
}*/

/*
class exception
{
	public static void main(String[] args)
	{
		System.out.println("Hello Sana");
		try
		{
			System.out.println("Inside try block");
			System.out.println(10/0);//-------> ArithmaticException
		}
		catch (ArrayIndexOutOfBoundsException a)
		{
			System.out.println(10/2);
		}
	}
}*/

/*
class exception
{
	public static void main(String[] args)
	{
		System.out.println("Hello Sana");
		try
		{
			System.out.println("Inside try block");
			System.out.println(10/2);
		}
		catch (ArithmeticException a )
		{
			System.out.println("Inside catch block");
		}
	}
}*/

/*
class exception
{
	public static void main(String[] args)
	{
		System.out.println("Hello Sana");
		try
		{
			System.out.println("Inside try block");
			System.out.println(10/0);
			System.out.println("End of the try block");
		}
		catch(ArithmeticException a)
		{
			System.out.println("Inside catch block");
			System.out.println(10/2);
			System.out.println(a);
		}
	}
}*/

/*class exception ------> Checked Exception
{
	public static void main(String[] args)
	{
		System.out.println("Hello Sana");
		Thread.sleep(7000);
	}
}
/*
class exception ----->Unchecked Exception
{
	public static void main(String[] args) 
	{
		System.out.println("Start the World!");
		System.out.println(10/0);
		System.out.println("End the world!");
	}
}*/

/*
class exception ----->Unchecked Exception
{
	public static void main(String[] args)
	{
		int[] a = {10,20,30,40,50};
		System.out.println(a[30]);
	}
}
*/