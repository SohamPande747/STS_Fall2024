import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bufferClass
{
	public static void main(String[] args)
			throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter your name: ");

		String name = in.readLine();
		System.out.println(name);
	}
}
