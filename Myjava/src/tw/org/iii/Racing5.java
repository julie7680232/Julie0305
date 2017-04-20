package tw.org.iii;
//製作賽車跑道:執行緒例子(增加功能:有人第一名即不用跑了,停止遊戲)-2
/*執行後一直按Go!跑的速度會越來越快,因為第一次按Go!8台車在跑道上跑,再按一次Go!再另外8台車跑在第一次的跑道上跑,導致頻率一直累加,
因為程式跑很多次lanes[whichlane].setText(lanes[whichlane].getText()+ ">" ),此程式解決這部分,即它的狀態
*/
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

public class Racing5 extends JFrame{
	private JButton go;
	private JLabel [] lanes = new JLabel[8];   //宣告跑道為物件陣列,有8個跑道,初值為null(基本型別有初值,物件型別都是null);lane指跑道
	private Car[] cars = new Car[8];     //宣告8台車子
	private int rank;    //宣告名次
	private boolean isRunning ; //預設值為false,即車子沒有在跑
	
	public Racing5(){
		super("Racing Game");
		setLayout(new GridLayout(lanes.length+1,1)); // (lanes.length+1)指的是8個跑道再加上1顆按鈕(Go);GridLayout(int rows, int cols)
		
		go = new JButton("Go");add(go);
		for(int i=0;i<lanes.length; i++){
			JLabel lane = new JLabel((i+1) + ". ");   //宣告有8個標籤
			lanes[i] = lane;  //每條跑道都有自己對應之標籤,作陣列
			add(lane);  //在視窗中增加lane的畫面
		}
		
		go.addActionListener(new ActionListener() {   //按下Go!按鈕,會跑以下程式
			@Override
			public void actionPerformed(ActionEvent e) {
				go();
			}
		});
				
		setSize(800,480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private void go(){
//		總結:按下Go!後,若isRunning(為true)則車子開始跑則執行以下程式,但如果沒有isRunning(false)車子就不會跑,
//      使用者如果再按一次Go!會再新增另外8台車子在跑道上面跑,速度還是越來越快,和原本程式一樣,沒有解決此問題
//		isRunning =!isRunning;  //負負得正,此為true,即車子再跑
//		if(isRunning){  //假如isRunning(即車子在跑),再按下Go!則會再新增另外8台車子在跑道上面跑
//			rank = 1;
//			//多台車子
//			for(int i=0;i<lanes.length; i++){
//				lanes[i].setText((i+1) + ". ");
//				}
//			for(int i=0; i<cars.length; i++){
//				cars[i] = new Car(i);
//				}
//			for(int i=0; i<cars.length; i++){
//				cars[i].start();
//				}
//		}
		
		//車子沒有在跑的,才會有新的8台車子在跑道上面跑,一直重複按Go!不會影響原本的車子
		if(!isRunning){   //此!isRunning有可能為true,有可能為false,一開始按Go!因isRunning初始值為false,所以!isRunning負負得正,此為true,開始執行以下程式
			              //當已經按下Go!按鈕,則isRunning = true;所以第二次按Go!按鈕,則!isRunning為false,不會執行以下程式,故當車子跑完後,isRunning要回復到初始值,要再stopGame()寫isRunning = false;
			isRunning = true;
			rank = 1;
			//多台車子
			for(int i=0;i<lanes.length; i++){
				lanes[i].setText((i+1) + ". ");
				}
			for(int i=0; i<cars.length; i++){
				cars[i] = new Car(i);
				}
			for(int i=0; i<cars.length; i++){
				cars[i].start();
			}
		}
	}
	
	private void stopGame(){    
		for(Car car:cars){
			car.interrupt();  //車子提早結束
		}  
		isRunning = false;  //當車子跑完後,isRunning回復到初始值
	}
	
	private class Car extends Thread{   //會將車子寫程內部類別,方便存取外部類別的屬性和方法
		private int whichlane;  //為哪一個跑道
		Car(int lane){this.whichlane= lane;}  //車子對應跑道
		
		@Override
		public void run() {  
			for(int i=0; i<100; i++){     //車子跑的步數,i<100自己自訂 
				lanes[whichlane].setText(lanes[whichlane].getText()+ ">" );  //寫外部類別沒有辦法這樣使用,寫成內部類別,方便存取外部類別的屬性和方法
				//API:setText(String text):Defines the single line of text this component will display.
				//API:getText():Returns the text string that the label displays.回傳字串
				try {
					Thread.sleep(10+(int)(Math.random()*200));      
					//車子的速度隨機,(int)(Math.random()*200)的範圍為0~199,10+(int)(Math.random()*200)的範圍為10~209
				} catch (InterruptedException e) {  //因為interrupt,try catch會捕捉到例外,所以程式寫在例外{}
					//System.out.println(lane + ":OK");  //2.按stop會跑出例外,印出此列,需跳出迴圈,要提早結束,不執行QQ這列,有兩種方法
					return;   //3.方法2:方法的結束為return
				} 
			}
				lanes[whichlane].setText(lanes[whichlane].getText() + "==> WINNER" );  //QQ  //rank++指的是名次第一名,下一個第二名,...以此類推
				stopGame();
		}
	}
	
	public static void main(String[] args) {
		new Racing5();
	}
}
