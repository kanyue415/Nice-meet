package loop;

public class Circle {
    /**
     *
     * @param width width of the rectangle
     * @param high  high of the rectangle
     * @param r     radius of the circle
     */
    public static void printCircleCenter(int width, int high, int r) {
        for(int i =0; i<2*high+1; i++){
            for(int j = 0; j < 2*width+1; j++){
                int d = (int)Math.round(Math.sqrt(Math.pow(high-i, 2)+ Math.pow(width-j, 2)));

                if(i==high&&j==width){
                    System.out.print(" ");
                    continue;
                }
                else if(d <= r){
                    System.out.print("0");
                    continue;
                }
                System.out.print("#");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        printCircleCenter(10, 20, 5);
    }
}
