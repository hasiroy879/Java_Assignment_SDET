import java.util.Scanner;

public class CheckBinaryOrNot {
    public static void main(String[] args) {
        int i;
        boolean status = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        String binary = scanner.next();
        // System.out.println(binary);
        for(i=0;i<binary.length();i++)
        {
            if(binary.charAt(i)=='0' || binary.charAt(i)=='1')
            {
                status=true;
            }
        }
        if(status)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}
