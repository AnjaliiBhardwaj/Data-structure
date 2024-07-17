class LongestCommonPrefix{
    public String longestCommonPrefix(String[] strs) {
        //O(n⋅m), where 𝑛 n is the number of strings and m is the length of the shortest string. In the worst case, we compare each character of each string.
        if(strs.length==0){
            return "";
        }
        int n=strs.length;
        // int minLen=Integer.MAX_VALUE;
        // for(int i=0;i<n;i++){
        //     minLen=Math.min(minLen,strs[i].length());
        // }
        // String ans="";
        // for(int i=0;i<minLen;i++){
        //     char currCh=strs[0].charAt(i);
        //     for(int j=1;j<n;j++){
        //         if(strs[j].charAt(i)!=currCh){
        //             return ans;
        //         }
        //     }
        //      ans+=currCh;
        // }
        // return ans;

        //T.c -> O(nlogn)
        //S.c -> O(1)
        StringBuilder ans=new StringBuilder();
        Arrays.sort(strs);
        //get ist and last string
        char[] first=strs[0].toCharArray();
        char[] last=strs[strs.length-1].toCharArray();

        for(int i=0;i<first.length;i++){
            if(first[i]!=last[i]){
                break;
            }
            ans.append(first[i]);
        }
        return ans.toString();
    }
}