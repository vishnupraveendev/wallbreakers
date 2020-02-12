class Solution {
    public int titleToNumber(String s) {
       
        if(s.length()==0)
            return -1;
        int sum=0;
        int v=s.charAt(0);
        v=v-64;
        for(int i=0;i<s.length();i++)
        {
            sum*=26;
            sum+=s.charAt(i)-'A'+1;
        }
      
        return sum;
    }
}