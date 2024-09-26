import java.util.Scanner;
public class Madlibs
{
    public static void main(String[] args) 
    {
        //Creates madlib scanner
        Scanner madLibInput = new Scanner(System.in);
        //Ask user for first madlib
        System.out.println("Enter a verb ");
        String verbOne = madLibInput.nextLine();
        System.out.println("Your madlib is: " + verbOne);
        String activeMadLib = "I went to the animal <noun>, the <plural_noun> and the <number> beasts were there.";
        //activeMadLib = "Once upon a time in a <adjective> land, a <noun> <adverb> grew.";

    }
}