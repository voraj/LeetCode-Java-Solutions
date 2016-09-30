/* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int low=1;
        int high=n;
        int mid;
        while(low<=high){
            mid=low+(high-low)/2;
            int g=guess(mid);
            if(g==0)
                return mid;
            if(g==-1)
                high=mid-1;
            if (g==1)
                low=mid+1;
            
        }
        return -1;
    }
}