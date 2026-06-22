class Solution:
    def maxProfit(self, prices: list[int]) -> int:
        costprice = float('inf') 
        max_profit = 0 
        
        for price in prices:
            if price < costprice:
                costprice = price
                
            profit = price - costprice 
            max_profit = max(max_profit, profit) 
            
        return max_profit
        
        
        