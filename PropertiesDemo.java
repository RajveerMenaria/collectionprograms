import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws IOException 
	{
		Properties p = new Properties();
		FileInputStream fis = null;
		try 
		{
			fis = new FileInputStream("file.properties");
			p.load(fis);
			//System.out.println(fis.read());
			String s = (String) p.get("rajveer");
			//System.out.println(s);
			p.put("bjp", "narendra");
			p.setProperty("naresh" , "gadri");
			p.setProperty("rajveer", "12345");
			System.out.println(s);
			FileOutputStream fos = new FileOutputStream("file.properties");;	
			p.store(fos, "Uploaded by Rajveer ");
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}

}
