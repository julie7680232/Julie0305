package tw.org.iii;

public class Brad8 {//

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int month = (int)(Math.random()*12+1);  //1��~12�� ,�Y���[�W1�h�|��0��|�X�{default,�i�H�T�{�]�w���ܼƬO�_OK
		
		System.out.println(month);
		switch(month){
		  case 1:  case 3:  case 5:  case 7:   case 8:  case 10:   case 12:
			  System.out.println("31");
			  break;
		  case 2:
			  System.out.println("28"); 
			  break; 
		  case 4:  case 6:  case 9:  case 11:
			  System.out.println("30");
			  break;
		  default:  //�Y�\�bcase2�e��,�S��break,�h�����13,�|�L�Xdefault��28
			  System.out.println("default");
			  break;  //���@�w�n�g,�]���w�g�̫�
			  
		}
		
		
		
	}

}
