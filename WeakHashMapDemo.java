import java.util.*;

public class WeakHashMapDemo 
{
	public static void main(String[] args) throws Exception
	{
		//WeakHashMap m = new WeakHashMap(); // it is weak when gc is calling
		HashMap m = new HashMap(); //hash map is more pawerfull then gc
		Temp t = new Temp();
		
		m.put(t, "Pooja");
		
		System.out.println(m);
		
		t = null;
		System.gc();
		Thread.sleep(5000);
		
		System.out.println(m);
	}
}
