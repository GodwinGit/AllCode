public class RecursiveStrings {

		public static void main(String[] args) {

			System.out.println(check("hellllllo"));

		}

		public static String check(String s) {

			for (int i = 0; i < s.length() - 1; i++) {

				if (s.charAt(i) == s.charAt(i + 1)) { // charAt: character at
														// position

					s = s.substring(0, i + 1) + '-'
							+ check(s.substring(i + 1, s.length()));

					// prints 0 to i, non inclusive i+1, i.e. 'hel'

					// continues with next part, from i+1 to rest of the string,
					// i.e. i=4 onwards

					// first method
					// recursive method calling itself again

					// substring: substance of that string

				}

			}

			return s;

		}

	}

