package thread;

public class TestCountSafe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable runnable = new Runnable() {
		   Count count = new Count();
		   public void run(){
			   count.addCout();
		   }
		};
        for(int i = 0; i < 10; i++) {  
            new Thread(runnable).start();  
        }  


	}

}
