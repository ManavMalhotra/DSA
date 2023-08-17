import java.util.*;

class Solution {
    public String interpret(String command) {
        String str1 = command.replace("()", "o");
        String str2 = str1.replace("(al)", "al");
        return str2;
        
    }
}