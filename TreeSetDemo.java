import java.util.TreeSet;
public class TreeSetDemo 
{
	public static void main(String[] args) 
	{
		TreeSet<Integer> t = new TreeSet<Integer>(new MyComparator());
		t.add(20);			t.add(15);
		t.add(32);			t.add(10);
		t.add(78);			t.add(54);
		t.add(100);			t.add(20);
		t.add(57);			t.add(55);
		t.add(36);			t.add(65);
		
		System.out.println(t);
		
		for (Integer i : t) 
		{
			System.out.println(i);
		}
	}
}
