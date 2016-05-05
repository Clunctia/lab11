package tasktimer;

public class StopWatch {
	private long startTime;
	private long stopTime;
	private boolean running;
	
	public StopWatch() {
		startTime = 0;
		stopTime = 0;
		running = false;
	}
	
	public void start() {
		startTime = System.nanoTime();
		running = true;
	}
	
	public void stop() {
		stopTime = System.nanoTime();
		running = false;
	}
	
	public double getElapsed() {
		return (stopTime - startTime);
	}
}
