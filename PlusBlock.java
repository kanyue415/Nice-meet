package loop;

public class PlusBlock {
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

    public static void printCircleCenter(int width, int high, int r) {
//        int r=15;//圆形的半径
//        for (int y = 0; y <= 2 * r; y += 2) {//y的步长为2,改变y的步长可以将圆形变成椭圆
//            int x = (int)Math.round(r - Math.sqrt(2 * r * y - y * y));
//            int len = 2 * (r - x);
//            for (int i = 0; i <= x; i++) {
//                System.out.print(' ');
//            }
//            System.out.print('0');
//            for (int j = 0; j <= len; j++) {
//                System.out.print('0');
//            }
//            System.out.println('0');
//        }
        int center_x = width;
        int center_y = high;

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
        printPlusBlock(20, 10);
        System.out.println();
        System.out.println();
        System.out.println();
        printCircleCenter(15, 10, 7);
    }
}
