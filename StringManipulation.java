public class StringManipulation
{
	public static void main(String args[])
	{
		String str1=new String("Hello");// a. Create new strings using new
		String str2=new String("World");
		
		System.out.println("a. created Strings:");
		System.out.println("String 1:" +str1);
		System.out.println("String 2:" +str2);
		
		System.out.println("b. length of str1:" +str1.length());// b. Getting string length
		String str3=str1.concat(" " + str2);// c. String concatenation
		System.out.println("c. Concatenated String:" +str3);
		
		char ch=str1.charAt(1);// d. Character extraction
		System.out.println("d. Character at index 1 in str1:" +ch);
		
		String str4="Hello";
		System.out.println("e. String Comparison:");// e. String comparison
		System.out.println("str1.equals(str4):" +str1.equals(str4));
		System.out.println("str1==str4:" +(str1==str4));
		
		int index=str3.indexOf("world");// f. Searching substrings
		System.out.println("f. Index of world in str3:" +index);
		
		String replaced=str3.replace("World", "Java");// g. Modifying a string
		System.out.println("g. Modified string (replace 'world' with 'java'): " +replaced);
		
		int number=100;
		String numStr=String.valueOf(number);
		System.out.println("h. Data conversion using valueOf:");
		System.out.println("Integer to String:" +numStr + " (length=" +numStr.length() +")");
	}
}
		
		
		
		
		
		
