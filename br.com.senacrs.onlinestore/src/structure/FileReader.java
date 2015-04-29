package structure;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {
	
	public void readCSV () throws FileNotFoundException 
	{
		
		/* Creates scanner that will read the CSV file. */
		Scanner reader = new Scanner (new File("C:\\Users\\631320019\\OnlineStore\\br.com.senacrs.onlinestore\\src\\files\\arquivocsv.csv"));
		
		/* 
		 * Set the delimiter which will be used to separate 
		 * the information from the file. 
		 */
		reader.useDelimiter(setDelimiter(" - "));
		
		
		/* 
		 * The reader will go through the file until it have read
		 * all the file. 
		 */
		while (reader.hasNext()) {
			
			System.out.print(reader.next() + "-");
			//TODO: Code the method do add the information to a list
		}
		
		reader.close();
		
	}
	
	/* 
	 * Receive a String input that will be used as the delimiter
	 * to separate the information from the file.
	 */
	
	public String setDelimiter (String delimiter) 
	{
		return delimiter;
	}
	
	
	

}
