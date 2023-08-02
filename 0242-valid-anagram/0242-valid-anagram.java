class Solution {
    public boolean isAnagram(String s, String t) {
        
       return getSortedString(s).equals(getSortedString(t));
    }
   
   private String getSortedString(String s) {
       return s.chars().mapToObj(c -> (char)c).sorted().map(String::valueOf).collect(Collectors.joining());
   }

//         Map<Character, Integer> countS = new HashMap<>();
//         Map<Character, Integer> countT= new HashMap<>();
        
//         if(s.length() != t.length()){
//             return false;
//         }
        
//         for(int i = 0; i< s.length(); i++){
            
//             if (countS.containsKey(s.charAt(i))){
//                 countS.put( s.charAt(i), countS.get(s.charAt(i)) + 1);
//             } else{
//                 countS.put( s.charAt(i), 1);
//             }
            
//             if (countT.containsKey(t.charAt(i))){
//                 countT.put( t.charAt(i), countT.get(t.charAt(i)) + 1);
//             } else{
//                 countT.put( t.charAt(i), 1);
//             }
            
//         }
        
//         for(char k: countS.keySet()){
//             if(!countS.get(k).equals(countT.get(k))) return false;
//         }
        
        // return true;

    
}