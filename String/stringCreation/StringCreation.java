package stringCreation;

public class StringCreation {

	public static void main(String[] args) {
		 
		// String Creation without using new Operator 
		String s1 = "RAMA";
		System.out.println(s1);
		
		// String Creation using new Operator 
		String s2 = new String("SITA");
		System.out.println(s2);
		
		// // String Creation using char Array
		char ch[] = {'H','A','N','U','M','A','N'};
		String s3 = new String(ch);
		System.out.println(s3);
	}
}
