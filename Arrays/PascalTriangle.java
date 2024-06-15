// Given an integer numRows, return the first numRows of Pascal's triangle.
// In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
import java.util.*;
class PascalTriangle{
    public static List <List<Integer>> helper(int n){
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> row1=new ArrayList<Integer>();
        if(n==0){
            return result;
        }
        row1.add(1);
        // First row is always [1]
        result.add(row1);
        if(n==1){
            return result;
        }

         for(int i=1;i<n;i++){
            //make prev list
            List<Integer> prev=result.get(i-1);
            List<Integer> currRow=new ArrayList<>();
            // First element is always 1
            currRow.add(1);
            for(int j=1;j<i;j++){
                currRow.add(prev.get(j)+prev.get(j-1));
            }
            //add 1 as last as it is fixed
            currRow.add(1);
            result.add(currRow);
         }
         return result;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // System.out.print(helper(n));
        List<List<Integer>> triangle = helper(n);
        
        for (List<Integer> row : triangle) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}