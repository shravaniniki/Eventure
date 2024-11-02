package MultiThreading;
class Printer{
	public void printFile(String fileName) {
		try {
			synchronized(this) {
				System.out.println("printer started printing file : "+fileName);
				Thread.sleep(1400);
				System.out.println("printer completed printing file : "+fileName);
			}
		}catch(Exception e) {
			System.out.println("Exception : "+e.getMessage());
			e.printStackTrace();
		}
	}
}
class PrinterFactory{
	private static Printer printer;
	public static Printer getPrinter() {
		if(printer == null) {
			printer = new Printer();
		}
		return printer;
	}
}

class Lappy extends Thread{
	private String fileName;
	private static Printer printer;
	
	static {
		printer = PrinterFactory.getPrinter();
	}

	public Lappy(String fileName) {
		super();
		this.fileName = fileName;
	}
	public void run() {
		printer.printFile(fileName);
	}
	
}
public class PrinterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lappy lappy1=new Lappy("Hello.txt");
		lappy1.start();
		Lappy lappy2=new Lappy("Hi.txt");
		lappy2.start();
		Lappy lappy3=new Lappy("Bye.txt");
		lappy3.start();
	}

}
