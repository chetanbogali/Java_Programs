package comparison;

public class Example4 {

	public static void main(String[] args) {
		
		String s1 = "Rama";
		String s2 = "Sita";
		// Strings are immutable
		String s3 = "Rama" + "Sita";
		String s4 = "Rama" + "Sita";
		
		if(s3==s4) {
			System.out.println("Reference are equal");
		} else {
			System.out.println("Reference are Unequal");
		}
		
		if(s3.equals(s4)) {
			System.out.println("Strings are Equal");
		} else {
			System.out.println("Strings are Unequal");
		}
	}
}
