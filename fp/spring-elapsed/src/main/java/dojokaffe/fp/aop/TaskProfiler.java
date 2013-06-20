package dojokaffe.fp.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class TaskProfiler {

    public void elapsed(ProceedingJoinPoint joinpoint) {
        try {
            long start = System.currentTimeMillis();

            joinpoint.proceed(); 

            long end = System.currentTimeMillis(); 
            System.out.println("Elapsed time " + (end - start) + " milliseconds.");
        } catch (Throwable t) {
            System.out.println("Error"); 
        }
    }
}
