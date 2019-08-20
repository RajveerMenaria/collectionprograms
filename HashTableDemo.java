import java.util.*;

public class HashTableDemo
{
	public static void main(String[] args)
	{
		Hashtable<Temp , String> h = new Hashtable<Temp , String>();
		h.put(new Temp(10), "pooja");
		h.put(new Temp(2), "nikita");
		h.put(new Temp(54), "hema");
		h.put(new Temp(12), "payal");
		h.put(new Temp(32), "mona");
		
		//h.put(""Durga, null); // Null pointer Exception
		System.out.println(h);
		
	}
}
