import java.util.Comparator;
public class MyComparator implements Comparator
{

	@Override
	public int compare(Object ob1, Object ob2)
	{
		String s1= ob1.toString();
		String s2 = ob2.toString();
		
		return s2.compareToIgnoreCase(s1);
	}
	
}
