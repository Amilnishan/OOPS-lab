import java.util.Scanner;

class AuthenticationException extends Exception
{
	public AuthenticationException(String message)
	{
		super(message);
	}
}

class Login
{
	private final String validUsername="admin";
	private final String validPassword="admin@1234";
	
	public void authenticate(String username,String password) throws AuthenticationException
	{
		if(!username.equals(validUsername) || !password.equals(validPassword))
		{
			throw new AuthenticationException("Invalid Username or Password");
		}
		System.out.println("Login successfull!");
	}
}

public class Authentication
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Login login=new Login();
		
		System.out.println("Enter username:");
		String username=sc.next();
		
		System.out.println("Enter password:");
		String password=sc.next();
		
		try
		{
			login.authenticate(username,password);
		}
		catch(AuthenticationException e)
		{
			System.out.println("Authentication Failed:" + e.getMessage());
		}
		sc.close();
	}
}
