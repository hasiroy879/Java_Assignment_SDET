public class CountQuestion {
    public static void main(String[] args) {
       int fiveMarkQstn = 5;
       int tenMarkQstn = 10;
       int totalQstn = 15;
       int totalMark = 100;
       for(int qstnTen=0;qstnTen<totalQstn;qstnTen++)
       {
           int qstnFive = totalQstn - qstnTen;
           if((qstnFive*fiveMarkQstn + qstnTen*tenMarkQstn) == totalMark)
           {
               System.out.println("5 marks question is "+qstnFive);
               System.out.println("10 marks question is "+qstnTen);
           }

       }
    }
}
