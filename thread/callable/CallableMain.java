package thread.callable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;

public class CallableMain {
	private static AtomicBoolean isStopReceive = new AtomicBoolean(false);
	private static LinkedBlockingDeque<Integer> link = new LinkedBlockingDeque<Integer>(10);
	public static void main(String[] args) {
		System.out.println(isStopReceive.getAndSet(true));
		System.out.println(isStopReceive.getAndSet(false));
		
		Thread thread1 = new Thread(new Runnable(){
			public void run(){
				for(int i=1;i<1000;i++){
					link.offer(i);
					try {
						Thread.sleep(1);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
				System.out.println("............end......");
			}
		});
		thread1.start();
		
		
		// TODO Auto-generated method stub
		ExecutorService executor = Executors.newFixedThreadPool(10);
		List<Future<String>> futrueList = new ArrayList<Future<String>>();
		CallalbeTask ctask = new CallalbeTask(link);
		for(int i=0;i<100;i++){
			Future<String> future =executor.submit(ctask);
			futrueList.add(future);
		}
		for(int i=0;i<futrueList.size();i++){
			try {
				System.out.println(futrueList.get(i).get());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		executor.shutdown();
		
	}

}
