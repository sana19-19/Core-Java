import java.io.Serializable;
class Stud implements Serializable 
{
		//System.out.println("Hello World!");
		int studId;
		String studName;
		Stud(int studId, String studName)
		{
			this.studId = studId;
			this.studName = studName;
		}
}
