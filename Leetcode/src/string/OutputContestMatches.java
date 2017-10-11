package string;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem 544
 * 
 * @author Administrator
 *
 */

public class OutputContestMatches {
    public String findContestMatch(int n) {
        List<String> list = new ArrayList<>();
        
        for(int i=1;i<=n;i++)
        {
            list.add(i+"");
        }
        
        while(list.size()>1)
        {
            List<String> tmp = new ArrayList<>();
            for(int i=0;i<list.size()/2;i++)
            {
                tmp.add("("+list.get(i)+","+list.get(list.size()-i-1)+")");
            }
            list = tmp;
            System.out.println(list);
        }
        
        return list.get(0);
    }
}
