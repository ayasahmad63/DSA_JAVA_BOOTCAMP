public class Buy_Sell_Stock {
    public static void main(String[] args) {
        int[] prices={7,1,4,3,2,1};

        int min_till_now=prices[0];
        int best_sell=0;
        for(int i=0;i<prices.length;i++){
            if(min_till_now>prices[i]){
                min_till_now=prices[i];
            }
            else if(best_sell<prices[i]-min_till_now){
                best_sell=prices[i]-min_till_now;
            }

        }
        System.out.println(best_sell);


    }
}
