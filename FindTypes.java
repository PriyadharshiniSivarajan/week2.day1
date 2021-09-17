package week2.day1;

public class FindTypes {

	public static void main(String[] args) {
		String str = "$$ Welcome to the 2nd class of automation $$";
		int letter = 0, number = 0, space = 0, specialCharacter = 0;
		char[] ch = str.toCharArray();
		for(int i=0;i<(ch.length);i++)
		{
			if(Character.isLetter(ch[i]))
			{
				letter=letter+1;
			}
			else if(Character.isDigit(ch[i]))
			{
				number=number+1;
			}
			else if(Character.isSpaceChar(ch[i]))
			{
				space=space+1;
			}
			else 
			{
				specialCharacter=specialCharacter+1;
			}
		}
		System.out.println("Character"+letter);
		System.out.println("Digit"+number);
		System.out.println("Space"+space);
		System.out.println("specialcharacter"+specialCharacter);
	}
	}

