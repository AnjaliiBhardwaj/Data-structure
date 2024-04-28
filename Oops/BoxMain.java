public class BoxMain{
    public static void main(String[] args){
        BoxWeight box3=new BoxWeight();

        System.out.println(box3.h+" "+ box3.weight);
        Box box5=new BoxWeight(2,3,4,8);
        //here only the type of reference var which determines the val
        System.out.print(box5.w);

        BoxPrice box=new BoxPrice(5,8,200);
    }
}