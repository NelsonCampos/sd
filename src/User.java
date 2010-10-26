import java.util.ArrayList;


public class User
{
public Credential credential;
public String username;

public User(String username, String password) throws CredentialException
	{
	this.username= username;
	this.credential= new Credential(username, password);
	}
}
