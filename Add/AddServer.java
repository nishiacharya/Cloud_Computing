import java.rmi.*;
import java.rmi.server.*;
public class AddServer 
{
	public static void main(String args[])
	{
		try
		{
			AddImpl addobj=new AddImpl();
			Naming.rebind("sum",addobj);
			System.out.println("Server is ready");
		}
		catch(Exception e)
		{
			System.out.println("Error"+e);
		}	
	}
}