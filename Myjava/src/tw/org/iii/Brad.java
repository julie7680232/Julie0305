package tw.org.iii;

public class Brad {//
	int a;
	static int b;                      //������
	{                      
		a = 100;
		System.out.println("{}:a=" + a);         //�]�p�b���O��.�٫����϶�  
	}                                            //a���ȥ��ӴN���F,�b�غc�����e
	static{
		System.out.println("static{}");       //static ������,�u����@��
	}
	
	
	Brad(){                               //�@�}�l�����A,�@��new���N������
		System.out.println("Brad()");
	}

}
