class Solution {
    public boolean isPalindrome(int x) {
        
        boolean flag = false;
        
        if(9<x){
            String temp = Integer.toString(x);
            int len = temp.length();
            int[] arr = new int[len];

            for(int i=0; i<len; i++){
                arr[i] = temp.charAt(i);
            }

            for(int j=0; j<len/2; j++){
                if(arr[j]==arr[len-j-1]){
                    flag = true;
                } else{
                    flag = false;
                    break;
                }
            }
        } else if(0<=x && x<=9) {
            flag = true;
        }
        
        
        return flag;
    }
}