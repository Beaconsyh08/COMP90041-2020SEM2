import java.net.Socket;
import java.io.DataOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DateClient
{
	public static void main(String[] args) 
	{
		try
		{
			String hostname = "localhost";
			int port = 7654;

			System.out.println("Connecting to server on port " + port);
			Socket connectionSock = new Socket(hostname, port);

			BufferedReader serverInput = new BufferedReader(
				new InputStreamReader(connectionSock.getInputStream()));
			DataOutputStream serverOutput = new DataOutputStream(
				connectionSock.getOutputStream());
			
			System.out.println("Connection made, sending name.");
			serverOutput.writeBytes("Dusty Rhodes\n");

			System.out.println("Waiting for reply.");
			String serverData = serverInput.readLine();
			System.out.println("Received: " + serverData);

			serverOutput.close();
			serverInput.close();
			connectionSock.close();
		}
		catch (IOException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
