//multiply 2 nos without using multiply operator 
import java.util.*;
class Multiplication{
	public static int multiplyTwoIntegers(int m, int n){
		// Write your code here
		if(n==0){
			return 0;
		}
		if(n>0){
			int ans=multiplyTwoIntegers(m,n-1);
		return( m+ans);
		}
		return -1;		
	
	}
    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		int n = s.nextInt();
		System.out.println(solution.multiplyTwoIntegers(m, n));
	}
}


