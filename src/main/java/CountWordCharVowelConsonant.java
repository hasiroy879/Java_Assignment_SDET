import java.util.Scanner;

public class CountWordCharVowelConsonant {
    public static void main(String[] args) {
        int i,words=0, characters=0,vowels=0;
       // Scanner scanner= new Scanner(System.in);
       // System.out.println("Enter a string : ");
       // String str = scanner.nextLine();
        //  System.out.println(str);
        String str = "I am a SQA Engineer";
        String[] str1 = str.split(" ");
        System.out.println("Words:  "+str1.length);

        char [] str2 = str.toCharArray();
        for(i=0;i<str.length();i++)
        {
            if(str2[i]!='\0')
            {
                characters++;
            }
        }
        int FinalCharacters = characters- str1.length+1;
        System.out.println("Chars:  "+FinalCharacters);

        for(i=0;i< str.length();i++)
        {
            if(str2[i]=='a'||str2[i]=='e'||str2[i]=='i'||str2[i]=='o'||str2[i]=='u'||
                    str2[i]=='A'||str2[i]=='E'||str2[i]=='I'||str2[i]=='O'||str2[i]=='U')
            {
                vowels++;
            }

        }
        System.out.println("Vowels:  "+vowels);
        System.out.println("Consonant:  "+(FinalCharacters-vowels));
    }
}
