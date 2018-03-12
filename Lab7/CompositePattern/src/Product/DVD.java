package Product;

public class DVD extends ProductCatalog{

	public DVD(String tittle) {
		super(tittle);
		// TODO Auto-generated constructor stub
	}

	public void print() {
		System.out.println("DVD title: " + getTittle());
	}
	

}
