import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
public class InitialCapacityArrayList 
{
	public static void main(String[] args) 
	{
		/*Collection c=new HashSet();
		c.add(5);	c.add(8);	c.add(6);
		c.add(5);	c.add(78);	c.add(2100);
		ArrayList<Integer> l1=new ArrayList<Integer>(c);
		System.out.println(l1.get(0));*/
		ArrayList<Integer> lst=new ArrayList<Integer>(15);
		lst.add(5);
		lst.add(6);
		lst.add(54);
		lst.add(8);
		lst.add(57);
		lst.add(45);
		lst.add(65);
		lst.add(5);
		lst.add(6);
		lst.add(54);
		lst.add(8);
		lst.add(57);
		lst.add(54);
		lst.add(45);
		lst.add(65);
		System.out.println(lst.size());
		System.out.println(lst);
		System.out.println(lst.lastIndexOf(54));
		
	}
}
