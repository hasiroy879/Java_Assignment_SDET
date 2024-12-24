import java.util.Scanner;
public class FindNumberOnBinarySearch {
    public static void main(String[] args) {
        double[] CGPA = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};
        double temp;
        int i,j;
        boolean status = false;
        for(i=0;i<CGPA.length;i++)
        {
            for(j= i+1;j<CGPA.length;j++)
            {
                if(CGPA[j]<CGPA[i])
                {
                    temp=CGPA[i];
                    CGPA[i]=CGPA[j];
                    CGPA[j]=temp;
                }
            }
        }
        //System.out.println(Arrays.toString(CGPA));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a CGPA : ");
        double number = scanner.nextDouble();
        // System.out.println(number);
        int left = 0;
        int right= CGPA.length - 1;
        while(left<=right)
        {
            int mid = left + (right-left)/2;
            if(CGPA[mid]==number)
            {
                status=true;
            }
            if(CGPA[mid]<number)
            {
                left=mid+1;
            }
            else
            {
                right=mid-1;
            }
        }
        if(status)
            System.out.println(number+ " is found");
        else
            System.out.println(number+ " is not found");

    }
}
