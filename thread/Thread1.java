package thread;

public class Thread1 implements Runnable{
	int x =0;
	String name;
	public Thread1(String name){
		this.name = name;
		System.out.println(name);
	}

	public void run(){
		for(int i=0;i<10;i++){
			x ++;
			System.out.println(name+x);
		}
	}

}
