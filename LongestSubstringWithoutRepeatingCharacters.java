class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0;
        String max = "";
        String current = "";
        int pos;
        for(int i = 0;i<s.length();i++){
            if(current.indexOf(s.charAt(i)) != -1){
                if(current.length() >= max.length()){
                    max = current;
                }
                pos = current.indexOf(s.charAt(i));
                current = s.substring(start + current.indexOf(s.charAt(i))+1, i+1);
                start = start + pos + 1;
            }
            else{
                current = current + s.charAt(i);
            }
        }
        return max.length() > current.length()? max.length() : current.length();
    }
}
//         if(s.equals(""))return 0;
//         List<Integer> res = new ArrayList<Integer>();
//         char[] CharofS =s.toCharArray();
//         int length = CharofS.length;
//         int result =1;
//         for(int i =0; i<length;i++ )
//         {
//             int temp =1;
//             for(int j=i;j<length-1;j++)
//             {
//                 char[]temps= new char[j+1];
//                 for(int p=0;p<=j;p++){
//                     temps[p]=CharofS[p];
//                 }
//                 String mString=String.valueOf(temps);
//                 if(isequal(CharofS[j+1],mString)){
//                     temp++;
//                 }
//                 res.add(temp);
//                 if(!isequal(CharofS[j+1],mString)) {
//                     i=j;
//                     j=length;
//                 }
//             }
//         }
//         for(int p=0;p<res.size();p++)
//         {
//             if(result<res.get(p))result=res.get(p);
//         }
//         return result;
//     }

//     public boolean isequal(char target, String temps){
//         char[] CharofS =temps.toCharArray();
//         int length = CharofS.length;
//         for(int i=0;i<length;i++){
//             if(target ==CharofS[i])return false;
//         }
//         return true;
//     }