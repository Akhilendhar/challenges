package task2;

import java.util.Scanner;

public class RemovingCommonLetters {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		String s1;
		System.out.println("Enter the First String");
		s = sc.next();
		System.out.println("Enter the Second String");
		s1 = sc.next();
         int j;
		char[] ss = s.toCharArray();
		char[] ss1 = s1.toCharArray();

		for (int i = 0; i < ss.length; i++) {
			for (j = 0; j < ss1.length; j++) {
				if (ss1[j] == ss[i]) {
					ss1[j] = ' ';
					/* j--; */
				}
			}
		}
			String b=String.valueOf(ss1);
			System.out.println(b.replaceAll("\\s", ""));
			sc.close();
	
	
}
}
