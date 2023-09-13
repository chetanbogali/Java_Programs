package frequencyOfEveryChractersInString;

import java.util.Scanner;

public class Approach2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = scan.nextLine();
		scan.close();
		char arr[] = str.toCharArray();

		for(int i=0; i<=arr.length-1; i++) 
		{
			int count = 1;
			if(arr[i] != ' ') 
			{
				for(int j=i+1; j<=arr.length-1; j++) 
				{
					if(arr[i] == arr[j]) {
						count++;
//						arr[j] = ' ';
					}
				}
			}
			if(arr[i] != ' ') {
				System.out.println(arr[i]+" ==> "+count);
			}
		}
	}
}
