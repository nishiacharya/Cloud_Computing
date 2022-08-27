import java.rmi.*;
import java.rmi.server.*;
public interface EvenInt extends Remote
{
	public int even(Integer[] arr)throws RemoteException;
}


