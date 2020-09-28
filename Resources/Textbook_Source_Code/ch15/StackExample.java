public class StackExample
{
	public static void main(String[] args)
	{
		Stack stack = new Stack();

		stack.push("Billy Rubin");
		stack.push("Lou Pole");
		stack.push("Polly Ester");

		while (!stack.isEmpty())
		{
			String s = stack.pop();
			System.out.println(s);
		}
	}
}