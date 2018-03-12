package Product;

public class Book extends ProductCatalog{

	private String isbn;
	public Book(String isbn, String tittle) {
		super(tittle);
		this.isbn=isbn;
		// TODO Auto-generated constructor stub
	}
	
	public void print() {
		System.out.println("Book title " + getTittle());
	}

	
}
