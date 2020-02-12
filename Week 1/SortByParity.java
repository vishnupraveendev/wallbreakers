class Solution {
    public int[] sortArrayByParity(int[] A) {
        
        if(A.length==0||A.length==1)
        {
            return A;
        }
        int top=0;
        int bottom=A.length-1;
        int []EO=new int[A.length];
        for(int i : A)
        {
            if(i%2==0)
            {
                EO[top++]=i;
            }
            else
            {
                EO[bottom--]=i;
            }
        }
        return EO;
    }
}