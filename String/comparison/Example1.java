package comparison;

public class Example1 {

	public static void main(String[] args) {
		
		String s1 = "RAMA";
		String s2 = "RAMA";
		
		if(s1==s2) {
			System.out.println("Reference are equal");
		} else {
			System.out.println("Reference are Unequal");
		}
		
		if(s1.equals(s2)) {
			System.out.println("Strings are Equal");
		} else {
			System.out.println("Strings are Unequal");
		}
	}
}
