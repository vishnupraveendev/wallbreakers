class Solution {
    public int[][] flipAndInvertImage(int[][] a) {
        
        for(int i=0;i<a.length;i++)
        {
           int j=0;
            int k=a[i].length-1;
            while(j<k)
            {
                int temp=a[i][j];
                a[i][j++]=a[i][k];
                a[i][k--]=temp;
        
             }
        for(j=0;j<a[i].length;j++)
            {
                a[i][j]=a[i][j]^1;
            }
     
        }
           return a;
    }
}