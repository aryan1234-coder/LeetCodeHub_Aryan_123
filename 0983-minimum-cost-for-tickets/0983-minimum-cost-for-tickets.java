// import java.util.*;

// class Solution {

//     public int sub(int[] days, int[] costs, int si) {
//         int n = days.length;

//         if (si >= n)
//             return 0;

//         // Buy 1-day pass
//         int costDay = costs[0] + sub(days, costs, si + 1);

//         int i;

//         // Buy 7-day pass
//         for (i = si; i < n && days[i] < days[si] + 7; i++);
//         int costWeek = costs[1] + sub(days, costs, i);

//         // Buy 30-day pass
//         for (i = si; i < n && days[i] < days[si] + 30; i++);
//         int costMonth = costs[2] + sub(days, costs, i);

//         return Math.min(costDay, Math.min(costWeek, costMonth));
//     }

//     public int mincostTickets(int[] days, int[] costs) {
//         return sub(days, costs, 0);
//     }
// }

import java.util.*;

class Solution {

    Integer[] dp;

    public int sub(int[] days, int[] costs, int si) {
        int n = days.length;

        if (si >= n)
            return 0;

        if (dp[si] != null)
            return dp[si];

        // 1-day pass
        int costDay = costs[0] + sub(days, costs, si + 1);

        int i;

        // 7-day pass
        for (i = si; i < n && days[i] < days[si] + 7; i++);
        int costWeek = costs[1] + sub(days, costs, i);

        // 30-day pass
        for (i = si; i < n && days[i] < days[si] + 30; i++);
        int costMonth = costs[2] + sub(days, costs, i);

        dp[si] = Math.min(costDay, Math.min(costWeek, costMonth));

        return dp[si];
    }

    public int mincostTickets(int[] days, int[] costs) {
        dp = new Integer[days.length];
        return sub(days, costs, 0);
    }
}