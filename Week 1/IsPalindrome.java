class Solution {
    public boolean isPalindrome(String s) {
        
        StringBuffer sb=new StringBuffer();
        if(s.length()==0)
            return true;
        
        for(int i=0;i<s.length();i++)
        {
            if(Character.isDigit(s.charAt(i))||Character.isLetter(s.charAt(i)))
            {
                sb.append(s.substring(i,i+1).toLowerCase());
            }
         }
        // System.out.println(sb)
        // System.out.println(sb.reverse());
       
       if(sb.toString().equals(sb.reverse().toString()))
           return true;
        return false;
    }
    
     
}