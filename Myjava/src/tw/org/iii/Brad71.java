package tw.org.iii;
//���ں���UDP������:���{�������,�n���Ԥ@�U
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Brad71 {

	public static void main(String[] args) {
	while (true){  //�L�a�j��,���i�H�@������ʥ],���|�u����@��
		byte[] buf = new byte[1024];  //�ۤv�M�w�ǰe���j�p
		try{
			DatagramSocket socket = new DatagramSocket(8888);  //DatagramSocket�ƾڴ��y;�o�e�ݻP������port�n�ۦP
			DatagramPacket packet = new DatagramPacket(buf, buf.length);  //DatagramPacket�ƾګʥ] ;�����ʥ]���|���wIP��};DatagramPacket(byte[] buf, int length)
			socket.receive(packet);  //�Ѵ��y�q�ϥΪ̨��ئ���ʥ]
			socket.close();  //�Mio�[���@��,���}����
			//System.out.println("Receive OK:"+ packet.getAddress().getHostAddress());  //������|�L�X�ño���֫ʥ]�H����
			
			//���D���줰��ʥ]
			int len = packet.getLength();      //���D�ʥ]�j�p
			byte[] rdata = packet.getData();   //�إ�byte�}�C��J�ʥ]�������
			String urip = packet.getAddress().getHostAddress();   //�o��ʥ]�ӷ���IP��}
			System.out.println(urip + "=>" + new String(rdata,0,len));  
			// new String(rdata,0,len)���r��غc��,String(byte[] bytes, int offset, int length)=String(���,�r��_�l����(�Ϊ�l��),�r�����)
			
		}catch(Exception e){
			System.out.println(e.toString());
		}
		}
	}
}
