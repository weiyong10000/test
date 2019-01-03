package thread;

public class Count {
   	private  int count =0;
	public synchronized void addCout(){
		for(int i=0;i<10;i++){
			count++;
		}
		System.out.println(Thread.currentThread().getName()+"-" +count);
	}

}
