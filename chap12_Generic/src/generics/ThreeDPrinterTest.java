package generics;

public class ThreeDPrinterTest {

	public static void main(String[] args) {

		ThreeDPrinter<Powder> printer = new ThreeDPrinter<Powder>();

		printer.setMaterial(new Powder());

		Powder powder = printer.getMaterial();
		
		System.out.println(printer);
		
		
		ThreeDPrinter<Plastic> pp = new ThreeDPrinter<Plastic>();

		pp.setMaterial(new Plastic());

		Plastic p = pp.getMaterial();
		
		System.out.println(pp);
	}
}
