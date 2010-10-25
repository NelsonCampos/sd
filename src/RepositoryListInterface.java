import java.rmi.Remote;
import java.rmi.RemoteException;


public interface RepositoryListInterface extends Remote
{
public Session getSession(Credential cred) throws RemoteException;
}
