public class Solution{  
    public static int findUnique(int[] arr){
    int count,val=0;
        if (arr.length==1)
        {
            return arr[0];
        }
        outer:for (int i=0;i<arr.length;i++)
        {
            count=1;
           
            inner:for (int j=0;j<arr.length;j++)
            {
                if ((arr[i] == arr[j]) && (i != j))
                {
                    count=count+1;
                }
                
                if (count==2)
                {
                    break inner;
                }
            }
            
            if (count==1)
            {
                val=arr[i];
                break outer;
            }
        }
        return val;
    }
}