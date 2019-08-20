import java.util.TreeSet;
public class CompCompDemo 
{
	public static void main(String[] args)
	{
		Employee e1 = new Employee("NarendraModi", 101);
		Employee e2 = new Employee("ShushmaSwaraj", 24);
		Employee e3 = new Employee("AmitShah", 53);
		Employee e4 = new Employee("NitinGadkari", 19);
		Employee e5 = new Employee("Rajveer", 98);
		Employee e6 = new Employee("nikita", 45);
		Employee e7 = new Employee("rajveer", 25);
		Employee e8 = new Employee("hema", 87);
		Employee e9 = new Employee("poojaMenaria", 1);
		
		TreeSet<Employee> t = new TreeSet<Employee>();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);		
		t.add(e6);
		t.add(e7);
		t.add(e8);		
		t.add(e9);
		
		System.out.println(t);
		for (Employee employee : t) 
		{
			System.out.println(employee);
		}
		
		System.out.println();
		
		TreeSet<Employee> t1 = new TreeSet<Employee>(new MyComparator());
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		t1.add(e4);
		t1.add(e5);
		t1.add(e6);
		t1.add(e7);
		t1.add(e8);		
		t1.add(e9);
		
		System.out.println(t1);
		
		for (Employee employee : t1) 
		{
			System.out.println(employee);
		}
	}
}
