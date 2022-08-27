import java.rmi.*;
import java.rmi.server.*;
public class EvenImpl extends UnicastRemoteObject implements EvenInt
{
	int total=0;
	public EvenImpl() throws RemoteException
	{
	}	
	public int even(Integer[] arr) throws RemoteException
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				total=total+1;
			}
		}
	return total;
	}
}

