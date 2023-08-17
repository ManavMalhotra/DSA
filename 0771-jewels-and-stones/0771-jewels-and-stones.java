class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int num = 0;
        for(int i = 0; i < stones.length(); i++){
            char c = stones.charAt(i);
            if(jewels.contains(String.valueOf(c))) num++;
        }
        
        return num;
    }
}