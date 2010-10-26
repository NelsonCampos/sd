import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;

public class RepositoryList extends UnicastRemoteObject implements RepositoryListInterface
{
private HashMap<String, User> userlist;

public RepositoryList() throws RemoteException
	{
	userlist= new HashMap<String, User>();
	}

public void addUser(String username, String password) throws Exception
	{
	if (userlist.containsKey(username))
		{
		throw new Exception("User already exists");
		}
	User newuser= new User(username, password);
	userlist.put(username, newuser);
	}

public Session getSession(Credential cred) throws RemoteException
	{
	try
		{
		User user= userlist.get(cred.username);
		if (user.credential.compareCredential(cred))
			{
			System.out.println("User "+cred.username+" logged in");
			return new Session(user);
			}
		}
	catch (Exception e)
		{
		
		}
	System.out.println(cred.username+" failed to log in");
	return null;
	}

}
