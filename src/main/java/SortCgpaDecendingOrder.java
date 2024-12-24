import java.util.Arrays;
public class SortCgpaDecendingOrder {
    public static void main(String[] args) {
        double[] CGPA = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};
        double temp;
        for(int i=0;i<CGPA.length;i++)
        {
            for(int j= i+1;j<CGPA.length;j++)
            {
                if(CGPA[j]>CGPA[i])
                {
                    temp=CGPA[i];
                    CGPA[i]=CGPA[j];
                    CGPA[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(CGPA));

    }
}
