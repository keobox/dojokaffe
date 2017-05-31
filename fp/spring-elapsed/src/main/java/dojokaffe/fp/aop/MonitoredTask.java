package dojokaffe.fp.aop;

public class MonitoredTask {

	public void executeTask()
	{
		try {
			System.out.println("task started");
			Thread.sleep(2000);
			System.out.println("task finished");
		} catch (InterruptedException e) {
			e.printStackTrace();

		}
	}
}
