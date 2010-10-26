import java.rmi.Naming;
import java.rmi.RMISecurityManager;

public class Server
{

public Server()
	{
	if (System.getSecurityManager() == null)
		System.setSecurityManager(new SecurityManager());
	}
public static void main(String[] argv)
	{
	try
		{
		RepositoryList list= new RepositoryList();
		list.addUser("username1", "password1");
		Naming.rebind("repositorylist", list);
		System.out.println("Server is ready.");
		}
	catch (Exception e)
		{
		System.out.println("Server failed: " + e);
		}
	}

}
