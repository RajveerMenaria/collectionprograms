import java.util.*;

public class TreeMapCustomised
{
	public static void main(String[] args) 
	{
		TreeMap<String , Integer> t = new TreeMap<String , Integer>(new MyComparator());
		t.put("pooja", 15);
		t.put("nikita", 45);
		t.put("riya", 21);
		t.put("payal", 14);
		t.put("hema", 32);
		t.put("gayatri", 52);
		
		System.out.println(t);
		System.out.println(t.keySet());
		System.out.println(t.values());
	}
}
