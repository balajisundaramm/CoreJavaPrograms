public class Vowels{
	public static void main(String[] args) {
		//System.out.println(findVoewel("Alpha numerical Object"));
		System.out.println(findconsonants("Abcgt vowels"));
		
	}
	public static int findVoewel(String b) {
		int count=0;
		String a=b.toLowerCase();
		for (int i=0;i<a.length();i++) {
			if (a.charAt(i)=='a'|| a.charAt(i)=='e' || a.charAt(i)=='i' || a.charAt(i)=='o' ||a.charAt(i)=='u') {
				count++;
			}
		}
		return count;
	}

	public static int findconsonants(String b) {
		int count=0;
		String a=b.toUpperCase();
		for (int i=0;i<a.length();i++) {
			for (char c=65;c<91;c++) {
				if (a.charAt(i)==c){
					if (a.charAt(i)!='A' && a.charAt(i)!='E' && a.charAt(i)!='I' && a.charAt(i)!='O' && a.charAt(i)!='U') {
						count++;
					}
				}
			}
		}
		return count;
	}
}