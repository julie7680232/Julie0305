package tw.org.iii;

public class test4 {

	public static void main(String[] args) {
		Runnable r= new Runnable(){
			public void run(){
				System.out.println("Cat");
			}
		}
		Thread t = new Thread(r){
			public void run(){
				System.out.println("Dog");
			}
		}
		t.start();
	}

}
