package thread;

public class Thread2 extends Thread{

	public Thread2(String name){
		System.out.println(name);
	}
	
	public void run(){
		for(int i=1;i<10;i++){
			System.out.println(i);
		}
	}
}
