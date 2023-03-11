import java.util.ArrayList;
// import java.util.List;

class KidWithGreatestNumberOfCandies {

    public static void main(String[] args) {
        ArrayList<Boolean> result = new ArrayList<>();
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        result = kidsWithCandies(candies, extraCandies);
        System.out.println(result);
    }


    public static ArrayList<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = candies[0];
        ArrayList<Boolean> result = new ArrayList<>();
        //Finding the maximum value
        for(int i=0; i<candies.length; i++){
            if(candies[i] >= max){
                max = candies[i];
            } 
        }

        for(int i=0; i<candies.length; i++){
            if((candies[i] + extraCandies) > max){
                result.add(true);
            }else{
                result.add(false);
            }
        }

        return result;
    }
}