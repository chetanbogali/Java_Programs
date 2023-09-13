package stringPrograms;

public class ULCount {

	void UpperLowerCount(String str) {
		int ucount = 0;
		int lcount = 0;
		for(int i=0; i<=str.length()-1; i++) {
			if(Character.isLowerCase(str.charAt(i))) {
				lcount++;
			} else {
				ucount++;
			}
		}
		System.out.println("LOWER CASE COUNT= "+lcount);
		System.out.println("UPPER CASE COUNT= "+ucount);
	}
}
