class Solution {
    public int mySqrt(int x) {
        long low=0;
        long high=x;
        while(low+1 < high){
            long mid=low+(high-low) / 2;
            if(mid*mid == x)
                return (int)mid;
            else if(mid*mid < x)
                low=mid;
            else
                high=mid;
        }
        if(high*high ==x){
            return (int)high;
        }
        return (int)low;
    }
}
