package Product;

public abstract class ProductCatalog {
	private String tittle;
	
	public ProductCatalog(String tittle) {
		this.tittle = tittle;
	}
	abstract public void print();

	public String getTittle() {
		return tittle;
	}

	public void setTittle(String tittle) {
		this.tittle = tittle;
	}
	
	
	
}
