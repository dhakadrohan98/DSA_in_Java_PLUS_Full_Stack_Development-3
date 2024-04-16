package Java_collections;

public class Book implements Comparable<Book> {
	int id;
	String name, author, publisher;
	int quantity;

	public Book(int id, String name, String author, String publisher, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", publisher=" + publisher + ", quantity="
				+ quantity + "]";
	}

	@Override
	public int compareTo(Book b) {
		if (this.id > b.id)
			return 1;
		else if (this.id < b.id)
			return -1;
		else
			return 0;
	}
}
