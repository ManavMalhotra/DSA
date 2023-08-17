class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for(int i =0; i<operations.length;i++){
            String s1 = operations[i];
            if(s1.charAt(1) == '-'){
                x--;
            }else{
                x++;
            }
        }
        return x;
    }
}