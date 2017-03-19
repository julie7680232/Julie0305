package tw.org.iii;

public class Brad06 {//

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		final int b = 10;
		switch(a){
		
		  case 1:
			  System.out.println("A");
			  break;
		  case b-2:
			  System.out.println("B"); //case 不接受變數只能是常數;改籌final int b=0才可以;之後case b改成b-2也可以
			  break; //若沒有break;則會執行出B及C;到case100才break
		  case 100:
			  System.out.println("C");
			  break;
		  default:
			  System.out.println("D");
			  break;
			
		}
		
		
		
	}

}
