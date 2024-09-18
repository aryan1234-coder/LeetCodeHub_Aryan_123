class Solution {
    public int findMinDifference(List<String> timePoints) {


        int[] totalminutes=new int[timePoints.size()];
        int ans=Integer.MAX_VALUE;

        for(int i=0;i<timePoints.size();i++){
           String time=timePoints.get(i);

           int hh=Integer.parseInt(time.substring(0,2));
           int mm=Integer.parseInt(time.substring(3));
           totalminutes[i]=hh*60+mm;

        }
        Arrays.sort(totalminutes);

        for(int j=0;j<totalminutes.length-1;j++){
            ans=Math.min(ans,totalminutes[j+1]-totalminutes[j]);
        }

        ans=Math.min(ans,24*60-(totalminutes[totalminutes.length-1]-totalminutes[0]));
        return ans;

        
    }
}