import java.rmi.*;

public interface MatrixInt extends Remote
{
    public int[][] mul_mat(int[][]mat1,int[][]mat2)throws RemoteException;
}