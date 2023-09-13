package frequencyOfEveryChractersInString;

public class CharactersCount {

	void count(String str) {
		
		int charCount[] = new int[256];
		for(int i=0;i<=str.length()-1;i++) {
			char c = str.charAt(i);
			
			if(c != ' ') {
				charCount[c]++;
			}
		}
		for(int i=0;i<=charCount.length-1;i++) {
			if(charCount[i] > 0) {
				System.out.println((char)i+" ==> "+charCount[i]);
			}
		}
	}
}
