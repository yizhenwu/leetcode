class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> res=  new HashMap<Integer,Integer>();
        int length = nums.length;
        for(int i=0;i<length;i++){
            Integer count = res.get(nums[i]);
            if(count ==null)
                count =1;
            else
                count++;
            res.put(nums[i],count);
            if(res.get(nums[i])>length/2)
                return nums[i];
        }
        return 0;
    }
}