import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
public class LinkedHashSetDemo 
{
	public static void main(String[] args)
	{
		LinkedHashSet<Object> lhs = new LinkedHashSet<Object>();
		lhs.add(20);
		lhs.add("Rajveer");
		lhs.add(10);
		lhs.add("Nikita");
		lhs.add(02);
		lhs.add("nikita");
		lhs.add(60);
		lhs.add("rahul");
		lhs.add(20);
		lhs.add("Bharat");
		System.out.println(lhs);
		
		/*for (Object ob : lhs) 
		{
			System.out.println(ob);
		}*/
		
		Iterator<Object> itr = lhs.iterator();
		while(itr.hasNext())
		{
			Object th = itr.next();
			if(th.equals("nikita"))
			{
				itr.remove();
			}
			System.out.println(th);
		}
	}
}
