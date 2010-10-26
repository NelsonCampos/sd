import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class Session extends UnicastRemoteObject implements SessionInterface
{
private User user;

public Session(User user) throws RemoteException
	{
	this.user=user;
	}

public String test() throws RemoteException
	{
	return "test message";
	}
}
