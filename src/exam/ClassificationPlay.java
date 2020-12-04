package exam;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Book { 
	
	public String toString() {
		return this.getTitle();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	private int id; 
	private String title; 
	private String genre; 
	private String author; 
	private double price;  
	
	public Book(String aTitle, String aGenre, String anAuthor) {
		this.title = aTitle;
		this.genre = aGenre;
		this.author = anAuthor;
	}
	//constructors and accessors not shown }
}

public class ClassificationPlay {

	public static void main(String[] args) {
		List<Book> books = Arrays.asList(
				new Book("There is a hippy on the highway", "Thriller", "James Hadley Chase"), 
			    new Book("The Client", "Thriller", "John Grisham"),
			    new Book("Gone with the wind", "Fiction", "Margaret Mitchell"),
			    new Book("Another Title", "Fiction", "Margaret Mitchell"));
				
		Map<String, Map<String, List<Book>>> classified = null; 
		classified = books.stream().collect(Collectors.groupingBy(
			//x->x.getGenre(), Collectors.groupingBy(x->x.getAuthor()) //this is fine as well.        
			Book::getGenre, Collectors.groupingBy(Book::getAuthor) )); 
		    System.out.println(classified);

	}

}
