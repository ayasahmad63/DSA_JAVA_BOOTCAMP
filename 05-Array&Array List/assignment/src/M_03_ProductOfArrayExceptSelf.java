import java.util.ArrayList;

public class M_03_ProductOfArrayExceptSelf {

    public static void main(String[] args) {

//          We Solve this question with time complexity o(n).

         int[] nums= {1,2,3,4};
         int[] answer = new int[nums.length];

//      Division Multiplication Method
//              Multiply Each term and store in array and divide it by individually
//               Check for end case of 0.
//                  In this solution the time complexity is o(n*n) and it is division method;

//
//        int multiply=1;
//        ArrayList<Integer> zeroindex=new ArrayList<>();
//         for(int i=0;i<nums.length;i++)
//         {
//             if(nums[i]!=0) {
//                 multiply *= nums[i];
//
//             }else{
//                 zeroindex.add(i);
//             }
//         }
//        if(zeroindex.size()>0){
//        for(int i=0;i< zeroindex.size();i++){
//           answer[zeroindex.get(i)]=multiply;
//        }}
//        else {
//            for(int i=0;i<answer.length;i++){
//                answer[i]=multiply/nums[i];
//            }
//        }




















//        Now in this solution we make two array first for left consecutive multiplication and second for   right consecutive
//             Time Complexity=o(n) and space complexity=0(n)


//
//        int[] leftmul=new int[nums.length];
//        int[] rightmul=new int[nums.length];
//
//        leftmul[0]=nums[0];
//        for(int i=1;i< nums.length;i++){
//            leftmul[i]=nums[i]*leftmul[i-1];
//
//        }
//
//        rightmul[nums.length-1]=nums[nums.length-1];
//        for(int i= nums.length-2;i>= 0;i--){
//            rightmul[i]=nums[i]*rightmul[i+1];
//
//        }
//
//         answer[0]=rightmul[1];answer[answer.length-1]=leftmul[leftmul.length-2];
//         for(int i=1;i< answer.length-1;i++){
//             answer[i]=leftmul[i-1]*rightmul[i+1];
//         }











//         In this we cannot make any other matrix

//           Incomplete
//
//        answer[nums.length-1]=nums[nums.length-1];
//        for(int i= nums.length-2;i>= 0;i--){
//            answer[i]=nums[i]*answer[i+1];
//
//        }
//        for (int i=0;i< nums.length;i++){
//            System.out.print(" " +answer[i]);
//        }
//        System.out.println(" ");
//        for (int i=0;i< nums.length;i++){
//            System.out.print(" " +nums[i]);
//        }
//        System.out.println(" ");
//        int prod=1;
//        for(int i=1;i< answer.length-2;i++){
//
//
//            answer[i]=prod*answer[i+1];
//            System.out.print(" " +prod);
//            prod=prod*nums[i-1];
//
//        }answer[answer.length-1]=prod;
//
//        System.out.println(" ");
//        for (int i=0;i< nums.length;i++){
//            System.out.print(" " +answer[i]);
//        }
//
//







    }


}
