package loop;

public class PlusBlock {
    /**
     *
     * @param width width of the rectangle
     * @param high high of the rectangle
     */
    public static void printPlusBlock(int width, int high){
        for(int i =0; i<2*high+1; i++){
            for(int j = 0; j < 2*width+1; j++){
                if(i == high|| j == width){
                    System.out.print(" ");
                    continue;
                }
                System.out.print("#");
            }
            System.out.println();
        }

    }



    public static void main(String[] args) {
        printPlusBlock(20, 10);
    }
}
