//Given a string, compute recursively a new string where all appearances of "pi" have been replaced by "3.14".
import java.util.*;
class Replacepi{
    public static String replace(String input){
		// Write your code here
		return replace(input,0,input.length()-1);
	}
	public static String replace(String input,int start,int end){
		if(start>=end){
			return input;
		}
		if(input.charAt(start)=='p' && input.charAt(start+1)=='i'){
			String ans=input.substring(0,start) + "3.14" +input.substring(start+2);
			return replace(ans,start+2,end+2);
		}
		else{
			return replace(input,start+1,end);
		}
	}
    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(solution.replace(input));
	}
}