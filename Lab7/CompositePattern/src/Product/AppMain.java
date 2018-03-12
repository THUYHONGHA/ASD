package Product;

public class AppMain {
	public static void main(String [] args){
		CategoryComposite computerBook=new CategoryComposite("ComputerBook");
		CategoryComposite umlBook=new CategoryComposite("UMLBook");		
		CategoryComposite javaDVD=new CategoryComposite("JavaDVD");
		
		Book book1=new Book("789", "UML 2 for beginners");
		Book book2=new Book("101", "UML essentials");
		DVD dvd3=new DVD("Java in 21 days");
		DVD dvd4=new DVD("Java generics");
		
		computerBook.addItems(umlBook);
		computerBook.addItems(javaDVD);
		umlBook.addItems(book1);
		umlBook.addItems(book2);
		javaDVD.addItems(dvd3);
		javaDVD.addItems(dvd4);
		
		computerBook.print();
	}
}
