import java.rmi.*;

public class MatrixServer
{
    public static void main(String[] args)
    {
        try
        {
        	MatrixImpl al_im=new MatrixImpl();
        	Naming.rebind("mul_matrix",al_im);
        	System.out.println("Server is ready");
        }
        catch(Exception e)
        {

        }
    }
}