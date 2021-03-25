import java.util.ArrayList;

public class TableTime {

    private int height;
    private int width;

    public TableTime(int height, int width) { 
        this.height = height;
        this.width = width;
    }
    public void getNumbers() {
        ArrayList<Integer> array = new ArrayList<Integer>(width * height);
        for (int a = 1; a <= width * height; a++) {                                                     
            array.add(a);
        }
        int count = 0;
        for (int i = 1; i <= height; i++) { 
            for (int j = 1; j <= width; j++) {
                if (count < 9) { 
                    if (j > 0 && j < width) { 
                        System.out.print("|   " + array.get(count) + "   ");
                        count++;
                    } else { 
                        System.out.print("|   " + array.get(count) + "   |");
                        count++;
                    }
                }
                else if (count >= 9 && count < 99) { 

                    if (j > 0 && j < width) { 
                        System.out.print("|   " + array.get(count) + "  ");
                        count++;
                    } else { 
                        System.out.print("|   " + array.get(count) + "  |");
                        count++;
                    }
                } else { 
                    if (j > 0 && j < width) { 
                        System.out.print("|   " + array.get(count) + " ");
                        count++;
                    } else { 
                        System.out.print("|   " + array.get(count) + " |");
                        count++;
                    }
                }
            }
            System.out.println(""); 
        }
    }
}
