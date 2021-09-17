package week2.day1;

public class PalindromeStrings {
	public static void main(String[] args) {
		String str1="MADAM";
		String str2="";
		char[] q = str1.toCharArray();
		for (int i =(q.length)-1;i>=0; i--) {
			str2=str2+q[i];
		}
		
		if(str2.equals(str1)) {
			System.out.println(" palindrome");
		}else {
			System.out.println(" not palindrome");
		}
	}
	}
	
