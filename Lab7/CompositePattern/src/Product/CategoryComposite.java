package Product;

import java.util.ArrayList;
import java.util.Collection;

public class CategoryComposite extends ProductCatalog {

	public Collection<ProductCatalog> productList = new ArrayList<>();
	public CategoryComposite(String tittle) {
		super(tittle);
		// TODO Auto-generated constructor stub
	}

	public void addItems(ProductCatalog catalog) {
		productList.add(catalog);
	}

	@Override
	public void print() {
		System.out.println("Product category name: " + this.getTittle());
		for (ProductCatalog p : productList) {
			p.print();
		}

	}

	

}
