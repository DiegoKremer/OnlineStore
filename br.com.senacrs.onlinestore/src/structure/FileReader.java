package structure;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import model.Book;

public class FileReader {

	public void readCSV (DoublyLinkedList list) throws FileNotFoundException 
	{

		/* Creates scanner that will read the CSV file. */
		Scanner reader = new Scanner (new File("src/files/dados.txt"));

		/* 
		 * Set the delimiter which will be used to separate 
		 * the information from the file. 
		 */

		reader.useDelimiter(";");



		/* 
		 * The reader will go through the file until it have read
		 * all the file. 
		 */
		while (reader.hasNext()) {

			/* Split the first field as the type of the current line being
			 * read and the rest will be set as the data. */

			String type = reader.next();
			String data = reader.nextLine();



			/* Check the item type and add the line content to a list 
			 * according to the type read. */


			if (type.equals("livro")) {
				list.addFirst(createBook(data));
			} 
			else {
				//list.addFirst(createDVD(data));
			}


		}

		reader.close();

	}

	private Book createBook(String data) {
		Scanner sc = new Scanner (data);
		sc.useDelimiter(";");
		String title = sc.next();
		String isbn = sc.next();
		Book b = new Book (0, null, title, 0, isbn);
		while(sc.hasNext()) {
			b.setAuthor(sc.next());
		}
		sc.close();
		return b;
	}

	/* 
	 * Receive a String input that will be used as the delimiter
	 * to separate the information from the file.
	 */

	public String setDelimiter (String delimiter) 
	{
		return delimiter;
	}

	/*
	 * while(arq.hasNext()) {
	 * 	String tipo = arq.next();
	 *	String dados = arq.nextLine();
	 *if(tipo.equals("livro") {
	 *	lista.insere(criaLivro(dados));
	 *else
	 *lista.insere(criaDVD(dados);
	 *
	 *
	 *Livro criaLivro(String dados) {
	 *	Scanner sc = new Scanner(dados);
	 *sc.setDelimiter(";");
	 *String titulo = sc.next();
	 *String isbn = sc.next();
	 *Livro l = new Livro (titulo, isbn)
	 *while(sc.hasNext())
	 *	l.addAuthor(sc.next())
	 *return l;
	 *}
	 *} 
	 * }
	 *  
	 *  */




}
