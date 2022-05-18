//Using Two Pointers technique

public int maxOperations(int[] nums, int k) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==-1) continue;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]==-1) continue;
                if(nums[j]==(k-nums[i])){
                    count++;
                    nums[i]=-1;
                    nums[j]=-1;
                    break;
                }
            }
        }
        return count;
    }

//Time Complexity : O(n^2)
//Space Complexity : O(1)


//Using HashMaps

public int maxOperations(int[] nums, int k) {
        int count = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int res = k - nums[i];
            if(map.containsKey(res)){
                count++;
                if(map.get(res)==1) map.remove(res);
                else{
                    map.put(res,map.get(res)-1);
                }
            }else{
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            }
        }
        return count;
    }

//Time COmplexity : O(N)
//Space Complexity : O(N)
  
  
  
