package tw.org.iii;

import javax.swing.JOptionPane;

public class brad03 {//
	public static void main(String[] args) {
	String input = 
			JOptionPane.showInputDialog("��J�~��"); 
		
		int Year =  Integer.parseInt(input);
		System.out.println( Year );
		
		if (Year % 4 == 0){
			System.out.println("�|�~");
			
			if(Year % 100 == 0){
				if(Year % 400 == 0){
					//29
					System.out.println("�|�~");
				}else{
					//28
					System.out.println("���|�~");
				}
			}else{
				//29
				System.out.println("�|�~");
			}
		}else{
			//28
			System.out.println("���|�~");
		}
		
		
		
	}

}
