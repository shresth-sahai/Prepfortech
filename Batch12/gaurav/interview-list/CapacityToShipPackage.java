// https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/


class Solution {
    boolean loadBelt(int capacity, int[] weights, int days){
        int currentCapacity = capacity;
        int loadingTimeInDays = 0;        

        int i = 0;
        while( i < weights.length) {
            if(currentCapacity >= weights[i]) {
                currentCapacity -= weights[i];
                if( i == weights.length - 1) {
                    loadingTimeInDays++;
                }
            }

            if(i < weights.length-1 && currentCapacity < weights[i+1]) {
                currentCapacity = capacity;
                loadingTimeInDays++;
            }
            
            i++;
        }

        return loadingTimeInDays <= days;
    }
    
    public int shipWithinDays(int[] weights, int days) {
        int low = Arrays.stream(weights).max().getAsInt();
        int high = Arrays.stream(weights).sum();
        int ans = high;
        while(low < high)  {
            
            int mid = low + (high - low) / 2;
            boolean result = loadBelt(mid, weights, days);
            
            if(result) {
                high = mid;
                ans = mid;
            } else {
                low = mid + 1;
            }

            System.out.println(high);
        }
        
        return ans;
    }
}
