import java.rmi.*;
import java.rmi.server.*;
public class EvenClient 
{
	public static void main(String[] args)
	{
		Integer[] arr={1,2,3,4,5,6,7,8,9};
		try
		{
			EvenInt evenobj=(EvenInt)Naming.lookup("rmi://localhost/Even");
			System.out.println("Total even numbers are: "+evenobj.even(arr));
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
