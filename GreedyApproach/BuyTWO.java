import java.util.*;

public class BuyTWO {

    public static int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int total = prices[0] + prices[1];
        if (total <= money) {
            return money - total;
        } else {
            return money;
        }
    }

    public static void main(String[] args) {
        int[] prices = {1, 2, 2, 5, 7};
        int money = 10;

        int result = buyChoco(prices, money);
        System.out.println(result);
    }
}


//steps used in this approach   
//Find the two cheapest chocolates from a list of prices.
//Check if you have enough money to buy them.
//If yes: calculate how much money you will have left after buying them.
//If no: you keep your money.