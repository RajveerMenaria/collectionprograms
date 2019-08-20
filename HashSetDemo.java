import java.util.HashSet;
import java.util.Iterator;
public class HashSetDemo 
{
	public static void main(String[] args)
	{
		HashSet<Object> h = new HashSet<Object>();
		h.add("Rajveer");
		h.add(20);
		h.add("Nikita");
		h.add(54);
		h.add("Pooja");
		h.add(54);
		h.add("Rajveer");
		h.add(21);
		h.add("rajveer");
		h.add(74);
		
		System.out.println(h);
		
		/*for (Object object : h) 
		{
			System.out.println(object);
		}*/
		
		/*Iterator<Object> itr = h.iterator();
		while(itr.hasNext())
		{
			Object ob = itr.next();
			System.out.println(ob);
		}*/
		
		Iterator<Object> itr = h.iterator();
		while(itr.hasNext())
		{
			Object ob = itr.next();
			if(ob.equals("rajveer"))
			{
				itr.remove();
			}
			else if(ob.equals(21))
			{
				itr.remove();
			}
			System.out.println(ob);
		}
	}
}
