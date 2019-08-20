import java.util.LinkedList;

public class LinkedListDemo 
{
	public static void main(String[] args) 
	{
		LinkedList<Integer> l = new LinkedList<Integer>();
		l.add(52);
		l.add(15);
		l.add(24);
		l.add(78);
		l.add(5587);
		l.add(455572);
		l.addFirst(41);
		l.addLast(99);
		l.removeFirst();
		l.removeLast();
		System.out.println("Last "+l.getLast()+"  First"+l.getFirst() );
		
		System.out.println(l);
		int free=0;
		for (Integer integer : l) 
		{
			System.out.println(integer);
			
		}
		System.out.println("Greater then 40 = "+free);
	}
}
