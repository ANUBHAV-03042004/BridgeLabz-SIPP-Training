public class ProfitAndLossInNumberAndPercentage {
    public static void main(String[] args) {
//    	input cost price
        int costPrice = 129;
//        input selling price
        int sellingPrice = 191;
// profit calculator
        int profit = sellingPrice - costPrice;
//        profit percentage calculator
        double profitPercentage = (profit / (double) costPrice) * 100;

        System.out.println("The Cost Price is INR " + costPrice + " and the Selling Price is INR " + sellingPrice + "\n"
                         + "The Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage);
    }
}