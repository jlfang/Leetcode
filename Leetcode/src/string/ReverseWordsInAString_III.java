package string;

/** 
 *  Problem 557
 * 
 *  Given a string, you need to reverse the order of characters 
 *  in each word within a sentence while still preserving whitespace 
 *  and initial word order.
 **/
public class ReverseWordsInAString_III {
    public String reverseWords(String s) {
        String words[] = s.split(" ");
        StringBuilder sb = new StringBuilder();
        
        for(String word : words)
        {
            sb.append(new StringBuffer(word).reverse().toString()+" ");
        }
        return sb.toString().trim();
    }
}
