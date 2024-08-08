import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.ObjectOutputStream;
import java.io.IOException;
class CollegeSerial 
{
	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		//System.out.println("Hello World!");
		Stud s = new Stud(107,"Shubham");
		FileOutputStream fos = new FileOutputStream("C:\\stud.StudInfo.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s);
	}
}
