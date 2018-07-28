class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int length = nums.length;
        List<Integer> odd =new ArrayList<Integer>();
        List<Integer> even = new ArrayList<Integer>();
        for(int i =0;i<length;i++){
            if(i%2 ==0) even.add(nums[i]);
            else odd.add(nums[i]);
        }
        int len = even.size();
        
        int res=0;
        for(int p=0;p<len;p++){
            if(even.get(p) <= odd.get(p)) res=res+even.get(p);
            else res=res+odd.get(p);
        }
        return res;
    }
}