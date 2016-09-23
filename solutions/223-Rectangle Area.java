public class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        
        int area1=area(A, B,C, D);
        int area2=area(E,F,G,H);
        
        if(C<E || G<A || H<B || D<F )
            return area1+area2;
    
        int x1= Math.max(A, E);
        int y1= Math.max(B, F);
        int x2= Math.min(C, G);
        int y2= Math.min(D, H);
        return area1+area2-area(x1, y1,x2, y2);
    }
    
    
    public int area(int x1, int y1, int x2, int y2){
        return Math.abs(x1-x2)*Math.abs(y1-y2);
    }
}