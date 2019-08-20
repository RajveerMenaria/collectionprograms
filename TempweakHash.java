
public class Temp 
{
	@Override
	public String toString() 
	{
		return "Janu";
	}
	
	@Override
	protected void finalize() throws Throwable 
	{
		System.out.println("Finalize method calling");
		super.finalize();
	}
}
