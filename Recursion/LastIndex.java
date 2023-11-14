import java.util.*;
class LastIndex{
    public static int lastIndex(int input[], int x) {
		return lastIndex(input,x,input.length-1);
	}
	public static int lastIndex(int input[],int x, int lastInd){
		if(lastInd<=0){
			if(input[lastInd]==x){
				return lastInd;
			}
			return -1;
		}
		if(input[lastInd]==x){
			return lastInd;
		}

		int ans=lastIndex(input,x,lastInd-1);
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