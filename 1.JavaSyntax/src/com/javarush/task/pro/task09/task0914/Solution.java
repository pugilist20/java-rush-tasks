
import java.util.Arrays;
import java.util.StringTokenizer;

/*
StringTokenizer
*/

public class Solution {
    public static void main(String[] args) {
        String packagePath = "java.util.stream";
        String[] tokens = getTokens(packagePath, "\\.");
        System.out.println(Arrays.toString(tokens));
    }

    public static String[] getTokens(String query, String delimiter) {
        //напишите тут ваш код
        StringTokenizer tokenizer = new StringTokenizer(query,delimiter);
        String [] res = new String [tokenizer.countTokens()] ;
        for (int i=0; i<tokenizer.countTokens(); i++){
            res[i]=tokenizer.nextToken();
        }
        return res;
    }
}