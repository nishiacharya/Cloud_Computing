import java.rmi.*;
public interface AddInt extends Remote
{
	public double addTwoNo(double no1,double no2) throws RemoteException;
}