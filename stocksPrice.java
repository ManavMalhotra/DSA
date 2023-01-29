import java.util.Arrays;
class stocksPrice {
    public static int maxProfit(int[] prices) {
        int minVal = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i<prices.length ; i++ ) {
            if (prices[i]<minVal) {
                minVal = prices[i];
            }else if(prices[i] - minVal > maxProfit){
                maxProfit = prices[i] - minVal;
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] a = {7,1,5,3,6,4};

        int b = maxProfit(a);

        System.out.println(b);
    }
}