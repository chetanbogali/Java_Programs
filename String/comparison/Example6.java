package comparison;

public class Example6 {

	public static void main(String[] args) {
		
		String s1 = "Rama";
		String s2 = s1;
		
		if(s1==s2) {
			System.out.println("Reference are Equal");
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
