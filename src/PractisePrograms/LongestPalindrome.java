package PractisePrograms;

public class LongestPalindrome {

	public static void main(String[] args) {
		String str = "@@@@@@#@@@@@@@@%@@@@@@";
		String hold="",pal="";
		int len = str.length();
		int longestLen = 0;
		StringBuilder sb;
		if(str.length()<=2) {
			System.out.println(str);
		}
		for(int i=0;i<len;i++) {
			for(int j=i+1; j<len; j++) {
				hold = str.substring(i,j);
				if(new StringBuilder(hold).reverse().toString().equals(hold) && hold.length()>longestLen && hold.length()>2) {
					pal = hold;
					longestLen = pal.length();
				}
			}
		}
		System.out.println(pal);
	}

}
