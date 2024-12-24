import java.util.Scanner;
public class BreakDownAmount {
    public static void main(String[] args) {
        int i, count;
        int [] notes = {1000,500,200,100,50,20,10,5,2,1};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an amount : ");
        int amount = scanner.nextInt();
        int [] countNotes = new int[notes.length];
        for(i=0;i<notes.length;i++)
        {
            if(amount>=notes[i]) {
                countNotes[i] = amount / notes[i];
                amount = amount % notes[i];
            }
        }
        for(i=0;i<notes.length;i++)
        {
            if(countNotes[i]>0)
            {
                System.out.println(notes[i]+" "+countNotes[i]);
            }

        }

    }
}
