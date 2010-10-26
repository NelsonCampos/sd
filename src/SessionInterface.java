import java.rmi.Remote;
import java.rmi.RemoteException;


public interface SessionInterface extends Remote
{

public String test() throws RemoteException;
}
