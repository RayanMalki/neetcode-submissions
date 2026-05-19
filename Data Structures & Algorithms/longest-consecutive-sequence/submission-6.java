class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxValue = 0;

        if(nums.length ==0){
            return 0;
        }

        for(int i=0; i<nums.length; i++){
            map.put(nums[i],i);

        }
        for(int num: nums){
            int current=0;
            int currentLength=0;
            if(!map.containsKey(num-1)){
                current = num;
                currentLength = 1;

            }
            while (map.containsKey(current+1)){
                current++;
                currentLength++;
            }

            maxValue= Math.max(maxValue,currentLength);

        }

        return maxValue;


        
    }
}
