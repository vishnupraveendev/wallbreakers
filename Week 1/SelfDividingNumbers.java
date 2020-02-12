class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        
        List<Integer> l=new ArrayList<>();
        for(int i=left;i<=right;i++)
        {
           if(isDivisible(i))
           {
               l.add(i);
           }
        }
        return l;
    }
    private boolean isDivisible(int n)
    {
        int num=n;
        while(n!=0)
        {
            int div=n%10;  
            if(div==0)
            {
                return false;
            }
            if(num%div!=0)
            {
             return false;   
            }
            n=n/10;
              
        }
        return true;
        
    }
}