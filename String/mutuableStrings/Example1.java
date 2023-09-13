package mutuableStrings;

public class Example1 {

	public static void main(String[] args) {

//		StringBuffer sb = new StringBuffer("Rama ");
//		System.out.println(sb);
//		// After altering the string 
//		sb.append("Sita");
//		System.out.println(sb);
//
//		StringBuilder sb2 = new StringBuilder("lohi ");
//		System.out.println(sb2);
//		sb2.append("Anna");
//		System.out.println(sb2); // prints lohiAnna
		
		String s1 = "Java is Object Oreinted Language";
		String []arr = s1.split(" ");
		
		for (String x : arr) {
			
			System.out.print(x+" ");
		}
	}	 
}
