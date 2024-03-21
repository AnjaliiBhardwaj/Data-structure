//we have variable num of columns
class JaggedArray{
    public static void main(String[] args ){
        //Step1 do not define columns
        int arr[][]=new int[4][];
        // by default col val will be null
        System.out.println(arr);
        //defining colm
        for(int i=0;i<arr.length;i++){
            arr[i]=new int[i+2];
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}