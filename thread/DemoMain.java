package thread;

import org.junit.Test;

public class DemoMain {
@Test
	public void start() {
		// TODO Auto-generated method stub
//		Thread1 thread1 = new Thread1("threadone");
//		Thread1 thread2 = new Thread1("threadtwo");
//		new Thread(thread1).start();
//		new Thread(thread2).start();
//		Thread2 thread4 = new Thread2("threadfour");
//		Thread2 thread5 = new Thread2("threadfive");
//		new Thread(thread4).start();
//
//		thread5.start();

		Thread thrad1 = new Thread(new Runnable(){
			int i =1;
			@Override
			public void run(){
				do{
				
					i++;
					System.out.println(i);
				}while (i<10);
			}
		}
				
				);
		thrad1.start();
	}

}
