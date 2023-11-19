//Given a string, compute recursively a new string where all 'x' chars have been removed.
//Sample Input 1 :
// xaxb
// Sample Output 1:
// ab
// Sample Input 2 :
// abc
// Sample Output 2:
// abc
import java.util.*;
class RemoveX{
    public static String removeX(String input){
		// Write your code here
		return removeX(input,0,input.length()-1);
	}
	public static String removeX(String input,int start,int end){
		if(start>end){
			return input ;
		}
		if(input.charAt(start)=='x'){
			String ans=input.substring(0,start)+ input.substring(start+1);
			return removeX(ans,start,end-1);
		}
		return removeX(input,start+1,end);
	}

    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(removeX(input));
	}
}