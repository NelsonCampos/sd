import java.rmi.Naming;

public class Client
{

public static void main(String[] argv)
	{
	try
		{
		RepositoryListInterface list = (RepositoryListInterface) Naming
				.lookup("//localhost/repositorylist");
		Credential mycred= new Credential("username1", "password1");
		SessionInterface session= (SessionInterface) list.getSession(mycred);
		System.out.println(session.test());
		}
	catch (Exception e)
		{
		System.out.println("Client exception: " + e);
		}
	}
}