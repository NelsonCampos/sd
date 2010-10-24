import java.rmi.Remote;
import java.rmi.RemoteException;


public interface RepositoryInterface extends Remote
{
public Session getSession(Credential cred) throws RemoteException;
}
