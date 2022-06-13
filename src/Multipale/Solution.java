package Multipale;


class Solution {
    public int maxPower(String s) {
        int max = 1;
        int i,j;
        
        for(i=0,j=1; j<s.length(); j++){
            
            if(s.charAt(i)!=s.charAt(j)){
                max = Math.max(j-i,max);
                i=j;
            }
        }
       return Math.max(j-i,max); 
        
    }
    public static void main(String args[]) {
    	Solution s = new Solution();
    	int max =s.maxPower("aaaabcsd");
    }
}