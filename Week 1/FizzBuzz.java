class Solution {
    public List<String> fizzBuzz(int n) {
        if(n==0)
            return null;
        
        List<String> l=new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            int flag=1;
            if(i%15==0)
            {
                l.add("FizzBuzz");
                continue;
            }
            if(i%3==0)
            {
                l.add("Fizz");
                 continue;
                
               
            }
            if(i%5==0)
            {
                l.add("Buzz");
                continue;
            
            }
            l.add(String.valueOf(i));
        }
      return l;  
    }
}