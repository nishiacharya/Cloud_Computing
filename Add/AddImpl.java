import java.rmi.*;
import java.rmi.server.*;
public class AddImpl extends UnicastRemoteObject implements AddInt
{
	AddImpl() throws RemoteException
	{

	}
	public double addTwoNo(double no1,double no2) throws RemoteException
	{
		return(no1+no2);
	}
}