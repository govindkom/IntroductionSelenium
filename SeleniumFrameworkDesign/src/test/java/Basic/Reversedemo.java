package Basic;

public class Reversedemo {

	public static void main(String[] args) {
		// Reversedemo

		String s="govind"
				+ "";
		String t="";
		for(int i=s.length()-1;i>=0;i--)
		{
			t= t+s.charAt(i);
		}
		System.out.println(t);
	}

}
