class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        String s = "";
        
        for (int i = 0; i < strs[0].length(); i++)
        {
            char c = strs[0].charAt(i);
            int flag = 0;
            for (int j = 0; j < strs.length; j++)
            {
                if (i >= strs[j].length() || strs[j].charAt(i) != c){
                    flag = 1;
                    break;
                }
            }
            if (flag == 1){
                break;
            }
            else{
                s = s + c;
            }
        }
        
        return s;
        
    }
}
