package uk.ac.belfastmet.mla.domain;

public class StaticMethods {
	
	public static String wordSeparator(String constituency){
		
		String word = constituency.substring(0,1);
		
		for(int i = 1 ; i < constituency.length() ; i++){
			if(constituency.substring(i,1).equals(constituency.substring(i,1).toLowerCase())) {
				word += constituency.substring(i,1);
			}
			else {
				word += " ";
				word += constituency.substring(i, constituency.length() - i);
			}
		}
		
		return word;
		
	}
}
