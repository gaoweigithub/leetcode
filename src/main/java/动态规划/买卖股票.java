package 动态规划;

public class 买卖股票 {

    public static void main(String[] args) {
        买卖股票 dd = new 买卖股票();

        System.out.println(dd.maxProfit(new int[]{1,4,2}));
    }

    public int maxProfit(int[] prices) {
        if (prices.length < 1){
            return 0;
        }

        int min = prices[0];
        int max = 0;
        for (int i = 1; i < prices.length; i++) {
            max = max(max,prices[i] - min);
            min = min(min,prices[i]);
        }
        return max;
    }
    int min(int a,int b){
        return a>b?b:a;
    }
    int max(int a,int b){
        return a>b?a:b;
    }
}
