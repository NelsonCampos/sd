import java.rmi.Naming;

public class Client
{

public static void main(String[] argv)
	{
	try
		{
		HelloInterface hello = (HelloInterface) Naming
				.lookup("//localhost/Hello");
		System.out.println(hello.say());
		}
	catch (Exception e)
		{
		System.out.println("HelloClient exception: " + e);
		}
	}
}