public class StringEx
{
	public static void main(String[] args)
	{
		String inWord;
		System.out.print("Enter some text: ");
		inWord = IO.readString();
		String[] words = inWord.split(" ");
		for(int i = 0; i < words.length; i++)
		{
			System.out.println(words[i]);
		}
	}
}
