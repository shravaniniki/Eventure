package MultiThreading;


class MedicalShop{
	private static int stock;
	private boolean flag=false; //assuming that there is no stock
	
	public synchronized void produceStock(int stock) {
		try {
			if(flag) {
				wait();
			}else {
				notify();
			}
		
		this.stock=stock;
		System.out.println("producer produced stock: "+ stock);
		flag=true;
		}catch(Exception e) {
			System.out.println("Exception is: "+e.getMessage());
		}
	}
	public synchronized void consumerStock() {
		try {
			if(flag==false) {
				wait();
			}else {
				notify();
			}
		
		System.out.println("consumer consumed stock: "+ stock);
		stock=0;
		flag=false;
		}catch(Exception e) {
			System.out.println("Exception is: "+e.getMessage());
		}
	}
}

class ShopFactory{
	private static MedicalShop shop;
	
	public static MedicalShop getShop() {
		if(shop==null) {
			shop=new MedicalShop();
		}
		return shop;
	}
}
class Producer extends Thread{
	private MedicalShop shop;
	public Producer() {
		this.shop=ShopFactory.getShop();
	}
	public void run() {
		
			try {
				for(int i=1;i<=10;i++) {
					shop.produceStock(i);
				Thread.sleep(2000);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("Exception : "+e);
				e.printStackTrace();
			}
		
	}
}

class Consumer extends Thread{
	private MedicalShop shop;
	public Consumer() {
		this.shop=ShopFactory.getShop();
	}
	public void run() {
	try {
		for(int i=1;i<=10;i++) {
			shop.produceStock(i);
		Thread.sleep(500);
		}
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		System.out.println("Exception : "+e);
		e.printStackTrace();
	}
}
}
public class InterThreadCommunication {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Producer p1=new Producer();
		p1.start();
		Thread.sleep(200);
		Consumer c1=new Consumer();
		c1.start();

	}

}
