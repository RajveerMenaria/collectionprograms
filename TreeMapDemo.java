import java.util.TreeMap;

public class TreeMapDemo
{
	public static void main(String[] args) 
	{
		TreeMap<Integer,String> t = new TreeMap<Integer,String>();
		t.put(121, "Rajveer");
		t.put(102, "Pooja");
		t.put(325, "Manoj");
		t.put(98, "Pushkar");
		t.put(87, "Nikita");
		t.put(215, "Lokesh");
		t.put(45, "Pooja");
		
		System.out.println(t);
		
		
	}
}
