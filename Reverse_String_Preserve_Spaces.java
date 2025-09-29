import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char[] ch1 = str.toCharArray();
		char[] ch2 = new char[ch1.length];
		for(int i = 0; i < ch1.length; i++) {
		if(ch1[i] == ' ') {
			ch2[i] = ' ';
			}
		}
		String str2 = str.replace(" ", "");
		StringBuilder sb = new StringBuilder (str2);
		sb.reverse();
		int j = 0;
		System.out.print("Reversed String: ");
		for(int i = 0; i < ch2.length; i++) {
			if(ch2[i] == ' ') {
				continue;
			}
  			else {
				ch2[i] = sb.charAt(j);
				j++;
			}
		}
		for(int i = 0; i < ch2.length; i++) {
				System.out.print(ch2[i]);
		}
	}
}
