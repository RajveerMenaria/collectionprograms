import java.util.Stack;

public class StackDemo
{

	public static void main(String[] args) 
	{
		Stack<Integer> s = new Stack<Integer>();
		s.push(10);
		s.push(30);
		s.push(4);
		s.push(98);
		s.push(12);
		System.out.println(s);
		//System.out.println(s.pop());//[12] 
		//System.out.println(s.pop());//[98]Last in First out System
		System.out.println(s.size());
		s.peek();
		System.out.println(s);
		System.out.println("peek "+s.peek());//[get element without removing]
		//s.search(4);
		System.out.println(s.search(4));
		System.out.println(s.search(20));
	}
}
