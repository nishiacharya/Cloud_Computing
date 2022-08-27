import java.rmi.*;
import java.rmi.server.*;

public class MatrixImpl extends UnicastRemoteObject implements MatrixInt
{
    public MatrixImpl()throws RemoteException
    {

    }

    public int[][] mul_mat(int[][]mat1,int[][]mat2)
    {
    	int[][]newArr=new int[mat1.length][mat1[0].length];
    	for(int i=0;i<mat1.length;i++)
    	{
        	for(int j=0;j<mat1[0].length;j++)
        	{
            	newArr[i][j]=0;
            	for(int k=0;k<mat1.length;k++)
            	{
            		newArr[i][j]+=mat1[i][k]*mat2[k][j];
            	}
        	}

    	}
   	return newArr; // Re-running the array witch created inside this method
    }
}