import java.util.Random;
public class GenerateRandomPassword {
    public static void main(String[] args) {
        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String specialChar = "!@#$%^&*()_+{}[]|;:'/?<>,.";
        String allChars = upperCase+lowerCase+digits+specialChar;
        char [] Chars = allChars.toCharArray();
        Random random = new Random();
        StringBuilder password = new StringBuilder();
        password.append(upperCase.charAt(random.nextInt(upperCase.length())));
        password.append(lowerCase.charAt(random.nextInt(lowerCase.length())));
        password.append(digits.charAt(random.nextInt(digits.length())));
        password.append(specialChar.charAt(random.nextInt(specialChar.length())));
        for(int i=4;i<8;i++)
        {
            int index = random.nextInt(Chars.length);
            char ch = Chars[index];
            //System.out.println(ch);
            password.append(ch);
        }
       // System.out.println(password);
       //swap index
        char [] password1 = password.toString().toCharArray();
        for(int i=0;i<password1.length;i++)
        {
            int index1 = random.nextInt(password1.length);
            char temp = password1[i];
            password1[i]=password1[index1];
            password1[index1]=temp;
        }
        System.out.println(password1);

    }
}
