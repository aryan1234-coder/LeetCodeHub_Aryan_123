// class Solution {
//     public int longestBalanced(int[] nums) {

//         int n = nums.length;
//         int result = 0;

//         for (int l = 0; l < n; l++) {
//             Set<Integer> seen = new HashSet<>();
//             int B = 0;

//             for (int r = l; r < n; r++) {
//                 int x = nums[r];

//                 if (!seen.contains(x)) {
//                     seen.add(x);

//                     if (x % 2 == 0) {
//                         B += 1;   // even
//                     } else {
//                         B -= 1;   // odd
//                     }
//                 }

//                 if (B == 0) {
//                     result = Math.max(result, r - l + 1);
//                 }
//             }
//         }

//         return result;
        
//     }
// }
import java.util.*;

class SegTree {
    int[] mn, mx, lazy;
    int n;

    SegTree(int n){
        this.n=n;
        mn=new int[4*n];
        mx=new int[4*n];
        lazy=new int[4*n];
    }

    void push(int i){
        if(lazy[i]!=0){
            for(int c: new int[]{2*i,2*i+1}){
                mn[c]+=lazy[i];
                mx[c]+=lazy[i];
                lazy[c]+=lazy[i];
            }
            lazy[i]=0;
        }
    }

    void add(int i,int L,int R,int l,int r,int v){
        if(r<L||R<l) return;
        if(l<=L&&R<=r){
            mn[i]+=v; mx[i]+=v; lazy[i]+=v;
            return;
        }
        push(i);
        int M=(L+R)/2;
        add(2*i,L,M,l,r,v);
        add(2*i+1,M+1,R,l,r,v);

        mn[i]=Math.min(mn[2*i],mn[2*i+1]);
        mx[i]=Math.max(mx[2*i],mx[2*i+1]);
    }

    int firstZero(int i,int L,int R,int ql,int qr){
        if(qr<L||R<ql) return -1;
        if(mn[i]>0||mx[i]<0) return -1;
        if(L==R) return L;

        push(i);
        int M=(L+R)/2;
        int x=firstZero(2*i,L,M,ql,qr);
        if(x!=-1) return x;
        return firstZero(2*i+1,M+1,R,ql,qr);
    }
}

class Solution {
    public int longestBalanced(int[] nums) {
        int n=nums.length;
        SegTree st=new SegTree(n);
        Map<Integer,Integer> last=new HashMap<>();
        int ans=0;

        for(int r=0;r<n;r++){
            int x=nums[r];
            int p=last.getOrDefault(x,-1);
            int w=(x%2==0)?1:-1;

            st.add(1,0,n-1,p+1,r,w);

            int l=st.firstZero(1,0,n-1,0,r);
            if(l!=-1) ans=Math.max(ans,r-l+1);

            last.put(x,r);
        }
        return ans;
    }
}
