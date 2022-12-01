import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
   Used to test the BlankLinesRemover class.
*/
public class InputOutputFiles
{
   public static void main(String[] args) throws FileNotFoundException
   {
	  
	  Scanner input = new Scanner(System.in);
	  System.out.print("Please enter the path to open the input file for example C:\\Downloads\\lines.txt: ");
	  String In = input.next();
	  File inputFile = new File(In);
	  PrintWriter outputFile = new PrintWriter("/Users/jack/Documents/CS/CS-176L/outlines.txt");
	  
	  try 
	  {
		  Scanner in = new Scanner(inputFile);
		  while (in.hasNextLine()) {
			  String nex = in.nextLine();
			  System.out.println(nex);
			  outputFile.println(nex);
		  }
		  in.close();
	  }
	  catch (IOException exception)
	  {
		  System.out.print("File is not found please try again");
	  }
	  
      
      input.close();
      outputFile.close();
   }
}
