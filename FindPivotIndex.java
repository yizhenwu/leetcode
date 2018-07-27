class Solution {
    public int pivotIndex(int[] nums) {
        int length = nums.length;
        if(length ==0)return -1;
        if(length ==1)return 0;
        int res0=0;
        for(int k=1;k<length;k++){
            res0=res0+nums[k];
        }
        if(res0 ==0)return 0;
        if(length==2){
            if(nums[1]==0)return 0;
        }
        
        for(int i=1;i<length; i++){
            int resLeft=0;
            for(int p =0;p<i;p++){
                resLeft=resLeft+nums[p];
            }
            int resRight=0;
            for(int q=i+1; q<length; q++){
                resRight=resRight+nums[q];
            }
            if(resLeft ==resRight)return i;
        }
        return -1;
    }
}