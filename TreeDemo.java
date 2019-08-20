import java.util.TreeSet;
public class TreeDemo 
{
	public static void main(String[] args) 
	{
		TreeSet<String> t  =  new TreeSet<String>(new MyComparator());
		
		t.add("Raju"); 			t.add("Hari");
		t.add("Rajveer"); 			t.add("Ram");
		t.add("Narendra modi"); 			t.add("Hari");
		t.add("aaditynath"); 			t.add("hari");
		t.add("Yogi"); 			t.add("Bharat");
		t.add("Manoj"); 			t.add("Naresh");
		
		System.out.println(t);
		
		for (String str : t)
		{
			System.out.println(str);
		}
	}
}
