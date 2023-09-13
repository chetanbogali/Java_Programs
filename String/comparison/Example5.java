package comparison;

public class Example5 {

	public static void main(String[] args) {
		
		String s1 = "Rama";
		String s2 = "Sita";
		String s3 = s1+s2;
		String s4 = s1+s2;
		
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
