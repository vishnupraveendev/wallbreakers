class Solution {
    public String reverseVowels(String s) {
        
        Stack<Character> stk=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a'||s.charAt(i)=='u'||s.charAt(i)=='o'||s.charAt(i)=='i'||s.charAt(i)=='e'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')
            {
                stk.push(s.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder(s); 
        
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a'||s.charAt(i)=='u'||s.charAt(i)=='o'||s.charAt(i)=='i'||s.charAt(i)=='e'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')
            {
                sb.setCharAt(i, stk.pop());
            }
            
           
            
        }
         return sb.toString();
    }
}