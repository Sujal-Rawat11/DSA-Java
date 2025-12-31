package Pattern.Part2;

public class Hollow_Rectangle{
    public static void hollow_rectangle(int tolrows, int tolcols){
        //outer loops
        for(int i=1;i<=tolrows; i++){
            //innerloop
            for(int j=1;j<=tolcols;j++){
                //cell - (i,j)
                if(i==1||i == tolrows || j == 1|| j == tolcols){
                    //boundary cells
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        hollow_rectangle(4, 5);
    }
}
