import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Reader{
	
	public static void main(String args[]) throws FileNotFoundException
	{
		File file = new File("C:/Users/Derrick Gaban/Documents/CSVRead/InputAE.csv");
		
		try	{
			Scanner inputStream = new Scanner(file);
			while(inputStream.hasNext())
			{
				String data = inputStream.next();
				System.out.print(data);
			}
			inputStream.close();
		} catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
	}
}