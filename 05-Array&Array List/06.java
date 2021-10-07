class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> result=new ArrayList<>();
        int temp;
        for (int i=0;i<candies.length;i++){
            temp=candies[i]+extraCandies;
            for(int j=0;j<candies.length;j++){
                if(candies[j]>temp){
                    result.add(false);
                    break;
                }
                if(j==candies.length-1){
                    result.add(true);
                    break;
                }
            }
        }
        return result;
    }
}




//             DEEPAK BHAIYYA CODE //

//class Solution {
//    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
//        ArrayList<Boolean> res = new ArrayList<>();
//        for(int i=0;i<candies.length;i++)
//        {
//            int maxNum=0,temp;
//            maxNum=candies[i]+extraCandies;
//            temp=candies[i];
//            candies[i]=maxNum;
//            int maxVal = Arrays.stream(candies).max().getAsInt();
//            if(maxVal==candies[i])
//                res.add(true);
//            else
//                res.add(false);
//            candies[i]=temp;
//        }
//        return res;
//    }
//}