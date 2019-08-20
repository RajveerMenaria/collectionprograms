import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListDemo 
{
	public static void main(String[] args) 
	{
		ArrayList<Object> al = new ArrayList<Object>();
		al.add(10);
		al.add(20);
		al.add("A");
		al.add("C");
		al.add("B");
		al.add(5);
		System.out.println(al);//[10,20,A,C,B,5]
		al.remove(2);
		System.out.println(al);//[10,20,C,B,5]
		al.add(2, "Rajveer");
		al.add("N");
		System.out.println(al);
		al.set(1, 11);
		Object o=al.get(3);
		System.out.println(o);
		System.out.println(al);
		//ListIterator itr = al.listIterator();
		/*while (itr.hasNext()) 
		{
			Object str =  itr.next();
			System.out.println(str);
		}*/
		for (Object ob : al) {
			System.out.println(ob);
		}
	}
}
