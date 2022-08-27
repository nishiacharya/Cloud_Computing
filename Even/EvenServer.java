import java.rmi.*;
import java.rmi.server.*;
public class EvenServer 
{
	public static void main(String[] args)
	{
		try
		{
			EvenImpl evenobj=new EvenImpl();
			Naming.rebind("Even",evenobj);
			System.out.println("Server is ready");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}


