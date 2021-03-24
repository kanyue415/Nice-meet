package loop;

public class Table {
    int high;
    int width;
    public Table(int width, int high){
        this.high = high;
        this.width = width;
    }

    public void getNumbers(){
        int num = 1;
        for (int i = 0; i<high; i++){
            for(int j = 0; j<=width*2; j++){
                if(j % 2 == 0){
                    System.out.print("|  ");
                }else {
                    System.out.printf("%2d  ", i*width+num);
                    num ++;
                }
            }
            num = 1;
            System.out.println();
        }
    }


}
