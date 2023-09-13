package stringPrograms;

public class ConcatinatingStrings {

	public String concate(String str1, String str2) {
		if(str1.equals(str2)) {
			return str1.concat(str2);
		} else {
			return null;
		}
	}
}
