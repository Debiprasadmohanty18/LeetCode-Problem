
public class BestTimeToBuyAndSellStock {

	public static void main(String[] args) {
		int[] prices = {7,6,4,3,2};
		System.out.println(maxProfit(prices));

	}
	
	public static int maxProfit(int[] prices) 
	{
		int buyStock = prices[0];
		int currentProfit = 0;
		int profit = 0;
        for(int i=1;i<prices.length;i++) 
        {
			if(buyStock > prices[i])
			{
				buyStock = prices[i];
			}
			else
			{
				currentProfit = prices[i] - buyStock;
				
				if(currentProfit > profit)
				{
					profit = currentProfit;
				}
			}
		}
        return profit;
    }

}
