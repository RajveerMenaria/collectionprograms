import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

public class LinkedListConstructor 
{
	public static void main(String[] args)
	{
		Collection<String> c = new HashSet<String>();
		c.add("raju");
		c.add("nikita");
		c.add("raju");
		c.add("pooja");
		LinkedList<String> l = new LinkedList<String>(c);
		l.addFirst("Hema");
		System.out.println(l.add("Mamta"));
		System.out.println(l);
		
	}
}
