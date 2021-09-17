package week2.day1;

public class AnagaramStrings {

	public static void main(String[] args) {
		String str1 = "DORMITORY";
		String str2 = "DIRTYROOM";
		String str3 = "";
		char[] p = str1.toCharArray();
		char[] q = str2.toCharArray();
		if (p.length == q.length) {

			for (int i = 0; i < p.length; i++)

			{
				for (int j = 0; j < q.length; j++) {
					if (p[i] == q[j]) {
						str3 = str3 + p[i];
						q[j] = '\0';
						break;

					}
				}
			}
			if (str3.equals(str1)) {
				System.out.println(str1 + " is anagram");
			} else {
				System.out.println(str1 + " is not anagram");
			}

		}

	}

}
