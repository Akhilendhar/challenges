package task2;

import java.util.Scanner;
import java.util.StringTokenizer;

@SuppressWarnings("unused")
class LongestPalindromeFinder {
public static void main(String[] args) {
String str = "aba abcba abcdcba abcd";
ArrayList<String> list = new ArrayList<>();
String[] words = str.split("\\s");

for (String w : words) {
String original = w;

String reverse = "";
int length = original.length();

for (int i = length - 1; i >= 0; i--) {

reverse = reverse + original.charAt(i);
}

if (original.equals(reverse)) {
System.out.println(original + " is a palindrome.");

list.add(original);

}

}
longestPalindromeString(list);
}

private static void longestPalindromeString(ArrayList<String> list) {

String minvalue = list.get(0);
String maxvalue = list.get(0);

for (int i = 1; i < list.size(); i++) {
if (minvalue.length() > list.get(i).length()) {

minvalue = list.get(i);
} else {
maxvalue = list.get(i);
}

}

System.out.println("minimum palindrome is :" + minvalue);
System.out.println("maximum palindrome is :" + maxvalue);

}
}
}
