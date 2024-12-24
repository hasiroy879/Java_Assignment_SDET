import java.util.Scanner;
public class FindMinMax {
    public static void main(String[] args) {
        int i;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = scanner.nextInt();
        int [] array = new int[size];
        System.out.println("Enter the elements of array: ");
        for( i=0;i<size;i++)
        {
            array[i] = scanner.nextInt();
        }
        for( i=0;i<size;i++)
        {
            System.out.print(array[i] + " ");
        }

        int max = array[0];
        int min = array[0];
        for (i = 0; i < size; i++) {
            if (max < array[i]) {
                max = array[i];
            } else if (array[i]<min)
            {
                min = array[i];
            }
        }
        System.out.println();
        System.out.println("Max number is "+max);
        System.out.println();
        System.out.println("Min number is "+min);
    }
}
