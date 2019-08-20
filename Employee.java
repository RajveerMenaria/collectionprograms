
public class Employee implements Comparable
{
	String name;
	int eId;
	
	Employee(String name, int eId)
	{
		this.name = name;
		this.eId = eId;
	}
	
	@Override
	public String toString() 
	{
		return name+"--------"+eId;
	}
	
	@Override
	public int compareTo(Object obj) 
	{
		int eId1 = this.eId;
		Employee e = (Employee) obj;
		int eId2 = e.eId;
		
		if (eId1 < eId2)
		{
			return -1;
		}
		else if(eId1 > eId2)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
}
