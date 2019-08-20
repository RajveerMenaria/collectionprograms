import java.util.LinkedList;
import java.util.ListIterator;
public class ListIteratorDemo 
{
	public static void main(String[] args) 
	{
		LinkedList<Integer> l = new LinkedList<Integer>();
		l.add(47);
		l.add(00);
		l.add(-98);
		l.add(8);
		l.add(254);
		l.add(23);
		l.add(54);
		System.out.println(l);
		
		ListIterator<Integer> itr = l.listIterator();
		while(itr.hasNext())
		{
			Integer i = (Integer) itr.next();
			if(i == 23)
			{
				itr.remove();
			}
			else if(i <= 8)
			{
				itr.add(200);
			}
			/*else
			{
				itr.set(101);
			}*/
		}
		System.out.println(l);
	}
}
