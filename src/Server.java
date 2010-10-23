import java.rmi.Naming;
import java.rmi.RMISecurityManager;

public class Server
{
public static void main(String[] argv)
	{
	if (System.getSecurityManager() == null)
		{
		System.setSecurityManager(new SecurityManager());
		}
	try
		{
		Naming.rebind("Hello", new Hello("Hello, world!"));
		System.out.println("Hello Server is ready.");
		}
	catch (Exception e)
		{
		System.out.println("Hello Server failed: " + e);
		}
	}

}
