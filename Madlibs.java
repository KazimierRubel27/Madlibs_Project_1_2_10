import java.util.Scanner;
public class Madlibs
{
    public static void main(String[] args) 
    {
        //Creates active madlib and stores the extra 2
        String activeMadlib = "I went to the animal <noun>, the <plural_noun> and the <number> beasts were there.";
        //activeMadlib = "Once upon a time in a <adjective> land, a <noun> <adverb> grew.";
        //activeMadlib = "I once knew a <noun> with many pet <plural noun> that were <adjective>";
        //Creates madlib scanner
        Scanner madlibInput = new Scanner(System.in);
        //finds location of all filler words 
        int firstOpen = activeMadlib.indexOf("<");
        int firstClose = activeMadlib.indexOf(">");
        int secondOpen = activeMadlib.indexOf("<", firstClose+ 1);
        int secondClose = activeMadlib.indexOf(">", firstClose + 1);
        int thirdOpen = activeMadlib.indexOf("<", secondClose + 1);
        int thirdClose = activeMadlib.indexOf(">", secondClose + 1);
        //asks user for replacements for filler words
        System.out.println("Enter a " + activeMadlib.substring(firstOpen + 1, firstClose));
        String madlibOne = madlibInput.nextLine();
        System.out.println("Enter a " + activeMadlib.substring(secondOpen + 1, secondClose));
        String madlibTwo = madlibInput.nextLine();
        System.out.println("Enter a " + activeMadlib.substring(thirdOpen + 1, thirdClose));
        String madlibThree = madlibInput.nextLine();
        //concat the different user answers and the already in place madlib
        String completeMadlib = activeMadlib.substring(0, firstOpen) + madlibOne + activeMadlib.substring(firstClose + 1, secondOpen) + madlibTwo + activeMadlib.substring(secondClose + 1, thirdOpen) + madlibThree + activeMadlib.substring(thirdClose + 1);
        //print out the users completed madlib
        System.out.println("Your complete mad lib is: " + completeMadlib);
        madlibInput.close();
        

        

    }
}