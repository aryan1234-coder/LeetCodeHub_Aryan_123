class Solution {
    public int nthUglyNumber(int n, int a, int b, int c) {


         long ab = lcm(a, b);
        long ac = lcm(a, c);
        long bc = lcm(b, c);
        long abc = lcm(a, bc);
        
        long left = 1, right = (long) 1e10;
        while (left < right) {
            long mid = left + (right - left) / 2;
            if (enough(mid, n, a, b, c, ab, ac, bc, abc)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return (int) left;
    }
    
    private boolean enough(long num, int n, int a, int b, int c, long ab, long ac, long bc, long abc) {
        long total = num / a + num / b + num / c - num / ab - num / ac - num / bc + num / abc;
        return total >= n;
    }
    
    private long lcm(long x, long y) {
        return x * (y / gcd(x, y));
    }
    
    private long gcd(long x, long y) {
        while (y != 0) {
            long temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }
    
        
    
}