package comparison;

public class CompareToMethod {

	public static void main(String[] args) {

		String s1 = "Sachin";
		String s2 = "Savrau";
		
		if(s1.compareTo(s2)>0) {
			System.out.println("String 1 is Greater Than String 2");
		}
		else if(s1.compareTo(s2)<0) {
			System.out.println("String 2 is Greater Than String 1");
		}
		else {
			System.out.println("Strings Are Equal");
		}
	}

}
