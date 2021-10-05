public class Q_04_RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts={{2,8,7},{7,1,3},{1,9,5}};
        int maximumWealth=maximumWealth(accounts);
        System.out.println(maximumWealth);

    }
    static int maximumWealth(int[][] accounts){
        int maxWealth=0,sum=0;
    for(int i=0;i<accounts.length;i++)
    {
        for(int j=0;j<accounts[i].length;j++) {
          sum+=accounts[i][j];
        }
        if(sum>maxWealth){
            maxWealth=sum;
        }
        sum=0;
    }

    return maxWealth;
   }

}
