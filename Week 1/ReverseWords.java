class Solution {
    public String reverseWords(String s) {
        
        if(s.length()<=1)
            return s;
        
        StringBuffer rev=new StringBuffer();
        int start=0;
        for(int i=0;i<s.length();i++)
        {
            
            if(s.charAt(i)==' ')
            { 
                StringBuffer sb=new StringBuffer(s.substring(start,i));
                rev.append(sb.reverse());
                rev.append(" ");
                start=i+1;
            }
               
        }
        StringBuffer sb=new StringBuffer(s.substring(start,s.length()));
         rev.append(sb.reverse());
        return rev.toString();
    }
}