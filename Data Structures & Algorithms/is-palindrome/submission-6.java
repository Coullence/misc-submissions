class Solution {
    public boolean isPalindrome(String s) {
        if(s == null) return false;
        s = s.replaceAll("\\s+","");
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
        if(s.length() == 0 || s.length() == 1) return true;
        int i=0;
        int j=s.length();
        char[] arr = s.toCharArray();
        while(i<=j){
            if(arr[i]!= arr[j-1]){
                return false;
            }else{
                i++;
                j--;
            }
        }
        return true;
    }
}
