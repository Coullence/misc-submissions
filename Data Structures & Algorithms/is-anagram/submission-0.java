class Solution {
    public boolean isAnagram(String s, String t) {
        if(s==null || t==null) return false;
        if(s.length() != t.length()) return false;

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        int i = 0;
        int j = 0;

        while(i<sArray.length){
            if(sArray[i] != tArray[j]){
                return false;
            }else{
                i++;
                j++;
            }
        }
        return true;
    }
}
