import java.util.Scanner;
import java.util.regex.Pattern;

public class CheckValidIpAddress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an IP address: ");
        String ip = scanner.next();
        String [] ipParts = (ip.split(":"));
        StringBuilder ipaddress = new StringBuilder();
        for(String ipPart : ipParts)
        {
             int val = Integer.parseInt(ipPart);
             ipaddress.append(val);
        }

        String ipRegex = "([1-9][0-9]{0,2}):([0-9]{1,3}):([0-9]{1,3}):([0-9]{1,3})";
        if(Pattern.matches(ipRegex,ipaddress))
        {
            System.out.println("Valid IP");
        }
        else
        {
            System.out.println("Invalid IP");
        }

    }
}
