
public class Boba extends Thread {
    private final int threadId;
    Straw bobaStraw;
	
	Boba(Straw s, int threadId){
		//TODO: Implement function
	}
	
	public void run() {
		//TODO: Complete Function   
		for (int i = 0; i < 3; i++) {
			int x =(int)(Math.random()*100);
			Thread.sleep(x);

		}
	}
}
