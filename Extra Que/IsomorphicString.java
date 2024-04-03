//Two strings s and t are isomorphic if the characters in s can be replaced to get t.
//leetcode 205
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        //indexOf -> returns the ist index of any char and if the ist index of both the strings do not match means the string are not isomorphic in O(n);
        for(int i=0;i<s.length();i++){
            if(s.indexOf(s.charAt(i))!=t.indexOf(t.charAt(i))){
                return false;
            }
        }
        return true;
    }
}