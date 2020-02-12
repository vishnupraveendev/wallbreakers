class Solution {
    public int[] plusOne(int[] digits) {
        
        if(digits.length==0)
            return new int[]{1};
        digits[digits.length-1]++;
        int carry=0;
        for(int i=digits.length-1;i>=0;i--)
        {
            if(digits[i]>9)
            {
                digits[i]=0;
               
                if(i>0)
                {
                    digits[i-1]++;
                }
                
            }
        }
        if(digits[0]==0)
        {
            digits[0]=0;
            int[] sum=new int[digits.length+1];
             sum[0]=1;
            for(int i=1;i<digits.length+1;i++)
            {
                sum[i]=digits[i-1];
            }
            return sum;
           
        }
        return digits;
        
        
    }
}