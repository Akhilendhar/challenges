package task2;

import java.util.Scanner;
import java.util.StringTokenizer;

@SuppressWarnings("unused")
class LongestPalindromeFinder {
	public static void main(String args[]) {
		// TODO Auto-generated method stub
		String str1 = "hah harsha madam ded";
		StringTokenizer s = new StringTokenizer(str1);
		// System.out.println("No.of tokens in given string are " +
		// s.countTokens());
		while (s.hasMoreElements()) {
			palindrome(s.nextToken());
		}
		System.out.println();
		sizeOfString(str1);
	}

	public static void palindrome(String str) {
		String revstring = "";

		for (int i = str.length() - 1; i >= 0; --i) {
			revstring += str.charAt(i);
		}

		// System.out.println(revstring);

		if (revstring.equalsIgnoreCase(str)) {
			System.out.println(str + " is a Palindrome");

		}

	}

	static public void sizeOfString(String s) {
		String str = s;
		char ch = ' ';
		int len = str.length(), l;
		int min = len, max = 0;
		String shortest_word = "", longest_word = "", word = "";
		for (int i = 0; i < len; i++) {
			ch = str.charAt(i);
			if (ch != ' ') {
				word += ch;
			} // if ends
			else {
				l = word.length();
				if (l < min) {
					min = l;
					shortest_word = word;
				} // if ends
				if (l > max) {
					max = l;
					longest_word = word;
				}
				word = "";
			}
		}
		System.out.println(shortest_word + " is smallest palindrome");
		System.out.println(longest_word + " is largest palindrome");
	}
}
