import java.util.Vector;
public class VectorDemo
{
	
	public static void main(String[] args) 
	{
		Vector<Object> v = new Vector<Object>();
		v.add(10);
		v.add(5);
		v.add(30);
		v.add(8);
		v.add("Rajveer");
		v.add(2, "Nikita");
		v.addElement(123);
		//v.remove(1);//[for remove particular index element ]
		//v.removeElement(5);//[for remove a particular element]
		//v.removeElementAt(0);//[for remove particular index element]
		//v.removeAllElements();//[for remove all element]
		System.out.println(v.get(6));//[to get a particular index element]
		System.out.println(v.elementAt(2));//[to get particular index element]
		System.out.println(v.firstElement());//[to get first element]
		System.out.println(v.lastElement());//[to get last element]
		//System.out.println(v);
		for (Object ob : v)
		{
			System.out.println("Iteration = "+ob);
		}
	}
}
