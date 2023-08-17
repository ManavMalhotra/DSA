class Solution {
    public int mostWordsFound(String[] sentences) {
        int temp = 0;

        int max = 0;
        for (int i = 0; i < sentences.length; i++) {
            // System.out.println(sentences[i]);
            String sb = new String(sentences[i]);

            for (int j = 0; j < sb.length(); j++) {
                if (sb.charAt(j) == ' ') {
                    temp++;
                }
            }

            if (temp > max) {
                max = temp;
            }

            temp = 0;
        }

        
        
        return max+1;
        
    }
}