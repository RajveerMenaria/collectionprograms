import java.util.*;
import java.util.Map.Entry;
import java.util.*;
public class HashMapDemo
{
	public static void main(String[] args)
	{
		HashMap<Integer,String> m = new HashMap<Integer,String>();
		m.put(102, "Rajveer");
		m.put(101, "Raju");
		m.put(98, "Bharat");
		m.put(105, "Riya");
		m.put(24, "Rajveer");
		m.put(30, "nikita");
		
		System.out.println(m);
		
		//Collection c = m.keySet(); // for get all keys
		Collection c = m.keySet(); // for get all values
		System.out.println(c);
		
		Set s1 = m.entrySet();
		System.out.println(s1);
		
		System.out.println(m.keySet());
		System.out.println(m.values());
		
		Iterator itr = s1.iterator();
		while(itr.hasNext())
		{
			Map.Entry<Integer, String> m1 = (Map.Entry<Integer, String>) itr.next();
			
			//System.out.println(m1.getKey()+"--------"+m1.getValue());
			
			if(m1.getKey().equals(101))
			{
				m1.setValue("Payal");
			}
			System.out.println();
			System.out.println(m1.getKey()+"---------"+m1.getValue());
		}
		System.out.println(m);
	}
}
