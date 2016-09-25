public class Solution {
    public void rotate(int[] a, int k) {
        
        k=k%a.length;
        a=reverse(a,0,a.length-1);
        a=reverse(a,0,k-1);
        a=reverse(a,k,a.length-1);
       
    }
    
    public int[] reverse (int a[],int i,int j){
         
         while(i<j){
             int temp=a[i];
             a[i]=a[j];
             a[j]=temp;
             i++;
             j--;
         }
         return a;
    }
}