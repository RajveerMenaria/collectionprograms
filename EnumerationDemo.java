import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo
{
	public static void main(String[] args) 
	{
		Vector<Integer> v= new Vector<Integer>();
		for (int i = 0; i < 10; i++)
		{
			v.addElement(i*2-1);
			v.addElement(i);
			v.addElement(i*4);
		}
		System.out.println(v.size());
		System.out.println("Vector element "+v);
		Enumeration e = v.elements();
		while(e.hasMoreElements())
		{
			Integer i = (Integer) e.nextElement();
			if(i%2==0)
			{
				System.out.println("Element "+i);
			}
		}
		System.out.println(v);
	}
}