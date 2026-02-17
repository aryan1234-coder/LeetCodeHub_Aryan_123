class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> times = new ArrayList<>();


        for(int h = 0;h < 12;h++){
            
            for(int m = 0; m < 60;m++){
                if(Integer.bitCount(h) + Integer.bitCount(m) == turnedOn)
                    // times.add(String.format("%d:%02d", h, m));
                    times.add(h + ":" + (m < 10 ? "0" + m : m));
            }
        }
        return times;
    }
}

// check the bit in every hour and every minutes