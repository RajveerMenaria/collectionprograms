import java.util.ArrayList;

public class SynchronisedAL 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(36);
		al.add(11);
		al.add(16);
		System.out.println(al);
		/*List l=(List) Collections.synchronizedCollection(al);
		System.out.println(l);*/
	}
}
