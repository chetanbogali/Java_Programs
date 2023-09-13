package displayAllSubstringsOfGivenString;

public class DisplaySubstrings {

	void substring(String str) {
		
		for(int i=0;i<=str.length()-1;i++) {
			String temp = "";
			for(int j=i; j<=str.length()-1; j++) {
				temp = temp + str.charAt(j);
				System.out.println(temp);
			}
		}
	}
}
