//27. Remove Element

public class Solution {
    public int removeElement(int[] a, int val) {
        int length=a.length;
        int count=0;
        for(int i=0;i<length-count;i++){
            if(a[i]==val)
            {
                count++;
                a[i]=a[length-count];
                i--;
            }
        }
         return length-count;
    }
}