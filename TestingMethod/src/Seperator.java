
public class Seperator {
	
	public static String wordSeparator(String constituency){
		
		String word = constituency.substring(0,1);
		
		int i = 1;
		
		while(constituency.substring(i,1).equals(constituency.substring(i,1).toLowerCase())) {
			word += constituency.substring(i,1);
			i++;
		}
		 
		word += " ";
		word += constituency.substring(i, constituency.length() - i - 1);
		
		return word;
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(wordSeparator("HelloWorld"));

	}

}
