//find all Indices where x is present in input array and save indexes in the output array
import java.util.*;
class AllIndices{
    public static int[] allIndexes(int input[], int x) {
		int count=0;
		for(int i=0;i<input.length;i++){
			if(input[i]==x){
				count++;
			}
		}
		int indices[]=new int[count];
		return allIndexes(input,x,0);
		
	}
	public static int[] allIndexes(int input[],int x,int startInd){
		if(startInd==input.length){
			int[] output=new int[0];
			return output;
		}
		
		
		int [] smallans= allIndexes(input,x,startInd+1);
		if(input[startInd]==x){
			int[] answer=new int[smallans.length+1];
			answer[0]=startInd;
			for(int i=0;i<smallans.length;i++){
				answer[i+1]=smallans[i];
			}
			return answer;
		}
		else{
			return smallans;
		}
	
	}
    static Scanner s = new Scanner(System.in);
	
	public static int[] takeInput(){
		int size = s.nextInt();
		int[] input = new int[size];
		for(int i = 0; i < size; i++){
			input[i] = s.nextInt();
		}
		return input;
	}
	
	public static void main(String[] args) {
		int[] input = takeInput();
		int x = s.nextInt();
		int output[] = Solution.allIndexes(input, x);
		for(int i = 0; i < output.length; i++) {
			System.out.print(output[i] + " ");
		}
	}
}