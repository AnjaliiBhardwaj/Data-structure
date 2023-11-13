//Return first index of index of integer x; if not present return -1
import java.util.*;
class FirstIndex{
    public static int firstIndex(int input[], int x) {
        //fxn overloading
		return firstIndex(input,x,0);
	}
    //fxn overloading
	public static int firstIndex(int input[],int x,int startInd){
		if(startInd>=input.length-1){
			if(input[startInd]!=x){
				return -1;
			}
			else{
				return startInd;
			}
		}
		if(input[startInd]==x){
			return startInd;
		}

		int ans=firstIndex(input,x,startInd+1);
		return ans;
		
	}
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int input[]=new int[size];
        for(int i=0;i<size;i++){
            input[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        System.out.print(firstIndex(input,x));
    }
}