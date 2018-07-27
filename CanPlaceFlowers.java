class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n==0)return true;
        int length = flowerbed.length;
        if(length<2){
            if(flowerbed[length-1]==0 && n<=1)return true;
            else return false;
        }
        
        if(length>=2){
            if(flowerbed[0]==0 && flowerbed[1]==0){
                flowerbed[0]=1;
                n--;
            }
            if(flowerbed[length-1]==0 && flowerbed[length-2]==0){
                flowerbed[length-1]=1;
                n--;
            }
            for(int i=1;i<length-1;i++)
            {
                if(flowerbed[i-1]==0 && flowerbed[i] ==0 && flowerbed[i+1]==0){
                    flowerbed[i]=1;
                    n--;
                }
            }
        }
        if(n<=0)return true;
        else return false;
    }
}