package thread.callable;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;
public class CallalbeTask implements Callable<String>{
	LinkedBlockingDeque<Integer> link = null;
	public CallalbeTask(LinkedBlockingDeque<Integer> link){
		this.link = link;
	}
	@Override
	public String call(){
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return String.valueOf(link.poll());
	}

}
