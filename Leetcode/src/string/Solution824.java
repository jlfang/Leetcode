package string;

import java.util.ArrayList;
import java.util.List;

public class Solution824 {
	public static String toGoatLatin(String S) {
        if(S==null || S.length()==0){
            return S;
        }
        
        List<Character> characters = new ArrayList<>();
        char[] vowel = {'a','e','i','o','u','A','E','I','O','U'};
        for(Character ch:vowel) {
        	characters.add(ch);
        }
         
        
        String[] strArray = S.split(" ");
        StringBuilder res = new StringBuilder();
        int count =1;
        
        for(String s : strArray) {
        	StringBuilder sb = new StringBuilder();
        	if(characters.contains(s.charAt(0))) {
        		sb.append(s);
        		sb.append("ma");
        	}
        	else if(!characters.contains(s.charAt(0))) {
        		sb.append(s.substring(1));
        		sb.append(s.charAt(0)).append("ma");
        		
        	}
        	for(int i=0;i<count;i++) {
        		sb.append("a");	
        	}
        	count++;
        	res.append(sb).append(" ");
        }
        
        return res.subSequence(0, res.length()-1).toString();
    }
	
	public static void main(String[] args) {
		String S = "I speak Goat Latin";
		
		String res = toGoatLatin(S);
		
		System.out.println(res);
		
	}
}
