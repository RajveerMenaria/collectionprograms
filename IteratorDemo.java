import java.util.ArrayList;
import java.util.Iterator;
public class IteratorDemo
{
	public static void main(String[] args)
	{
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(5);
		l.add(114);
		l.add(54);
		l.add(23);
		l.add(54);
		/*for (Integer lst : l) 
		{
				System.out.println(lst);
		}*/
		System.out.println(l);
		Iterator<Integer> itr = l.iterator();
		while(itr.hasNext())
		{
			Integer i = (Integer) itr.next();
			if(i%2 == 0)
				System.out.println(i);
			else
				itr.remove();
		}
	}
}
