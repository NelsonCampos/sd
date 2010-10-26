import java.rmi.Remote;
import java.rmi.RemoteException;


public interface RepositoryListInterface extends Remote
{
public SessionInterface getSession(Credential cred) throws RemoteException;
}
