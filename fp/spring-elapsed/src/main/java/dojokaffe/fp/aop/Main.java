package dojokaffe.fp.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("elapsed-context.xml");
        MonitoredTask task = (MonitoredTask) context.getBean(MonitoredTask.class);
        task.executeTask();
	}
}
