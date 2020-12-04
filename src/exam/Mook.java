package exam;

import java.util.function.DoubleSupplier;

public class Mook {

    private String title;
    private Double price;
    public Mook(String title, Double price){
        this.title = title;
        this.price = price;
    }
    //accessor methods not shown


	public static void main(String[] args) {
		Mook b1 = new Mook("Java in 24 hrs", null);
		DoubleSupplier ds1 = b1::getPrice;
		System.out.println(b1.getTitle()+" "+ds1.getAsDouble());
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public Double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}

}
