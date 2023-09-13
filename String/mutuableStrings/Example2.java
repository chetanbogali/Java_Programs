package mutuableStrings;

public class Example2 {

	public static void main(String[] args) {

		// STRING BUFFER
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
		sb.append("Sachin Is A BatsMan ");
		System.out.println(sb.capacity());
		sb.append("He Lives In Mumbai");
		System.out.println(sb.capacity());
		System.out.println("=========================");
		
		// STRING BUILDER
		StringBuilder sb2 = new StringBuilder();
		System.out.println(sb2.capacity());
		sb2.append("Saurav Is A BatsMan ");
		System.out.println(sb2.capacity());
		sb2.append("He Lives In Mumbai");
		System.out.println(sb2.capacity());
	}
}
