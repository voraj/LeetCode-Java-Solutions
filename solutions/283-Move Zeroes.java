public class Solution {
    public void moveZeroes(int[] a) {
        int length=a.length;
        int index=0;
        for(int i=0;i<length;i++)
        {
            if(a[i]!=0)
                {
                    a[index]=a[i];
                    index++;
                }
        }
        while(index<length){
            a[index]=0;
            index++;
        }
        
        
    }
}