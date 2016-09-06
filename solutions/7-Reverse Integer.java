//7. Reverse Integer

public class Solution {
   public int reverse(int x) {
    boolean isNegative = false;
     int result = 0;
     if (x < 0) {
         isNegative = true;
            x = x*-1;
        }

  while (x > 0) {
        if(result > Integer.MAX_VALUE /10  )
            return 0;
        result= result * 10 + x % 10;
         x = x / 10;
         
  }
  if (isNegative)
         result = -result;
  return result;
 }
}