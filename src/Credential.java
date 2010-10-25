import java.io.Serializable;
import java.security.*;
import java.util.Arrays;

public class Credential implements Serializable
{
private static final long serialVersionUID = -6402240101611558075L;
public String username;
public byte[] password_hash;

public Credential(String username, String password) throws CredentialException
	{
	try
		{
		byte[] passwordbytes = password.getBytes("UTF-8");
		MessageDigest md = MessageDigest.getInstance("MD5");
		this.password_hash = md.digest(passwordbytes);
		this.username = username;
		}
	catch (Exception e)
		{
		e.printStackTrace();
		throw new CredentialException("Couldn't create Credential for "
				+ username);
		}
	}

public boolean compareCredential(Credential cred)
	{
	if ((cred.username.equals(username)) && (Arrays.equals(cred.password_hash,password_hash)))
		return true;
	return false;
	}

}
