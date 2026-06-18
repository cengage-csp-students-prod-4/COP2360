import java.io.File;
import java.util.Scanner;

public class FileSizeComparison
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
    
        System.out.print("Enter name of text file >> ");
        String textFileName = input.nextLine();

        System.out.print("Enter the name of the Word file >> ");
        String wordFileName = input.nextLine();

        File textFile = new File(textFileName);
        File wordFile = new File(wordFileName);

        long textSize = textFile.length();
        long wordSize = wordFile.length();

        double percent = ((double) textSize / wordSize) * 100;
        System.out.println(textFileName + " is " + textSize + " bytes long");
        System.out.println("The text file is " + percent + "% of the size of the word file");
        input.close();
        }
}