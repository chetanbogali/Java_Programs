package removeDuplicatesFromString;

public class RemoveDuplicateCharacter {

	String Duplicate(String str) {

		String str2="";
		for(int i=0; i<=str.length()-1;i++) {
			if(!str2.contains(String.valueOf(str.charAt(i)))) {
				str2 = str2 + str.charAt(i);
			}
		}
		return str2;
	}
}
