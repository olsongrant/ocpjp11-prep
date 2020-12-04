package functional;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Book {
	
	private String title;
	private String author;
	private Double price;
	
	private Book(String a, String t, Double p) {
		this.author = a;
		this.title = t;
		this.price = p;
	}
	
	public static Book of(String author, String title, Double price) {
		return new Book(author, title, price);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public static void main(String[] args) {
		System.out.printf("Size of book list: %d", Book.sampleBookList().size());
		Integer numberOver10Bucks = Book.sampleBookList().stream().collect(
				Collectors.collectingAndThen(
				Collectors.filtering(
						b->b.getPrice()>10.0, 
						Collectors.toList()), 
						aList->aList.size()));
		System.out.println();
		System.out.println("the numberOver10Bucks: " + numberOver10Bucks);
		DoubleSummaryStatistics stats = Book.sampleBookList().stream()
				.collect(Collectors.summarizingDouble(b->b.getPrice()));
		System.out.println(stats);
	}
	
	public static List<Book> sampleBookList() {
		List<Book> l = new ArrayList<>();
		l.add(Book.of("Michelle Obama", "Becoming", 17.95));
		l.add(Book.of("Sun Tzu", "The Art of War", 8.95));
		l.add(Book.of("Barack Obama", "Promised Land", 21.95));
		l.add(Book.of("Dan Rather", "Patriotism", 15.45));		
		return l;
	}

}
