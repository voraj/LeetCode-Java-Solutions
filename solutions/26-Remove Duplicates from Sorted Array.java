//26. Remove Duplicates from Sorted Array

public class Solution {
    public int removeDuplicates(int[] a) {
        int index=0;
        
        for(int i=1;i<a.length;i++){
            if(a[index]!= a[i])
            {
                index=index+1;
                a[index]=a[i];
            }
        }
        
        return index+1;
    }
}