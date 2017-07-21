package task2;

import java.util.Scanner;
import java.util.StringTokenizer;

@SuppressWarnings("unused")
public class Combtest {

	public static void main(String args[]) {

		String input = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to be patterned");
		try {
			input = sc.nextLine();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		String[] stringarray = input.split("\\s");
		int lenthoftoken;
		int lengthaftertoken = 0;
		String st = input.replaceAll("\\s+", "");
		for (int k = 0; k < stringarray.length; k++) {
			lenthoftoken = stringarray[k].length();
			System.out.println();
			for (int i = 0; i < lenthoftoken; i++) {
				for (int j = 0; j <= i; j++) {
					System.out.print(stringarray[k].charAt(j));

				}

				System.out.println();
			}

			lengthaftertoken = lengthaftertoken + lenthoftoken;
			/* System.out.println(p); */

			if (lengthaftertoken > lenthoftoken) {

				String str;

				System.out.println();

				if (lengthaftertoken >= st.length()) {

					str = st.substring(0);
				} else {
					str = st.substring(0, lengthaftertoken + 1);
				}
				for (int r = 0; r < lengthaftertoken; r++) {

					for (int t = 0; t <= r; t++) {
						System.out.print(str.charAt(t));
					}
					System.out.println();

				}
				sc.close();

			}

		}

	}
}
