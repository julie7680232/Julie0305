package tw.org.iii;
//�����Ҧr���֤ߥ\��
public class TWId3 {
	private String id; //�ݩʺD�ҥΤp�g,//�ݤ��ݭn�Q�ʸ�,�O�_�i�Q���
	TWId3(String id){  //�غc���W�ٻPclass�ۦP 
		this.id = id;      
		// �p�GTWId3(String myid){id = myid;},�NTWId3(String myid)�令TWId3(String id),
		//id = myid�|����,�令this.id = id,��������this��id�����O  private String id, �����k�䪺id�����OTWId3(String id)
	}
	    //true => female(�k��);flase => male(�k��)
		boolean isFemale(){
			char gender = id.charAt(1); //gender(�ʧO)�������Ҧr������1�Ӧr��(���O��0�Ӧr��),A123456789 =>'1'
			//��id����this
			return  gender == '2';  //�^�ǬO�_��'2','2'���k��
		}
	static boolean isCheckOK(String id){  //�ˬd�����Ҧr��,��static�]�p�u�Υx�W�����Ҧr��,�u�ˬd�@��
		String  letters = "ABCDEFGHJKLMNPQRSTUVXYWZIO";  //�̺���ʬ줧�Ʀr���Ƕ�g�^��r������
		char f0 = id.charAt(0);   //��X��0�Ӧr��
		int n12 = letters.indexOf(f0) + 10; // �Y�O'Y' => 21+10 = 31 //��21�Ӧr��(�q��0�Ӧr���}�l��_)
		//indexOf(f0) => return�r�ꬰ�ĴX�r��(�q��0�r���}�l)
		int n1 = n12 / 10;  //�Y�O'Y',�h��31,31/10=3
		int n2 = n12 % 10;  //�Y�O'Y',�h��31,31%10=1  =>��20,21�C�Y�i�o�r��3�P1
		//int n3 = id.charAt(1);  //'1' =>ASCII  ,�]��n3�ݷ|�n�p��,�ҥH�w�q�����,�S��k�w�q���r��,�G�L�XASCII
		//System.out.println(n3);  //�ҥH�L�X�ӷ|�O49
		int n3 = Integer.parseInt(id.substring(1,2));  //Integer.parseInt:�Q�i����,substring�O��X��1��(2��1)���r��
		//substring(a,b)�O��Xa��b��1���r��
		int n4 = Integer.parseInt(id.substring(2,3));
		int n5 = Integer.parseInt(id.substring(3,4));
		int n6 = Integer.parseInt(id.substring(4,5));
		int n7 = Integer.parseInt(id.substring(5,6));
		int n8 = Integer.parseInt(id.substring(6,7));
		int n9 = Integer.parseInt(id.substring(7,8));
		int n10 = Integer.parseInt(id.substring(8,9));
		int n11 = Integer.parseInt(id.substring(9,10));
		int sum = n1*1+n2*9+n3*8+n4*7+n5*6+n6*5+n7*4+n8*3+n9*2+n10*1+n11*1;  //�����Ҧr���ˬd����,�Ѩ�����ʬ�
		return sum % 10 == 0;                                                //�����Ҧr���ˬd����,�Ѩ�����ʬ�
	}
		
	String getId(){  //�]��id�Q�ʸ�,�����s�Xid
		return id;
	}
}
