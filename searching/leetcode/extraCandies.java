import java.util.ArrayList;
import java.util.List;

public class extraCandies {
    class Solution {
        public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
            int max=Integer.MIN_VALUE;
            List<Boolean> list= new ArrayList<Boolean>();
            //finding max for comparing;
            for(int each: candies){
                if(each>max){
                    max=each;
                }
            }
            //after finding max adding the value of extra candy to each element and 
            // for(int i=0;i<candies.length;i++){
            //     candies[i]=candies[i]+extraCandies;       
            //     if(candies[i]>=max){
            //         list.add(true);
            //     }else{
            //         list.add(false);
            //     }
            // }
            // // or
            for(int i=0;i<candies.length;i++){
                list.add(candies[i]+extraCandies>=max);
            }
            return list;
        }
    }
}
