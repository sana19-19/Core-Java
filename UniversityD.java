import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
class UniversityD 
{
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException
	{
		FileInputStream fis = new FileInputStream("C:\\stud.StudInfo.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object o = ois.readObject();
		Stud s = (Stud)o;
		System.out.println(s.studId+" - "+s.studName);
	}
}
