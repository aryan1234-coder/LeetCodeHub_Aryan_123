class Solution {

    class Job{

        int startTimer;
        int endTimer;
        int maxProfit;

        Job(int startTimer,int endTimer, int maxProfit){

            this.startTimer=startTimer;
            this.endTimer=endTimer;
            this.maxProfit=maxProfit;

        }
    }
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {

        Job[] job=new Job[startTime.length];

        for(int i=0;i<startTime.length;i++){
            job[i]=new Job(startTime[i], endTime[i], profit[i]);
        }

        Arrays.sort(job, (a,b)-> a.endTimer-b.endTimer);

        int[] dp=new int[startTime.length];
        dp[0]=job[0].maxProfit;

        for(int i=1;i<startTime.length;i++){
            int skipFirst=dp[i-1];

            int next= findNext(job,i);
            int takeProfit= job[i].maxProfit;
            if(next>=0){
                takeProfit += dp[next];
            }

            dp[i]=Math.max(skipFirst,takeProfit);


        }


           return dp[startTime.length-1];

        
    }

    public int findNext(Job[] job, int index){
        int target=job[index].startTimer;
        int left=0;
        int right=index-1;
        int result=-1;

        while(left<=right){
            int mid=left+(right-left)/2;
            if(job[mid].endTimer<=target){
                result=mid;
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return result;
    }
}