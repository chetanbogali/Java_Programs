package stringMethods;

public class ReplaceMethod {

	public static void main(String[] args) {

		String s1 = new String("Raja Ram Mohan Roy");
		s1 = s1.replace('R','A');
		System.out.println(s1);

		s1 = s1.replaceAll("Aaja", "Raja");
		System.out.println(s1);

		String str = new String("Omkar");
		String str1 = str.intern();
		String str2 = "Omkar";
		if(str1 == str2) {
			System.out.println("Refernces are Equal");
		} else {
			System.out.println("Refernces are Unequal");
		}

		String string = new String("Ravana Brahma");
		char arr[]= string.toCharArray();

		int i=0;
		do {
			System.out.print(arr[i]+" | ");
			i++;
		}while(i<=arr.length-1);
	}
}
