package structure;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import model.Book;
import model.DVD;
import model.Item;

public class FileReader {

	public void readCSV (DoublyLinkedList list) throws FileNotFoundException 
	{

		/* Creates scanner that will read the CSV file. */
		Scanner reader = new Scanner (new File("src/files/dados.txt"));

		/* 
		 * Set the delimiter which will be used to separate 
		 * the information from the file. 
		 */
		
		

		/* 
		 * The reader will go through the file until it have read
		 * all the file. 
		 */
		while (reader.hasNext()) {
			
			/* */
			
			int code = 0;

			//System.out.print(reader.next() + " ");
			
			//TODO: Code the method do add the information to a list

			/* Split the fields of the current line being read to add 
			 * them to their respective attributes equivalents */
			
			String[] lineContent = reader.next().split(";");
			System.out.println(lineContent[0]);
			

			/* Check the item type and add the line content to a list 
			 * according to the type read. */
			
			
			
			if (lineContent[0].startsWith("livro")) 
			{
				code++;
				Book book = new Book (code, null, lineContent[1], 0);
				list.addFirst(book);

			} 
			else if (lineContent[0].startsWith("dvd")) 
			{
				code++;
				DVD dvd = new DVD (code, null, lineContent[1], 0);
				list.addFirst(dvd);

			}
			
			
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
