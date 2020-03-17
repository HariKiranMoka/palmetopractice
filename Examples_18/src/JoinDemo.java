
class Hello extends Thread 
{
	@Override
	public void run() 
	{
		for(int i=1;i<=100;i++)
		{
		System.out.println("hello");
		 
		try
		{
			sleep(2000);
		}
		catch(InterruptedException e)
		{
			
		}
	}
	    	}
}
class Hello1 implements Runnable
{
	public void run()
	{
		for(int i=1;i<=105;i++)
		System.out.println("this is runnable");
	}
}
public class JoinDemo {

	public static void main(String[] args) {
		Hello t=new Hello();
		Hello1 h=new Hello1();
		Thread t2=new Thread(h);
		Runnable r=()->{for(int i=1;i<=100;i++)
			System.out.println("this is lanmbda");};
			Thread t3=new Thread(r);
			t3.start();
			t.start();
			t2.start();
			t3.yield();
		
		//t.join();
		for(int i=101;i<250;i++)
		System.out.println("main");

	}

}
