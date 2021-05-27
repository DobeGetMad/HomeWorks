package homeWorks;

public class StringReverse {

	public static void main(String[] args) {
		String s1 = "reverse";
		String rev = "";
		
		int l = s1.length();
		
		for (int i=l -1; i>=0; i--) 
		
		{
			rev=rev+s1.charAt(i);
		}
		System.out.println(rev);
				

	}

}
