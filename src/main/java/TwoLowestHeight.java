import java.util.Scanner;
public class TwoLowestHeight {
    public static void main(String[] args) {
                int i;
                Scanner scanner = new Scanner(System.in);
                int [] heights = new int[10];
                System.out.println("Enter the height of 10 babies: ");
                for( i=0;i<10;i++)
                {
                    heights[i] = scanner.nextInt();
                }
                int min=heights[0];
                int Second_min=heights[0];
                for(i=0;i<10;i++) {
                    if (min > heights[i]) {
                        Second_min = min;
                        min = heights[i];
                    }
                    else if (heights[i]<Second_min && heights[i]>min)
                    {
                        Second_min= heights[i];
                    }
                }
                System.out.println();
                System.out.println("The two lowest height of babies are  : "+min+" and "+Second_min);


            }
        }
