public class SecondHighestScore {
    public static void main(String[] args) {
        double[] CGPA = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};
        double max = CGPA[0];
        double SecondMax = CGPA[0];
        for (int i = 0; i < CGPA.length; i++) {
            if (max < CGPA[i]) {
                SecondMax = max;
                max = CGPA[i];

            }
            if(CGPA[i]>SecondMax && CGPA[i]<max)
            {
                SecondMax = CGPA[i];
            }
        }
        //System.out.println(max);
        System.out.println("Second highest score is : "+SecondMax);

    }
}
